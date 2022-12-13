package com.example.finalproject2

import androidx.room.*
import androidx.room.Dao

@Dao
interface Dao {
    @Insert
    suspend fun insertTask(entity: Entity)

    @Update
    suspend fun updateTask(entity: Entity)

    @Delete
    suspend fun deleteTask(entity: Entity)

    @Query("Delete from To_Do_Table")
    suspend fun deleteAll()

    @Query("Select * from To_Do_Table")
    suspend fun getTasks() : List<TaskInfo>
}