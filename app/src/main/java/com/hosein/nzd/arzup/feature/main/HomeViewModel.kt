package com.hosein.nzd.arzup.feature.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.hosein.nzd.arzup.common.ArzUpViewModel
import com.hosein.nzd.arzup.data.dataClass.categories.Categories
import com.hosein.nzd.arzup.data.dataClass.category.Category
import com.hosein.nzd.arzup.data.repository.category.CategoryRepository
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch

class HomeViewModel(val repository: CategoryRepository) : ArzUpViewModel() {

    val categoryLiveData = MutableLiveData<Categories>()
    val errorLiveData = MutableLiveData<String>()
    val coroutineExceptionHandler = CoroutineExceptionHandler{coroutineContext, throwable ->
        errorLiveData.value = throwable.message
    }

    init {
        viewModelScope.launch (coroutineExceptionHandler){
            //val data = repository.category()
            val data = repository.categories()
            categoryLiveData.value = data
        }
    }
}