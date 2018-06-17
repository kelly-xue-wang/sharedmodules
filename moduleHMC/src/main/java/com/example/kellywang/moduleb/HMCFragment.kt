package com.example.kellywang.moduleb

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlinx.android.synthetic.main.hmc_fragment.btn_finish
import kotlinx.android.synthetic.main.hmc_fragment.btn_next
import kotlinx.android.synthetic.main.hmc_fragment.hmc_edittext

import java.util.Random

class HMCFragment : Fragment() {
  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    val view = inflater.inflate(R.layout.hmc_fragment, container, false)



    return view
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    btn_next.setOnClickListener {
      val fragment = HMCFragment()
      val ft = fragmentManager?.beginTransaction()
      ft?.replace(R.id.container, fragment)?.addToBackStack(null)?.commitAllowingStateLoss()
    }
    val random = Random()
    val number = random.nextInt(10)
    hmc_edittext.setText(number.toString())


    btn_finish?.setOnClickListener {
      val hmcActivity: HMCActivity? = activity as? HMCActivity
      hmcActivity?.finishHMC(number)

    }
  }
}