package com.example.finalproject2

object DataObject {
    var listdata = mutableListOf<TaskInfo>()

    fun setData(title : String, priority : String) {
        listdata.add(CardInfo(title, priority))
    }

    fun getAllData() : List<TaskInfo> {
        return listdata
    }

    fun deleteAll() {
        listdata.clear()
    }
}