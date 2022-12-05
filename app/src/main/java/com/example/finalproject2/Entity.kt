package com.example.finalproject2

import androidx.room.PrimaryKey

@Entity(tableName = "To_Do_Table")
data class Entity(
    @PrimaryKey(autoGenerate = true)
    var id: Int
) {

}