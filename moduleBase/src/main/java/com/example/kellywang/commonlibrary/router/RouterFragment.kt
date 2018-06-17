package com.example.kellywang.commonlibrary.router

import android.support.v4.app.Fragment

open class RouterFragment : Fragment() {
  /*  private val EXTRA_KEY_ROUTER_RESULT = "router_result"
    private var fragment1: Fragment? = null
    private var requestCode: Int = 0
    private var fragmentManger: FragmentManager? = null*/
  private var routerHelper: RouterHelper? = null


  fun getBackStackName(): String {
    return this::class.java.name
  }


  fun initRouterHelper(targetFragment: Fragment?, requestCode: Int) {
    routerHelper = RouterHelper(this::class.java.name, targetFragment, requestCode)
  }

  fun getRouterHelper() = routerHelper
}