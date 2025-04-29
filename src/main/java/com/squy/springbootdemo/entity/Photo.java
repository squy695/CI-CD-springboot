package com.squy.springbootdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("photo")
public class Photo {
    @TableId(value = "id",type = IdType.AUTO)
    private int id;
    private int ownerId;
    private String url;
}
