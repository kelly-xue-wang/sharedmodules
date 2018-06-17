package com.example.kellywang.moduleb

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity

class HMCActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.hmc_activity_hmc)
    val ft = supportFragmentManager.beginTransaction()
    ft.replace(R.id.container, HMCFragment()).commitAllowingStateLoss()
  }

  fun finishHMC(number: Int) {
    val intent = Intent()
    intent.putExtra("number", number)
    setResult(Activity.RESULT_OK, intent)
    finish()
  }
}