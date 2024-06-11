package com.example.dessertclicker

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.dessertclicker.data.Datasource.dessertList


/**
 * Created by Ahsan Habib on 6/11/2024.
 */
data class DessertUiState(
    var revenue: Int = 0,
    var dessertsSold: Int = 0,
    val currentDessertIndex: Int = 0,
    var currentDessertPrice: Int = dessertList[currentDessertIndex].price,
    var currentDessertImageId: Int = dessertList[currentDessertIndex].imageId,
)
