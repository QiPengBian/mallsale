package com.atguigu.service;

import com.atguigu.bean.ColorVersionVO;
import com.atguigu.bean.TMallProduct;

import java.util.List;

/**
 * Created by luwan on 2018/3/23.
 */
public interface SpuService {


    public void insertProduct(List<String> list_image, TMallProduct spu, String index);

    List<TMallProduct> get_spu_list(Integer pp_id, Integer flbh2);

    ColorVersionVO getColorAndVersionBySpu(int spu_id);
}
