package com.imooc.service.impl;

import com.imooc.dataobject.ProductCategory;
import com.imooc.repository.ProductCategoryRepository;
import com.imooc.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl   implements CategoryService {

    @Autowired
    private ProductCategoryRepository pcRepository;


    @Override
    public ProductCategory findOne(Integer categoryId) {
        return pcRepository.findOne(categoryId);
    }

    @Override
    public List<ProductCategory> findAll() {
        return pcRepository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return pcRepository.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory seve(ProductCategory productCategory) {
        return pcRepository.save(productCategory);
    }
}
