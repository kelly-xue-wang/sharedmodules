package com.example.kellywang.commonlibrary.router

import android.app.Application

var context: BaseApplication? = null
fun getAppContext(): BaseApplication {
  return context!!
}
open class BaseApplication : Application(){
  var lifeCycleManager: BaseModuleLifeCycleManager? = null
  override fun onCreate() {
    super.onCreate()
    context = this
    lifeCycleManager = BaseModuleLifeCycleManager(this)
    lifeCycleManager!!.onCreate()
  }

  override fun onTerminate() {
    super.onTerminate()
    lifeCycleManager!!.onDestroy()
  }

  fun getModuleConfig(): IModuleConfig = lifeCycleManager!!.getModuleConfig()
}