package com.example.kellywang.modulea

import android.app.Application
import com.example.kellywang.commonlibrary.router.BaseModuleLifeCycle
import com.example.kellywang.commonlibrary.router.IModuleConfig
import com.example.kellywang.moduleservice.ISellService

class SellModuleLifeCycle(application: Application) : BaseModuleLifeCycle(application) {


  override fun onCreate(config: IModuleConfig) {
    config.registerService(ISellService::class.java, SellServiceImpl::class.java)
    config.registerRouterActivity("app://sell/activity", SellActivity::class.java)
    config.registerFragmentRouter("app://sell/fragment", SellVerticalSelectionFragment::class.java)
  }
}