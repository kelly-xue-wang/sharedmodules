package com.example.kellywang.modulea

import android.os.Bundle

import android.support.v7.app.AppCompatActivity

class SellActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.sell_activity_sell)
    val ft = supportFragmentManager.beginTransaction()
    ft.replace(R.id.container, SellVerticalSelectionFragment()).commitAllowingStateLoss()
  }
}