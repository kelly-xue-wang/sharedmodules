package com.example.kellywang.modulea

import com.example.kellywang.moduleservice.ISellService

class SellServiceImpl : ISellService {
  override fun getSellerName(): String {
    return "Hello My name is seller module"
  }

}