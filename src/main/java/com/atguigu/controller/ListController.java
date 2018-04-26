package com.atguigu.controller;

import com.atguigu.bean.MallSkuVO;
import com.atguigu.bean.ModelMallAttr;

import com.atguigu.bean.TMallpojo;
import com.atguigu.service.ListService;
import com.atguigu.utils.MyHttpGetUtil;
import com.atguigu.utils.MyJsonUtil;
import com.atguigu.utils.MyPropertiesUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by luwan on 2018/3/29.
 */
@Controller
public class ListController {
    private static final Logger logger = Logger.getLogger(ListController.class);
    @Autowired
    private ListService listService;

    @RequestMapping("keywords")
    public String keywords(String keywords,ModelMap map){
        //调用关键字查询接口
        String htttp_keywords_url = MyPropertiesUtil.getMyProperty("constant.properties", "htttp_keywords_url");
        String  doGet="";
        try {
            doGet = MyHttpGetUtil.doGet(htttp_keywords_url+"?keywords="+keywords);
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<TMallpojo> tMallpojos = MyJsonUtil.json_to_list_nodecod(doGet, TMallpojo.class);
        map.put("listsku",tMallpojos);
        return "search";
    }

    @RequestMapping("get_list_by_attr")
    public String get_list_by_attr(ModelMallAttr modelMallAttr, @RequestParam("flbh2") Integer flbh2, ModelMap map) {

        List<MallSkuVO> listsku = listService.getSkuByAttrValue(modelMallAttr.getListattrvalue(), flbh2);
        map.put("listsku", listsku);
        return "skuList";
    }

}
