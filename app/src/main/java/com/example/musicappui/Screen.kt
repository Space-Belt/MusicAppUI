package com.example.musicappui

import androidx.annotation.DrawableRes

sealed class Screen(val title: String, val route: String) {

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


val screensInDrawer = listOf(
    Screen.DrawerScreen.Account,
    Screen.DrawerScreen.Subscription,
    Screen.DrawerScreen.AddAccount
)