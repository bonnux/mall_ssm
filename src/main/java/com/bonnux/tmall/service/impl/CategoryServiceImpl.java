package com.bonnux.tmall.service.impl;

import com.bonnux.tmall.pojo.Category;
import com.bonnux.tmall.mapper.CategoryMapper;
import com.bonnux.tmall.service.CategoryService;
import com.bonnux.tmall.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public List<Category> list(Page page){
        return categoryMapper.list(page);
    };

    @Override
    public int total(){
        return categoryMapper.total();
    }

}