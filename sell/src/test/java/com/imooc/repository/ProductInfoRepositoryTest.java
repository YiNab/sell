package com.imooc.repository;

import com.imooc.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;
   @Test
    public void save(){
       ProductInfo productInfo = new ProductInfo();
       productInfo.setProductId("123456");
       productInfo.setProductName("银耳莲子粥");
       productInfo.setProductPrice(new BigDecimal(2.5));
       productInfo.setProductStock(100);
       productInfo.setProductDescription("补充胶原蛋白，对皮肤美美的");
       productInfo.setProductIcon("http://xxxx.jpg");
       productInfo.setProductStatus(0);
       productInfo.setCategoryType(2);
       ProductInfo result= repository.save(productInfo);
       Assert.assertNotNull(result);
    }

    @Test
    public void findByProductStatus() throws Exception {
        List<ProductInfo> productInfoList = repository.findByProductStatus(0);
        Assert.assertNotEquals(0,productInfoList.size());
    }

}