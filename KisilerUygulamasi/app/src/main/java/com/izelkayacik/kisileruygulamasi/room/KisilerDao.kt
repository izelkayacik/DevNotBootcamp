package com.izelkayacik.kisileruygulamasi.room

import androidx.room.Dao
import androidx.room.Query
import com.izelkayacik.kisileruygulamasi.entity.Kisiler

@Dao
interface KisilerDao {

    @Query("SELECT * FROM kisiler")
    suspend fun tumKisiler() : List<Kisiler>

}