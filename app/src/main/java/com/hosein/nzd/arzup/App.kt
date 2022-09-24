package com.hosein.nzd.arzup

import android.app.Application
import com.hosein.nzd.arzup.data.dataSource.category.CategoryRemoteDataSource
import com.hosein.nzd.arzup.data.repository.category.CategoryRepository
import com.hosein.nzd.arzup.data.repository.category.CategoryRepositoryImpl
import com.hosein.nzd.arzup.feature.main.HomeViewModel
import com.hosein.nzd.arzup.service.httpService.ApiService
import com.hosein.nzd.arzup.service.httpService.createInstanceApiService
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.module

class App : Application(){

    override fun onCreate() {
        super.onCreate()

        val module = module{
            single { createInstanceApiService() }
            factory <CategoryRepository>{ CategoryRepositoryImpl(CategoryRemoteDataSource(get())) }
            viewModel { HomeViewModel(get()) }
        }

        startKoin {
            androidContext(this@App)
            modules(module)
        }

    }

}