package yusuke.saito.using_viewmodel_incorrectly

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val count: MutableLiveData<Int> = MutableLiveData(0)
}
