package com.ums.ums_mobile.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.ums.ums_mobile.ui.components.AddButton
import com.ums.ums_mobile.ui.components.RefreshButton
import com.ums.ums_mobile.ui.theme.endColor
import com.usm.usm_mobile.R

@Composable
fun UserScreen(navController: NavHostController, /*viewModel: */){
    Column(
        verticalArrangement = Arrangement.spacedBy(63.dp, Alignment.Top),
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
//            .padding(start = 10.dp, top = 10.dp, end = 10.dp, bottom = 10.dp)
    ) {
        Icon(
            painter = painterResource(id = R.drawable.user_icon),
            contentDescription = stringResource(id = R.string.users)
        )

        Text(
            text = stringResource(id = R.string.users),
            //fontFamily = ,
            style = TextStyle(
                fontSize = 32.sp,
                color = endColor,
                textAlign = TextAlign.Center
            ),

        )

        Row(
            horizontalArrangement = Arrangement.spacedBy(34.dp, Alignment.End),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .width(340.dp)
                .height(56.dp)
        ) {
            AddButton(navController = navController, nav = "addScreen")
            RefreshButton("refresh_btn_descrip")
        }

//    List(items =)
    }
}