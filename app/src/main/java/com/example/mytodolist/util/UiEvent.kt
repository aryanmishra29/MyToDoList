package com.example.mytodolist.util

sealed class UiEvent {
    object PopBackStack : UiEvent()
    data class Navigates(val route: String): UiEvent()
    data class ShowSnackbar(
        val message: String,
        val action: String? = null

    ): UiEvent()
}