package org.codeforegypt.gdgapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SearchHeader() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 6.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.location),
                contentDescription = "LocationIcon",
                modifier = Modifier.size(25.dp)
            )
            Spacer(Modifier.width(10.dp))
            Text(
                text = "Alexandria",
                style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Medium)
            )
            Spacer(modifier = Modifier.weight(1f))
            IconButton(
                onClick = {},
                modifier = Modifier.size(40.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.bell),
                    contentDescription = "Notification bell",
                    modifier = Modifier.size(20.dp)
                )
            }
        }

        Row(
            modifier = Modifier.padding(end= 4.dp)
        ) {
            OutlinedTextField(
                value = "",
                onValueChange = {},
                placeholder = {
                    Text(
                        text = "Search",
                        style = TextStyle(fontWeight = FontWeight.SemiBold),
                        color = Color.Gray,
                    )
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Search Icon",
                        modifier = Modifier.size(20.dp)
                    )
                },
                trailingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.mice),
                        contentDescription = "Mic",
                        modifier = Modifier.size(20.dp)
                    )
                },
                shape = RoundedCornerShape(6.dp),
                modifier = Modifier
                    .height(45.dp)
                    .weight(1f)
            )


            Spacer(modifier = Modifier.width(10.dp))
            Box(
                modifier = Modifier
                    .size(45.dp)
                    .background(Color.Blue, RoundedCornerShape(6.dp)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.filter),
                    contentDescription = "Filter Icon",
                    tint = Color.White,
                    modifier = Modifier.size(20.dp)
                )
            }
        }
Spacer(modifier = Modifier.height(6.dp))
        Text("Featured events", style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 14.sp))
}

}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GDGApp(modifier: Modifier = Modifier) {
    SearchHeader()
}
