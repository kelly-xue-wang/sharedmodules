package com.example.kellywang.modulea

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.kellywang.commonlibrary.router.Router
import kotlinx.android.synthetic.main.sell_vertical_selection_fragment.btn_finish
import kotlinx.android.synthetic.main.sell_vertical_selection_fragment.btn_hmc


class SellVerticalSelectionFragment : Fragment() {
  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    val view = inflater.inflate(R.layout.sell_vertical_selection_fragment, container, false)

    return view
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    btn_hmc.setOnClickListener{
      Router.openForResult(this, "app://hmc", null, 100)

    }
    btn_finish.setOnClickListener{
      if(activity is SellActivity) {
        activity?.finish()
      } else {
        fragmentManager?.popBackStack()
      }

    }
  }
  override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
    super.onActivityResult(requestCode, resultCode, data)
    if (data != null) {
      val number = data.getIntExtra("number", 0)
      Toast.makeText(this.context, "get result from hmc " + number.toString(), Toast.LENGTH_LONG).show()
    }
  }
}