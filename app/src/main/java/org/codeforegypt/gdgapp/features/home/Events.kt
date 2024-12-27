package org.codeforegypt.gdgapp.features.home

import org.codeforegypt.gdgapp.R

data class Events(
    val image: Int,
    val title: String,
    val locationIcon: Int,
    val dateIcon: Int,
    val location: String,
    val date : String
) {

    companion object {
        fun dummyData(): List<Events> {
            return listOf(
                Events(
                    image = R.drawable.ai_image,
                    title = "Gemma 2 Ai Challenge",
                    locationIcon = R.drawable.location,
                    location = "Location",
                    dateIcon = R.drawable.calender,
                    date = "28 Nov 2024 - 1 Dec 2024"
                ),
                Events(
                    image = R.drawable.ai_image,
                    title = "Gemma 2 Ai Challenge",
                    locationIcon = R.drawable.location,
                    location = "Location",
                    dateIcon = R.drawable.calender,
                    date = "28 Nov 2024 - 1 Dec 2024"
                ),
                Events(
                    image = R.drawable.ai_image,
                    title = "Gemma 2 Ai Challenge",
                    locationIcon = R.drawable.location,
                    location = "Location",
                    dateIcon = R.drawable.calender,
                    date = "28 Nov 2024 - 1 Dec 2024"
                ),
                Events(
                    image = R.drawable.ai_image,
                    title = "Gemma 2 Ai Challenge",
                    locationIcon = R.drawable.location,
                    location = "Location",
                    dateIcon = R.drawable.calender,
                    date = "28 Nov 2024 - 1 Dec 2024"
                )
            )

        }
    }
}


