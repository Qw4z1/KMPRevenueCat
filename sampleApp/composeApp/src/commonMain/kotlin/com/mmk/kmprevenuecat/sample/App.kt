package com.mmk.kmprevenuecat.sample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun App() {

    MaterialTheme {
        Column(
            Modifier.fillMaxSize().padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically)
        ) {
            Text(
                text = "Hello KMPWorld",
                style = MaterialTheme.typography.body1,
                textAlign = TextAlign.Start,
            )
        }
    }
}