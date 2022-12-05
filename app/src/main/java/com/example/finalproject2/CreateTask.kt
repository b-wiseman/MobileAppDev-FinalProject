package com.example.finalproject2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.create_item.*

class CreateTask : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_item)
        save_button.setOnClickListener {
            if(create_title.text.toString().trim{it<=' '}.isNotEmpty()
                && create_priority.text.toString().trim{it<=' '}.isNotEmpty())
            {
                var title=create_title.getText().toString()
                var priority=create_priority.getText().toString()
                DataObject.setData(title, priority)
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }

}