package de.renichie.wwht.data

import de.renichie.wwht.model.Forecast

class DataSource {
    fun loadAffirmations(): List<Forecast> {
        return listOf(
            Forecast("werden die frontend tickets diesen sprint fertig?", "nein", null),
            Forecast("werd ich dieses Kotlin Projekt beenden?", "ja", null),
            Forecast("fill fill fill?", "nein", null),
            Forecast("fill fil fill?", "nein", null),
        )
    }
}