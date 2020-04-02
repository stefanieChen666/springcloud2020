package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @program: cloud2020
 * @author: Miss.CHEN
 * @create: 2020-03-30 20:47
 **/
@Mapper
public interface PaymentDao
{
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);

}
