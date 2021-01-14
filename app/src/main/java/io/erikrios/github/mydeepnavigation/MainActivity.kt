package io.erikrios.github.mydeepnavigation

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import io.erikrios.github.mydeepnavigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOpenDetail.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_open_detail) {
            val detailIntent = Intent(this@MainActivity, DetailActivity::class.java)
            detailIntent.putExtra(DetailActivity.EXTRA_TITLE, getString(R.string.detail_title))
            detailIntent.putExtra(DetailActivity.EXTRA_MESSAGE, getString(R.string.detail_message))
            startActivity(detailIntent)
        }
    }
}