// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation

package com.example.thewaveapp.ui

data class SurfSpot (
    val offset: String,
    val records: List<Record>
)

data class Record (
    val createdTime: String,
    val id: String,
    val fields: Fields
)

data class Fields (
    val geocode: String,
    val magicSeaweedLink: String,
    val photos: List<Photo>,
    val destination: String,
    val influencers: List<String>,
    val peakSurfSeasonBegins: String,
    val address: String,
    val peakSurfSeasonEnds: String,
    val destinationStateCountry: String,
    val difficultyLevel: Long,
    val surfBreak: List<String>
)

data class Photo (
    val filename: String,
    val size: Long,
    val id: String,
    val type: String,
    val thumbnails: Thumbnails,
    val url: String
)

data class Thumbnails (
    val small: Full,
    val large: Full,
    val full: Full
)

data class Full (
    val width: Long,
    val url: String,
    val height: Long
)

