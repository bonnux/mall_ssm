package com.bonnux.tmall.service.impl;
import com.bonnux.tmall.pojo.Category;
import com.bonnux.tmall.mapper.CategoryMapper;
import com.bonnux.tmall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CategoryServiceImpl  implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;
    public List<Category> list(){
        return categoryMapper.list();
    };

}