package com.example.finalproject2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.create_item.*
import kotlinx.android.synthetic.main.create_item.create_priority
import kotlinx.android.synthetic.main.create_item.create_title
import kotlinx.android.synthetic.main.update_item.*


class UpdateTask : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.update_item)
        val pos = intent.getIntExtra("id", -1)
        if(pos != 1) {
            val title = DataObject.getData(pos).title
            val priority = DataObject.getData(pos).priority
            create_title.setText(title)
            create_priority.setText(priority)

            delete_button.setOnClickListener {
                DataObject.deleteData(pos)
                myIntent()
            }

            update_button.setOnClickListener {
                DataObject.updateData(pos, create_title.text.toString(), create_priority.text.toString())
                myIntent()
            }
        }
    }

    fun myIntent() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}