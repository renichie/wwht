package de.renichie.wwht.model

data class Forecast(
    val topic: String,
    val prediction: String,
    var forecastResult: Boolean?,
//    val start: Date,
//    val end: Date,
) {

}