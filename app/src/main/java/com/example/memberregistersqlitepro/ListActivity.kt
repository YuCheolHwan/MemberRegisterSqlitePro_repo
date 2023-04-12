package com.example.memberregistersqlitepro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.memberregistersqlitepro.databinding.ActivityListBinding

class ListActivity : AppCompatActivity() {
    lateinit var binding: ActivityListBinding
    lateinit var adapter: MemberRecyclerAdapter
    lateinit var dbHelper: DBHelper
    lateinit var member: MutableList<Member>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        dbHelper  = DBHelper(applicationContext, MainActivity.DB_NAME,  MainActivity.VERSION)
//        val dataList = dbHelper.selectID("123")
//        member = mutableListOf()
//        member.add(dataList!!)
//        Log.e("ddddddddddddddddddddd","$num")
        adapter = MemberRecyclerAdapter(dbHelper.selectAll()!!)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)


        binding.btnMain.setOnClickListener {

            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
