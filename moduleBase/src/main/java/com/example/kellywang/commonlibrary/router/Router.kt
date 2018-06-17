package com.example.kellywang.commonlibrary.router

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.annotation.IdRes
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager

object Router {
  fun open(context: Context?, uri: String) {
    open(context, uri, null)
  }

  fun open(context: Context?, uri: String, bundle: Bundle?) {
    val config = InjectHelper.iModuleConfig
    val activityClass = config.getRouterActivity(uri)
    if (activityClass != null) {
      val intent = Intent(context, activityClass)
      if (bundle != null) {
        intent.putExtras(bundle)
      }

      context?.startActivity(intent)
    } else {
      runProcess(uri, bundle)
    }
  }

  fun openForResult(context: Activity, uri: String, bundle: Bundle?, requestCode: Int) {
    val config = InjectHelper.iModuleConfig
    val activityClass = config.getRouterActivity(uri)
    if (activityClass != null) {
      val intent = Intent(context, activityClass)
      if (bundle != null) {
        intent.putExtras(bundle)
      }
      context.startActivityForResult(intent, requestCode)
    } else {
      runProcess(uri, bundle)
    }
  }

  fun openForResult(context: Fragment, uri: String, bundle: Bundle?, requestCode: Int) {
    val config = InjectHelper.iModuleConfig
    val activityClass = config.getRouterActivity(uri)
    if (activityClass != null) {
      val intent = Intent(context.context, activityClass)
      if (bundle != null) {
        intent.putExtras(bundle)
      }
      context.startActivityForResult(intent, requestCode)
    } else {
      runProcess(uri, bundle)
    }
  }

  fun getRouterFragment(uri: String): Fragment? {
    val config = InjectHelper.iModuleConfig
    val routerFragment = config.getRouterFragment(uri)
    if (routerFragment != null) {
      try {
        val fragmentInstance = routerFragment.newInstance()
        return fragmentInstance
      } catch (e: Exception) {
        e.printStackTrace()
      }
    }
    return null
  }

  fun runProcess(uri: String, bundle: Bundle?) {
    val config = InjectHelper.iModuleConfig
    val process = config.getRouterProcess(uri)
    if (process != null) {
      process.process(uri)
    } else {
      throw RuntimeException("can not execute uri : ")
    }
  }


}