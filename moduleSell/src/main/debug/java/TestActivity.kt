package com.example.kellywang.modulea

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.sell_activity_test.sell_test_button

class TestActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.sell_activity_test)
    sell_test_button.setOnClickListener {
      val intent = Intent(this, SellActivity::class.java)
      startActivity(intent)
    }
  }
}
