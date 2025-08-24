package com.example.jessicaSW.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.jessicaSW.data.local.dao.UnsplashImageDao
import com.example.jessicaSW.data.local.dao.UnsplashRemoteKeysDao
import com.example.jessicaSW.model.UnsplashImage
import com.example.jessicaSW.model.UnsplashRemoteKeys

@Database(entities = [UnsplashImage::class, UnsplashRemoteKeys::class], version = 1)
abstract class UnsplashDatabase : RoomDatabase() {

    abstract fun unsplashImageDao(): UnsplashImageDao
    abstract fun unsplashRemoteKeysDao(): UnsplashRemoteKeysDao

}