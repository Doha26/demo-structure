package com.pavel.demo.data.local.db.repositories

import com.pavel.demo.data.local.db.AppDatabase
import com.pavel.demo.data.local.db.dao.item.ItemDao
import com.pavel.demo.data.local.model.Item

class ItemRepository(val appDatabase: AppDatabase) : ItemRepositoryImpl {

   val itemDao:ItemDao = appDatabase.itemDao()


    override fun insertItem(item: Item): Item {
       return itemDao.insertItem(item)
    }

    override fun deleteItem(): Boolean {
        TODO("Not yet implemented")
    }

    // Define all others sub methods here folowing the same principle

    //...
}