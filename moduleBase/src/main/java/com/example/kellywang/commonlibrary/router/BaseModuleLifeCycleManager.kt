package com.example.kellywang.commonlibrary.router

import android.app.Application

import java.util.ArrayList

open class BaseModuleLifeCycleManager(application: Application) {
   val moduleConfig: ModuleConfig = ModuleConfig()
   val moduleLifeCycleList: MutableList<IModuleLifeCycle>

  init {
    moduleLifeCycleList = ArrayList<IModuleLifeCycle>()

  }

  fun onCreate() {
    for (moduleLifeCycle in moduleLifeCycleList) {
      moduleLifeCycle.onCreate(moduleConfig)
    }
  }

  fun onDestroy() {
    for (moduleLifeCycle in moduleLifeCycleList) {
      moduleLifeCycle.onDestroy()
    }
  }

  fun getModuleConfig():IModuleConfig{
    return moduleConfig
  }
}