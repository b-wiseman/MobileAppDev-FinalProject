package com.example.finalproject2

object DataObject {
    var listdata = mutableListOf<TaskInfo>()

    fun setData(title : String, priority : String) {
        listdata.add(TaskInfo(title, priority))
    }

    fun getAllData() : List<TaskInfo> {
        return listdata
    }

    fun deleteAll() {
        listdata.clear()
    }

    fun getData(pos : Int) : TaskInfo {
        return listdata[pos]
    }

    fun deleteData(pos : Int) {
        listdata.removeAt(pos)
    }

    fun updateData(pos : Int, title : String, priority: String) {
        listdata[pos].title = title
        listdata[pos].priority = priority
    }
}