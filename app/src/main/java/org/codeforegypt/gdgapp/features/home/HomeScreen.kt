package org.codeforegypt.gdgapp.features.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.codeforegypt.gdgapp.R

@Composable
fun HomeScreen(
    featuredEvents: List<Int>,
    modifier: Modifier = Modifier,
) {
    LazyColumn(modifier = modifier.padding(16.dp)) {
        item {
            TopBar()
        }
        item {
            FeaturedEventsSection(featuredEvents)
        }
        item {
            EventListSection(
                title = "Upcoming Events",
                events = listOf("Event 1", "Event 2", "Event 3"),
                onSeeAllClick = { /* Handle see all click */ })
        }
        item {
            EventListSection(
                title = "Past Events",
                events = listOf("Event 1", "Event 2", "Event 3"),
                onSeeAllClick = { /* Handle see all click */ })
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GDGApp(modifier: Modifier = Modifier) {
    HomeScreen(
        featuredEvents = listOf(
            R.drawable.img_devfest,
            R.drawable.img_devfest,
            R.drawable.img_devfest
        ),
        modifier = modifier
    )
}