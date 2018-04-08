package com.bonnux.tmall.service;
import com.bonnux.tmall.pojo.Category;
import com.bonnux.tmall.util.Page;
import java.util.List;

public interface CategoryService{

    List<Category> list();


    void add(Category category);

    void delete(int id);

    Category get(int id);

    void update(Category category);

}