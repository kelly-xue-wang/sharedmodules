package com.example.kellywang.commonlibrary.router

import android.app.Activity
import android.support.v4.app.Fragment

interface IModuleConfig {
  fun registerRouterActivity(uri: String, activityClass: Class<out Activity>)

  fun getRouterActivity(uri: String): Class<out Activity>?

  fun registerRouterActivity(uri: String, routerProcess: IRouterProcess)

  fun getRouterProcess(uri: String): IRouterProcess?

  fun registerFragmentRouter(uri: String, fragmentClass: Class<out Fragment>)
  fun getRouterFragment(uri: String): Class<out Fragment>?

  fun <T> registerService(serviceClass: Class<T>, implementClass: Class<out T>)

  fun <T> getServiceImplementClass(serviceClass: Class<T>): Class<out T>?
}