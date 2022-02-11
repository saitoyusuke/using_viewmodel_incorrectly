package yusuke.saito.using_viewmodel_incorrectly

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _count: MutableLiveData<Int> = MutableLiveData(0)
    val count: LiveData<Int> = _count

    fun countUp() {
        _count.postValue(_count.value?.plus(1))
    }
}
