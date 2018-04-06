package com.bonnux.tmall.mapper;

import com.bonnux.tmall.pojo.Category;
import com.bonnux.tmall.util.Page;

import java.util.List;

public interface CategoryMapper {

    List<Category> list(Page page);

    int total();
}