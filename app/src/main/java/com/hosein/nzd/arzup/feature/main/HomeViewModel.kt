package com.hosein.nzd.arzup.feature.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.hosein.nzd.arzup.common.ArzUpViewModel
import com.hosein.nzd.arzup.data.dataClass.category.Category
import com.hosein.nzd.arzup.data.repository.category.CategoryRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel(val repository: CategoryRepository) : ArzUpViewModel() {

    val categoryLiveData = MutableLiveData<Category>()

    init {
        viewModelScope.launch (Dispatchers.Main){
            categoryLiveData.value = repository.category()
        }
    }
}