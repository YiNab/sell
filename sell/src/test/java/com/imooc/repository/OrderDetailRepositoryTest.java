package com.imooc.repository;

import com.imooc.dataobject.OrderDetail;
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
public class OrderDetailRepositoryTest {


    @Autowired
    private OrderDetailRepository repository;


    @Test
    public void saveTest(){
        OrderDetail orderDetail=new OrderDetail();
        orderDetail.setDetailId("1234567811");
        orderDetail.setOrderId("123458");
        orderDetail.setProductId("123456");
        orderDetail.setProductName("银耳莲子粥");
        orderDetail.setProductPrice(new BigDecimal(5.5));
        orderDetail.setProductIcon("http:xxx.jpg");
        orderDetail.setProductQuantity(3);
        OrderDetail result = repository.save(orderDetail);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByOrOrderId() throws Exception {
        List<OrderDetail> orderDetailList = repository.findByOrOrderId("123457");
        Assert.assertNotEquals(0, orderDetailList.size());
    }

}