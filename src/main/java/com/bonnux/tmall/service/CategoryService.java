package com.bonnux.tmall.service;
import com.bonnux.tmall.pojo.Category;
import com.bonnux.tmall.util.Page;
import java.util.List;

public interface CategoryService{

    List<Category> list(Page page);

    int total();

}