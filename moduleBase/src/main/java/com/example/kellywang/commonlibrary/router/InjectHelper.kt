package com.example.kellywang.commonlibrary.router


object InjectHelper {
  private val baseAppContext: BaseApplication get() = getAppContext()
  val iModuleConfig: IModuleConfig = baseAppContext.getModuleConfig()


  fun <T> getInstance(clazz: Class<T>): T? {
    val config = iModuleConfig
    val implementClass = config.getServiceImplementClass(clazz)
    if (implementClass != null) {
      try {
        return implementClass.newInstance()
      } catch (e: Exception) {
        e.printStackTrace()
      }
    }
    return null
  }
}