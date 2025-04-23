package com.example.musicappui

import androidx.annotation.DrawableRes

sealed class Screen(val title: String, val route: String) {

    sealed class BottomScreen(
        val bTitle: String, val bRoute:String, @DrawableRes val icon:Int
    ):Screen(bTitle, bRoute) {
        object Home : BottomScreen("홈", "home", R.drawable.baseline_music_note_24)

        object Library : BottomScreen(
            "라이브러리", "library", R.drawable.baseline_library_music_24
        )

        object Browse : BottomScreen(
            "브라우저", "browse", R.drawable.baseline_apps_24
        )
    }

    sealed class DrawerScreen(val dTitle: String, val dRoute:String, @DrawableRes val icon:Int)
        :Screen(dTitle, dRoute) {
        object Account: DrawerScreen(
            "계정",
            "account",
            R.drawable.ic_account
        )
        object Subscription: DrawerScreen(
            "구독",
            "subscribe",
            R.drawable.ic_subscribe
        )
        object AddAccount: DrawerScreen(
            "계정 추가",
            "add_account",
            R.drawable.baseline_person_add_alt_1_24
        )
    }
}

val screensInBottom = listOf(
    Screen.BottomScreen.Home,
    Screen.BottomScreen.Browse,
    Screen.BottomScreen.Library
)

val screensInDrawer = listOf(
    Screen.DrawerScreen.Account,
    Screen.DrawerScreen.Subscription,
    Screen.DrawerScreen.AddAccount
)