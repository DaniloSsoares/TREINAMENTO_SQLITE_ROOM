package com.example.treinamento_sqlite_room


import android.app.Application

import com.example.treinamento_sqlite_room.data.AppContainer
import com.example.treinamento_sqlite_room.data.AppDataContainer

class InventoryApplication : Application() {

    /**
     * AppContainer instance used by the rest of classes to obtain dependencies
     */
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}