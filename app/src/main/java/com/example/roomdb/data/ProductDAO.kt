package com.example.roomdb.data

import androidx.room.Dao
import androidx.room.Insert


@Dao
interface ProductDAO {

    @Insert
    fun insert(p : Product)

}