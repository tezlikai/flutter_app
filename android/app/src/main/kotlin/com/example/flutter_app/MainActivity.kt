package com.example.flutter_app

import android.os.Bundle

import io.flutter.app.FlutterActivity
import io.flutter.plugins.GeneratedPluginRegistrant

class MainActivity: FlutterActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    GeneratedPluginRegistrant.registerWith(this)
    initView()
    initData()
    initFix()
  }

  private fun initFix() {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  private fun initData() {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  private fun initView() {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  private fun devBranch(){

  }
}
