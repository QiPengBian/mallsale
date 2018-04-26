package com.atguigu.service.impl;

import com.atguigu.bean.ColorVersionVO;
import com.atguigu.bean.TMallProduct;
import com.atguigu.bean.TMallProductExample;
import com.atguigu.mapper.TMallProductImageMapper;
import com.atguigu.mapper.TMallProductMapper;
import com.atguigu.service.SpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by luwan on 2018/3/23.
 */
@Service
public class SpuServiceImpl implements SpuService {

    @Autowired
    private TMallProductMapper tMallProductMapper;

    @Autowired
    private TMallProductImageMapper tMallProductImageMapper;

    @Override
    public void insertProduct(List<String> list_image, TMallProduct spu, String index) {
        //插入spu商品信息
        if(!index.isEmpty()){
            spu.setShpTp(list_image.get(Integer.valueOf(index)));
        }else{
            spu.setShpTp(list_image.get(Integer.valueOf(0)));
        }

        spu.setChjshj(new Date());
        tMallProductMapper.insertProduct(spu);
        //根据主键插入商品图片信息
        Map<Object,Object> mp=new HashMap<>();

        mp.put("list_image",list_image);

        mp.put("shpId",spu.getPpId());

        tMallProductImageMapper.insertListImage(mp);
    }

    @Override
    public List<TMallProduct> get_spu_list(Integer pp_id, Integer flbh2) {
      /*  Map<Object, Object> map = new HashMap<Object, Object>();
        map.put("pp_id", pp_id);
        map.put("flbh2", flbh2);
        List<TMallProduct> list_spu = tMallProductMapper.select_spu_list(map);*/
        TMallProductExample example=new TMallProductExample();

        TMallProductExample.Criteria criteria = example.createCriteria();

        criteria.andPpIdEqualTo(pp_id);
        criteria.andFlbh2EqualTo(flbh2);
        List<TMallProduct> list = tMallProductMapper.selectByExample(example);
        return list;
    }

    @Override
    public ColorVersionVO getColorAndVersionBySpu(int spu_id) {
        Map mp=new HashMap();
        mp.put("shpid",spu_id);
        ColorVersionVO colorVersionVO=tMallProductMapper.selectColorAndVersionBySpu(mp);
        return colorVersionVO;
    }
}
