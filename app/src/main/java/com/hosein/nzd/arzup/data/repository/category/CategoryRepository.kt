package com.hosein.nzd.arzup.data.repository.category

import com.hosein.nzd.arzup.data.dataClass.categories.Categories
import com.hosein.nzd.arzup.data.dataClass.category.Category

interface CategoryRepository {
    suspend fun category() : Category
    suspend fun categories() : Categories
}