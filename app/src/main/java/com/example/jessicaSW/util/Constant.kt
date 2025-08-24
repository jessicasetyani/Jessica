package com.example.jessicaSW.util

import com.example.jessicaSW.BuildConfig

object Constants {
    const val ITEMS_PER_PAGE = 10
    
    const val UNSPLASH_DATABASE = "unsplash_database"
    const val UNSPLASH_IMAGE_TABLE = "unsplash_image_table"
    const val UNSPLASH_REMOTE_KEYS_TABLE = "unsplash_remote_keys_table"

    // API key loaded from BuildConfig (secure)
    val API_KEY = "Client-ID ${BuildConfig.UNSPLASH_API_KEY}"

}