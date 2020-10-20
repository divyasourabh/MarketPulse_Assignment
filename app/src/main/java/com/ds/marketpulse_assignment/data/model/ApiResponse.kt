package com.ds.marketpulse_assignment.data.model

import com.squareup.moshi.JsonClass
import java.util.*

@JsonClass(generateAdapter = true)
data class ApiResponse (
        val id: String? = null,
        val name: String? = null,
        val tag: String? = null,
        val color: String? = null,
        val criteria: Criteria
)

@JsonClass(generateAdapter = true)
data class Criteria (
        val type: String? = null,
        val text: String? = null,
        val variable: Variable
)

@JsonClass(generateAdapter = true)
data class plainText (
        val text: String? = null,
        )

@JsonClass(generateAdapter = true)
data class Variable (
        val valueHashMap: HashMap<String, Value>?,
        val indicatorHashMap: HashMap<String, Indicator>?
        )

@JsonClass(generateAdapter = true)
data class Value (
        val valuehashMap : HashMap<String,String>
)

@JsonClass(generateAdapter = true)
data class Indicator (
        val study_type: String? = null,
        val parameter_name: String? = null,
        val min_value: Int,
        val max_value: Int,
        val default_value: Int
)





