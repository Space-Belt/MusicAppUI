package com.example.musicappui.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Icon

import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun SubscriptionView() {

    Column(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp).height(200.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "구독 관리",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Card(modifier = Modifier.padding(8.dp), elevation = 4.dp){
            Column(
                modifier = Modifier.padding(8.dp)
            ) {
                Column() {
                    Text(text = "뮤지컬")
                    Row(Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween) {
                        Text(text = "Free Trail")
                        TextButton (onClick = {}) {
                            Row {
                                Text(text = "모든 플랜 보기")
                                Icon(
                                    imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                                    contentDescription = "모든 플랜 보기"
                                )
                            }
                        }
                    }
                }
                Divider(
                    thickness = 1.dp,
                    modifier = Modifier.padding(horizontal = 8.dp)
                )
                Row(Modifier.padding(vertical = 16.dp)) {
                    Icon(imageVector = Icons.Default.AccountBox, contentDescription = "플랜 가져오기")
                    Text(text = "플랜 가져 오기")
                }

            }
        }

    }
}