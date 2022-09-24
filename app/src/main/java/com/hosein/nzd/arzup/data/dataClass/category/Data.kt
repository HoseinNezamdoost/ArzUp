package com.hosein.nzd.arzup.data.dataClass.category

data class Data(
    var avg_price_change: Double,
    var coins: List<Coin>,
    var description: String,
    var id: String,
    var last_updated: String,
    var market_cap: Double,
    var market_cap_change: Double,
    var name: String,
    var num_tokens: Int,
    var title: String,
    var volume: Double,
    var volume_change: Double
)