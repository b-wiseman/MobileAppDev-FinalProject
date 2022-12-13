package com.example.finalproject2

import androidx.room.PrimaryKey
import androidx.room.Entity

@Entity(tableName = "To_Do_Table")
data class Entity(
    @PrimaryKey(autoGenerate = true)
    var id : Int,
    var title : String,
    var priority : String
) {

}