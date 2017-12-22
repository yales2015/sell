package com.imooc.service;

import com.imooc.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;

/**
 * Created by yy on 2017/9/3.
 */
public interface ProductInfoService {

    ProductInfo findOne(String productId);

    Page<ProductInfo> findAll(Pageable pageable);

    /**
     * 查询所有上架的商品
     * @return
     */
    List<ProductInfo> findUpAll();

    ProductInfo save(ProductInfo productInfo);

    //加库存

    //减库存
}
