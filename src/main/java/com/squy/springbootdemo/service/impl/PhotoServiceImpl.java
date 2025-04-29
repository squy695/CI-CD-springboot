package com.squy.springbootdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.squy.springbootdemo.entity.Photo;
import com.squy.springbootdemo.mapper.PhotoMapper;
import com.squy.springbootdemo.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PhotoServiceImpl extends ServiceImpl<PhotoMapper, Photo> implements PhotoService {

    @Autowired
    PhotoMapper photoMapper;

    @Override
    public void add(Photo photo) {
        photoMapper.insert(photo);
    }

    @Override
    public void del(Integer id) {
        photoMapper.deleteById(id);
    }

    @Override
    public boolean update(Integer id,Photo photo) {
        photoMapper.updateById(photo);
        return false;
    }

    @Override
    public List<Photo> findAll() {
        return photoMapper.selectList(null);
    }

    @Override
    public Photo findById(Integer id) {
        return photoMapper.selectById(id);
    }
}
