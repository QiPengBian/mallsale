package com.atguigu.service.impl;

import com.atguigu.bean.MallSkuVO;
import com.atguigu.bean.TMallSkuAttrValue;
import com.atguigu.mapper.ListMapper;
import com.atguigu.service.ListService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by luwan on 2018/3/28.
 */
@Service
public class ListServiceImpl implements ListService {

    @Autowired
    private ListMapper listMapper;

    @Override
    public List<MallSkuVO> getListbyflbh2(Integer flbh2) {
        return listMapper.getListbyflbh2(flbh2);
    }

    @Override
    public List<MallSkuVO> getSkuByAttrValue(List<TMallSkuAttrValue> listattrvalue, Integer flbh2) {
        StringBuffer subSql = new StringBuffer("");

        // 根据属性集合动态拼接条件过滤的sql语句
        subSql.append(" and sku.id in ( select sku0.sku_id from ");

        if (listattrvalue != null && listattrvalue.size() > 0) {
            for (int i = 0; i < listattrvalue.size(); i++) {
                subSql.append(
                        " (select sku_id from t_mall_sku_attr_value where shxm_id = " + listattrvalue.get(i).getShxmId()
                                + " and shxzh_id = " + listattrvalue.get(i).getShxzhId() + ") sku" + i + " ");
                if ((i + 1) < listattrvalue.size() && listattrvalue.size() > 1) {
                    subSql.append(" , ");
                }
            }

            if (listattrvalue.size() > 1) {
                subSql.append(" where ");

                for (int i = 0; i < listattrvalue.size(); i++) {
                    if ((i + 1) < listattrvalue.size()) {
                        subSql.append(" sku" + i + ".sku_id=" + "sku" + (i + 1) + ".sku_id");

                        if(listattrvalue.size()>2&&i  < (listattrvalue.size()- 2)){
                            subSql.append(" and ");
                        }
                    }
                }
            }

        }

        subSql.append(" ) ");
        if(listattrvalue == null){
            subSql.setLength(0);
            subSql = new StringBuffer("");
        }

        HashMap map = new HashMap();
        map.put("listattrvalue", listattrvalue);
        map.put("flbh2", flbh2);
        map.put("subSql", subSql.toString());
        return listMapper.selectSkuByAttrValue(map);
    }
}
