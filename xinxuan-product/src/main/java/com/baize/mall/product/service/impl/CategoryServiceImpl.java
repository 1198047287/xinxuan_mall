package com.baize.mall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baize.common.utils.PageUtils;
import com.baize.common.utils.Query;

import com.baize.mall.product.dao.CategoryDao;
import com.baize.mall.product.entity.CategoryEntity;
import com.baize.mall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        List<CategoryEntity> parents = categoryEntities.stream().filter(item -> item.getParentCid() == 0)
                // Map 是把每一个遍历的。进行设置
                // 此处设置每个的子菜单
                .map(menu->{
                    menu.setChildren(getChildren(menu,categoryEntities));
                    return menu;
                }).collect(Collectors.toList());
        return parents;
    }

    private List getChildren(CategoryEntity root, List<CategoryEntity> categoryEntities) {
        List<CategoryEntity> collect = categoryEntities.stream().filter(categoryEntity -> {
            return (categoryEntity.getParentCid() == root.getCatId());
            // 此处进行递归查找，如果有子菜单，则继续递归调用
        }).map((menu)->{
            menu.setChildren(getChildren(menu,categoryEntities));
            return menu;
        }).collect(Collectors.toList());
        return collect;
    }


}