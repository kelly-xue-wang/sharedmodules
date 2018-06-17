package com.example.kellywang.commonlibrary.router

import android.app.Activity
import android.support.v4.app.Fragment

class ModuleConfig : IModuleConfig {



  private val activityRouterConfig: MutableMap<String, Class<out Activity>>
  private val routerProcessConfig: MutableMap<String, IRouterProcess>
  private val fragmentRouterConfig: MutableMap<String, Class<out Fragment>>
  private val serviceConfig: MutableMap<Class<*>, Class<*>>

  init {
    activityRouterConfig = HashMap<String, Class<out Activity>>()
    routerProcessConfig = HashMap<String, IRouterProcess>()
    serviceConfig = HashMap<Class<*>, Class<*>>()
    fragmentRouterConfig = HashMap<String, Class<out Fragment>>()
  }
  override fun registerRouterActivity(uri: String, activityClass: Class<out Activity>) {
    activityRouterConfig[uri] = activityClass
  }

  override fun getRouterActivity(uri: String): Class<out Activity>? {
    return activityRouterConfig[uri]
  }

  override fun registerRouterActivity(uri: String, routerProcess: IRouterProcess) {
    routerProcessConfig.put(uri, routerProcess)
  }

  override fun getRouterProcess(uri: String): IRouterProcess? {
    return routerProcessConfig[uri]
  }

  override fun <T> registerService(serviceClass: Class<T>, implementClass: Class<out T>) {
    serviceConfig.put(serviceClass, implementClass)
  }

  override fun <T> getServiceImplementClass(serviceClass: Class<T>): Class<out T> {
    return serviceConfig[serviceClass] as Class<out T>
  }
  override fun registerFragmentRouter(uri: String, fragmentClass: Class<out Fragment>) {
    fragmentRouterConfig[uri] = fragmentClass
  }

  override fun getRouterFragment(uri: String): Class<out Fragment>? {
    return fragmentRouterConfig[uri]
  }

}