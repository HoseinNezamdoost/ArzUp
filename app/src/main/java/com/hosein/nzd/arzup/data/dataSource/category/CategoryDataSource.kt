package com.hosein.nzd.arzup.data.dataSource.category

import com.hosein.nzd.arzup.data.dataClass.categories.Categories
import com.hosein.nzd.arzup.data.dataClass.category.Category

interface CategoryDataSource {

    suspend fun category() : Category
    suspend fun categories() : Categories

}