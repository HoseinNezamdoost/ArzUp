package com.hosein.nzd.arzup.data.repository.category

import com.hosein.nzd.arzup.data.dataClass.categories.Categories
import com.hosein.nzd.arzup.data.dataClass.category.Category
import com.hosein.nzd.arzup.data.dataSource.category.CategoryDataSource

class CategoryRepositoryImpl(val categoryDataSource: CategoryDataSource) : CategoryRepository {
    override suspend fun category(): Category {
        return categoryDataSource.category()
    }

    override suspend fun categories(): Categories = categoryDataSource.categories()
}