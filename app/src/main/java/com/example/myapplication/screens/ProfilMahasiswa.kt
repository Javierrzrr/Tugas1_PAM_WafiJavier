package com.example.myapplication.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ProfilMahasiswa(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(16.dp)
        ) {
            Box(contentAlignment = Alignment.TopEnd) {
                // Ikon Profil Utama
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Ikon Profil",
                    modifier = Modifier
                        .size(80.dp)
                        .clip(RectangleShape)
                        .background(Color.LightGray)
                        .padding(8.dp)
                )
            }

            Spacer(modifier = Modifier.size(16.dp))

            Column {
                Text(
                    text = "Wafi Javier Zuhdi",
                    style = MaterialTheme.typography.titleLarge
                )
                Text(
                    text = "NIM: 245150401111036",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Gray
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewProfilMahasiswa() {
    ProfilMahasiswa()
}