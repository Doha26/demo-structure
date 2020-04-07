package com.pavel.demo.data.local.db.repositories

import com.pavel.demo.data.local.model.Item

/**
 * This class define all actions (methods) for item Model using Item Dao instance
 */

interface ItemRepositoryImpl {

    fun insertItem(item: Item): Item

    fun deleteItem(): Boolean
}