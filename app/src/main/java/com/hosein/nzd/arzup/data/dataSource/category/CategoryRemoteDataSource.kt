package com.hosein.nzd.arzup.data.dataSource.category

import com.hosein.nzd.arzup.common.CONVERT_CODE_TETHER
import com.hosein.nzd.arzup.common.CONVERT_CODE_UNITED_STATE
import com.hosein.nzd.arzup.common.ID_BTC
import com.hosein.nzd.arzup.common.ID_BTC2
import com.hosein.nzd.arzup.data.dataClass.categories.Categories
import com.hosein.nzd.arzup.data.dataClass.category.Category
import com.hosein.nzd.arzup.service.httpService.ApiService

class CategoryRemoteDataSource(val apiService: ApiService) : CategoryDataSource {
    override suspend fun category(): Category =
        apiService.category(ID_BTC2, 1, 10, CONVERT_CODE_UNITED_STATE)

    override suspend fun categories(): Categories = apiService.categories(1,1,"BTC")
}