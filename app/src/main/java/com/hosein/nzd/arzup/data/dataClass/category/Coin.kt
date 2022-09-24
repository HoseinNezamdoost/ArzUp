package com.hosein.nzd.arzup.data.dataClass.category

data class Coin(
    var circulating_supply: Double,
    var cmc_rank: Int,
    var date_added: String,
    var id: Int,
    var is_active: Int,
    var is_fiat: Int,
    var last_updated: String,
    var max_supply: Int?,
    var name: String,
    var num_market_pairs: Int,
    var platform: Platform?,
    var quote: Quote,
    var self_reported_circulating_supply: Double?,
    var self_reported_market_cap: Double?,
    var slug: String,
    var symbol: String,
    var tags: List<String>,
    var total_supply: Double,
    var tvl_ratio: Double?
)