package com.example.finalproject2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {
    private lateinit var database: Database
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        database = Room.databaseBuilder(
            applicationContext, Database::class.java, "To_Do_Table"
        ).build()

        add.setOnClickListener {
            val intent= Intent(this, CreateTask::class.java)
            startActivity(intent)
        }

        deleteAll.setOnClickListener {
            DataObject.deleteAll()
            GlobalScope.launch {
                database.dao().deleteAll()
            }
            setRecycler()
        }

        setRecycler()


    }

    fun setRecycler() {
        recycler_view.adapter = Adapter(DataObject.getAllData())
        recycler_view.layoutManager = LinearLayoutManager(this)
    }
}