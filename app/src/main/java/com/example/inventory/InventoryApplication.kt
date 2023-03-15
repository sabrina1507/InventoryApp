package com.example.inventory
import ItemRoomDatabase
import android.app.Application


class InventoryApplication : Application() {
    val database: ItemRoomDatabase by lazy { ItemRoomDatabase.getDatabase(this) }
}
