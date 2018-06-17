package com.example.kellywang.commonlibrary.router

interface IModuleLifeCycle {
  fun onCreate(config: IModuleConfig)
  fun onDestroy()
}