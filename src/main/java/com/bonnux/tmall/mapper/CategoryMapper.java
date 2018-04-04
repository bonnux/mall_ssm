package com.bonnux.tmall.mapper;

import com.bonnux.tmall.pojo.Category;
import com.bonnux.tmall.util.Page;

import java.util.List;

public interface CategoryMapper {
    public List<Category> list(Page page);

    public int total();
}