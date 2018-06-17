package com.example.kellywang.moduleb

import android.app.Application
import com.example.kellywang.commonlibrary.router.BaseModuleLifeCycle
import com.example.kellywang.commonlibrary.router.IModuleConfig

class HMCModuleLifeCycle(application: Application) : BaseModuleLifeCycle(application){
  override fun onCreate(config: IModuleConfig) {
    super.onCreate(config)
    config.registerRouterActivity("app://hmc", HMCActivity::class.java)
//    config.registerService()
  }
}