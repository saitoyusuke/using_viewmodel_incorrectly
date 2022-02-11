package yusuke.saito.using_viewmodel_incorrectly

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import yusuke.saito.using_viewmodel_incorrectly.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityMainBinding
    private val viewModel = MainViewModel()

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
