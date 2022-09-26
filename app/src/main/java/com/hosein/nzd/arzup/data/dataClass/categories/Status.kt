package com.hosein.nzd.arzup.data.dataClass.categories

data class Status(
    var credit_count: Int,
    var elapsed: Int,
    var error_code: Int,
    var error_message: Any?,
    var notice: Any?,
    var timestamp: String
)