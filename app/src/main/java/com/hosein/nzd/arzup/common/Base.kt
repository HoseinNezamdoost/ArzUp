package com.hosein.nzd.arzup.common

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel

abstract class ArzUpActivity : AppCompatActivity() , ArzUpView{

}

abstract class ArzUpFragment : Fragment() , ArzUpView{

}

abstract class ArzUpViewModel : ViewModel(){

}

interface ArzUpView{

}