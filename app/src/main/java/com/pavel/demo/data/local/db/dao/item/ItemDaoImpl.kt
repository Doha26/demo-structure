package com.pavel.demo.data.local.db.dao.item

import com.pavel.demo.data.local.model.Item

/**
 * This class define all CRUD (Insert , Delete , Read , Update , Delete ) methods signatures to manage Item Model
 */
interface ItemDaoImpl {

    fun insertItem(item: Item): Item

    fun deleteItem(id: Int): Boolean

    fun getItem(id: Int): Item

    fun getAllItems(): List<Item>

    fun deleteAll(): Boolean
}