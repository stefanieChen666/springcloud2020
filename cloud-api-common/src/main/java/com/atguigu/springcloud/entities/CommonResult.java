package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: cloud2020
 * @author: Miss.CHEN
 * @create: 2020-03-30 20:33
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>
{
    private Integer  code;
    private String message;
    private  T data;

    public CommonResult(Integer code, String message)
    {
        this(code,message,null);
    }
}
