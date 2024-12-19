package org.codeforegypt.gdgapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SearchHeader() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 15.dp)
            .padding(10.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 6.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
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
            }
            Row(
                horizontalArrangement = Arrangement.End
            ) {
                IconButton(
                    onClick = {},
                    modifier = Modifier.size(40.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.bell),
                        contentDescription = "Notification bell",
                        modifier = Modifier.size(18.dp)
                    )
                }
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 10.dp, bottom = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(40.dp)
                    .border(1.dp, color = Color.Gray, shape = RoundedCornerShape(6.dp))
                    .background(Color.LightGray)
            )
            {
                BasicTextField(
                    value = "",
                    onValueChange = {},
                    decorationBox = { innerPadding ->
                        Row(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(6.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(4.dp)
                            ) {
                                Icon(
                                    modifier = Modifier.size(25.dp),
                                    imageVector = Icons.Default.Search,
                                    tint = Color.Gray,
                                    contentDescription = "Search icon",
                                )
                                if ("".isEmpty()) {
                                    Text(
                                        text = "Search",
                                        color = Color.Gray,
                                        style = TextStyle(
                                            fontWeight = FontWeight.Medium,
                                            fontSize = 15.sp
                                        )
                                    )
                                }
                            }
                            Icon(
                                painterResource(id = R.drawable.mice),
                                contentDescription = "Mice",
                                tint = Color.Blue,
                                modifier = Modifier
                                    .size(20.dp)
                                    .padding(top = 3.dp)
                            )
                        }
                    })
            }

            Box(
                modifier = Modifier
                    .size(40.dp)
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
        Text(
            "Featured events",
            modifier = Modifier.padding(bottom = 8.dp),
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )

        )

        Card(
            shape = RoundedCornerShape(6.dp),
            elevation = CardDefaults.elevatedCardElevation(2.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 6.dp)

        ) {
            Box(
                modifier = Modifier
                    .height(140.dp)
                    .background(Color.Gray)
            ) {
                Column(
                    modifier = Modifier.padding(6.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painterResource(id = R.drawable.devfes),
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxWidth()
                            .size(100.dp)
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "join DevFest 2024",

                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.Black
                        ),
                        modifier = Modifier.padding(top = 6.dp)

                    )
                }

            }
            }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                "Upcoming events",
                modifier = Modifier.padding(bottom = 8.dp),
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
            )
            Text(
                text = "see all",
                style = TextStyle(
                    fontWeight = FontWeight.Medium,
                    color = Color.Blue
                )
            )
        }



        }
    }

@Composable
fun ViewPager(modifier: Modifier = Modifier) {
    val scaffold = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    val context = LocalContext.current
    val pagerState= rememberPagerState(

    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GDGApp(modifier: Modifier = Modifier) {
    SearchHeader()
}
