package com.atguigu.controller;

import com.atguigu.bean.*;
import com.atguigu.service.SkuService;
import com.atguigu.service.SpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by luwan on 2018/3/30.
 */
@Controller
public class ItemController {

    @Autowired
    private SkuService skuService;

    @Autowired
    private SpuService spuService;

    @RequestMapping("goto_sku_detail")
    public String goto_sku_detail(int sku_id, int spu_id, ModelMap map,HttpSession session) {
        //根据skuid商品详情
        MallSkuDetailVO objsku=skuService.getSkudetailByid(sku_id);

        // 查询同spu下的相关的其他sku信息
        List<TMallSku> list_sku = skuService.getSkuListBySpu(spu_id);
        //根据商品的id查询出来他对应的的颜色和版本

        ColorVersionVO colorVersionVO=spuService.getColorAndVersionBySpu(spu_id);

        map.put("objsku",objsku);
        map.put("colorVersionVO",colorVersionVO);
        map.put("list_sku",list_sku);
        TMallUserAccount userAccount = (TMallUserAccount) session.getAttribute("userAccount");
        map.put("user",userAccount);
        return "skuDetail";
    }


}
