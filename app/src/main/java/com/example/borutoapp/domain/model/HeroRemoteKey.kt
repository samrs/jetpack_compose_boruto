package com.example.borutoapp.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.borutoapp.util.Constants.HERO_REMOTE_KEY_DB_TABLE

@Entity(tableName = HERO_REMOTE_KEY_DB_TABLE)
data class HeroRemoteKey(
    @PrimaryKey
    val id: Int,
    val prevPage: Int?,
    val nextPage: Int?
)
