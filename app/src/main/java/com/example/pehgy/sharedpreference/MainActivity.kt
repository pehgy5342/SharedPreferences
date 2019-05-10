package com.example.pehgy.sharedpreference

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sp = SharedPreferenceClass(this)

        btn_add.setOnClickListener {
            sp.record(et.text.toString())//將record方法轉成字串
            tv_show.text = sp.show()

        }
        tv_show.text = sp.show()
    }
}
