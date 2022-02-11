package yusuke.saito.using_viewmodel_incorrectly

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import yusuke.saito.using_viewmodel_incorrectly.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityMainBinding
    private val viewModel: MainViewModel by lazy { ViewModelProvider(this).get(MainViewModel::class.java) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.countUp.setOnClickListener {
            viewModel.countUp()
        }

        viewModel.count.observe(this) { count ->
            viewBinding.countView.text = count.toString()
        }
    }
}
