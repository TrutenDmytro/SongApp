package com.example.songapplication

import java.io.Serializable

data class Song(val name: String, val group: String, val genre: String, val year: String, val img: String) : Serializable
