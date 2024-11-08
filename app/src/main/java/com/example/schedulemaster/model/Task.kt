package com.example.schedulemaster.model

data class Task(
    val title: String,
    val date: String,
    val time: String,
    val description: String,
    val location: String,
    val priority: String,
    val category: String
){

}