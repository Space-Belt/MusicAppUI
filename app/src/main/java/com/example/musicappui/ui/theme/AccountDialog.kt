package com.example.musicappui.ui.theme

import android.app.AlertDialog
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.AlertDialog
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.TextField
import androidx.compose.material.primarySurface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.DialogProperties

@Composable
fun AccountDialog(dialogOpen: MutableState<Boolean>) {

    if(dialogOpen.value) {
        AlertDialog(
            onDismissRequest = {
                dialogOpen.value = false
            },
            confirmButton = {
                TextButton(onClick={
                    dialogOpen.value = false
                }) {
                    Text("취소")
                }
            },
            dismissButton = {
                TextButton(onClick={
                    dialogOpen.value = false
                }) {
                    Text("확인")
                }
            },
            title = {
                Text(text = "계정 추가")
            },
            text = {
                Column(
                    modifier = Modifier.wrapContentHeight().padding(top = 16.dp),
                    verticalArrangement = Arrangement.Center
                    ) {
                    TextField(value = "", onValueChange = {

                    }, modifier = Modifier.padding(top = 16.dp),
                        label = {Text(text= "이메일")})
                    TextField(value = "", onValueChange = {

                    }, modifier = Modifier.padding(top = 8.dp),
                        label = {Text(text= "비밀번호")})
                }
            },
            modifier = Modifier.fillMaxWidth()
                .background(MaterialTheme.colors.primarySurface)
                .padding(8.dp),
            shape = RoundedCornerShape(5.dp),
            backgroundColor = Color.White,
            properties = DialogProperties(
                dismissOnBackPress = true,
                dismissOnClickOutside = true
            )
        )
    }
}