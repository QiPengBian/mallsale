package com.atguigu.controller;

import com.atguigu.bean.MallAttrVO;
import com.atguigu.bean.MallSkuVO;
import com.atguigu.service.AttrServiceInf;
import com.atguigu.service.ListService;
import com.atguigu.utils.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import redis.clients.jedis.Jedis;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by luwan on 2018/3/28.
 */
@Controller
public class IndexController {
    private static final Logger logger = Logger.getLogger(IndexController.class);
    @Autowired
    private AttrServiceInf attrServiceInf;

    @Autowired
    private ListService listService;
    
    @RequestMapping("index")
    public String index(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie:cookies) {
            if(CookieUtils.isUserNameCookie(cookie.getName())){

                logger.info(CommonUtil.decode(cookie.getValue()));
            }
        }
        return "index";
    }

    @RequestMapping("goto_list")
    public String goto_list(@RequestParam("flbh2") Integer flbh2, ModelMap map){
        //flbh2属性的集合
        List<MallAttrVO> mallAttrVOS = attrServiceInf.asttrServiceInf(flbh2);
        //flbh2商品列表
        List<MallSkuVO> listsku;
        // 缓存检索
        String key = "class_2_" + flbh2;

       /* List<MallSkuVO> list = MyCacheUtil.getList(key, MallSkuVO.class);
        if(list==null||list.size()<1){
            listsku =listService.getListbyflbh2(flbh2);
            //同步redis数据
            for (int i=0;i<listsku.size();i++){
                Jedis jedis = JedisPoolUtils.getJedis();
                jedis.zadd(key,i, MyJsonUtil.object_to_json(listsku.get(i)));
            }

        }else{
            listsku = MyCacheUtil.getList(key, MallSkuVO.class);
        }
*/
        listsku =listService.getListbyflbh2(flbh2);

        map.put("flbh2",flbh2);
        map.put("listsku",listsku);
        map.put("mallAttrVOS",mallAttrVOS);
        return "list";
    }


    @RequestMapping("goto_login")
    public String goto_login(HttpSession session){
        String id = session.getId();

        return "login";
    }

    @RequestMapping("goto_login_redict")
    public String goto_login_redict(){

        return "checklogin";
    }
}
