package com.hosein.nzd.arzup.data.dataClass.category

data class USDT(
    var fully_diluted_market_cap: Double,
    var last_updated: String,
    var market_cap: Double,
    var market_cap_dominance: Double,
    var percent_change_1h: Double,
    var percent_change_24h: Double,
    var percent_change_30d: Double,
    var percent_change_60d: Double,
    var percent_change_7d: Double,
    var percent_change_90d: Double,
    var price: Double,
    var tvl: Double?,
    var volume_24h: Double,
    var volume_change_24h: Double
)