package com.leyou.item.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.leyou.common.exception.pojo.ExceptionEnum;
import com.leyou.common.exception.pojo.LyException;
import com.leyou.item.mapper.CategoryMapper;
import com.leyou.item.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 分类Service
 */
@Service
@Transactional
public class CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    public List<Category> findCategoriesByPid(Long pid) {
        //1.封装条件
        /*QueryWrapper<Category> query = Wrappers.query();
        query.eq("parent_id",pid);*/

        Category category = new Category();
        category.setParentId(pid);
        QueryWrapper<Category> query = Wrappers.query(category);

        //2.执行查询
        List<Category> categories = categoryMapper.selectList(query);

        //3.处理结果并返回
        if(CollectionUtils.isEmpty(categories)){
            throw new LyException(ExceptionEnum.CATEGORY_NOT_FOUND);
        }

        return categories;

    }

}