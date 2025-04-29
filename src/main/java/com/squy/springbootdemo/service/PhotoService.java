package com.squy.springbootdemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.squy.springbootdemo.entity.Photo;

import java.util.List;

public interface PhotoService extends IService<Photo> {
    public void add(Photo photo);

    public void del(Integer id);

    public boolean update(Integer id, Photo photo);

    public List<Photo> findAll();

    public Photo findById(Integer id);
}
