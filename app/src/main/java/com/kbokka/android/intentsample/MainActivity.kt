package com.kbokka.android.intentsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val lvMenu = findViewById<ListView>(R.id.lvMenu)
    val menuList: MutableList<MutableMap<String, String>> = mutableListOf()

    menuList.add(mutableMapOf("name" to "から揚げ定食", "price" to "800円"))
    menuList.add(mutableMapOf("name" to "ハンバーグ定食", "price" to "810円"))
    menuList.add(mutableMapOf("name" to "生姜焼き定食", "price" to "820円"))
    menuList.add(mutableMapOf("name" to "ステーキ定食", "price" to "830円"))
    menuList.add(mutableMapOf("name" to "野菜炒め定食", "price" to "840円"))
    menuList.add(mutableMapOf("name" to "とんかつ定食", "price" to "850円"))
    menuList.add(mutableMapOf("name" to "メンチカツ定食", "price" to "860円"))
    menuList.add(mutableMapOf("name" to "チキンカツ定食", "price" to "870円"))
    menuList.add(mutableMapOf("name" to "コロッケ定食", "price" to "880円"))
    menuList.add(mutableMapOf("name" to "焼き魚定食", "price" to "890円"))
    menuList.add(mutableMapOf("name" to "焼肉定食", "price" to "900円"))

    val from = arrayOf("name", "price")
    val to = intArrayOf(android.R.id.text1, android.R.id.text2)
    val adapter = SimpleAdapter(applicationContext, menuList, android.R.layout.simple_list_item_2, from, to)

    lvMenu.adapter = adapter
  }
}
