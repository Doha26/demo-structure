package com.pavel.demo.data.local.db

import com.pavel.demo.data.local.db.dao.item.ItemDao

/**
 * This class extend the RoomDatabase class and
 */


abstract class AppDatabase  // : RoomDatabase {
{

    // Define all  Dao

     abstract fun itemDao(): ItemDao

}