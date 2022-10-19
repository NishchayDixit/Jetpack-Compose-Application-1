package com.example.mycomposeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycomposeapplication.ui.theme.MyComposeApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    InstagramPostDesign()
                }
            }
        }
    }
}

@Composable
fun InstagramPostDesign() {
    val jetpack_img = painterResource(id = R.drawable.jetpack_compose_icon)
    val user_img = painterResource(id = R.drawable.madara02)
//    val shape = RoundedCornerShape(12.dp)

    Column(
        modifier = Modifier
            .fillMaxSize()

    ) {

        Box(
            Modifier
                .fillMaxWidth()
                .background(Color.White)
        ) {
            Image(
                painter = painterResource(R.drawable.instagram_log),
                contentDescription = "Insta Logo"
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .border(0.2.dp, Color(186, 186, 186))
                .background(Color.White)
                .wrapContentSize(Center)
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Row(modifier = Modifier.padding(start = 12.dp)) {
                    Image(
                        painter = user_img,
                        contentDescription = "Profile Pic",
                        modifier = Modifier
                            .clip(
                                CircleShape
                            )
                            .size(50.dp)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Column() {
                        Text(
                            text = "Nishchay Dixit",
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp,
                            color = Color(56, 112, 179, 255)
                        )
                        Text(text = "Rajkot, Gujarat", fontSize = 14.sp)
                    }
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_baseline_more_vert_24),
                        contentDescription = "More"
                    )
                }
            }
            Image(
                painter = jetpack_img,
                contentDescription = "Post Pic",
                modifier = Modifier
                    .fillMaxWidth(),
                contentScale = ContentScale.FillWidth
            )
            Text(
                text = "Jetpack Compose",
                textAlign = TextAlign.Center,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color(8, 48, 66, 255),
                modifier = Modifier
                    .padding(start = 5.dp)
                    .wrapContentSize(
                        Center
                    )
                    .fillMaxWidth()
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(R.drawable.like),
                            contentDescription = "Likes",
                            tint = Color(191, 43, 33),
                            modifier = Modifier.size(25.dp)
                        )
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(R.drawable.comment),
                            contentDescription = "Comment",
                            modifier = Modifier.size(36.dp)
                        )
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(R.drawable.share),
                            contentDescription = "Share",
                            modifier = Modifier.size(25.dp)
                        )
                    }
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(R.drawable.save),
                        contentDescription = "Save Post",
                        modifier = Modifier.size(35.dp)
                    )
                }
            }
            Column(modifier = Modifier.padding(horizontal = 12.dp)) {
                Text(text = "18,543,488 likes", fontWeight = FontWeight.Medium)
                Text(
                    text = buildAnnotatedString {
                        append(
                            AnnotatedString(
                                text = "Nishchay Dixit",
                                spanStyle = SpanStyle(fontWeight = FontWeight.Medium)
                            )
                        )
                        append(text = " New Learning journey begins with Jetpack Compose")
                    }
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "View all 1,567,21 comments",
                    color = Color.DarkGray,
                    fontSize = 13.sp,
                    modifier = Modifier.padding(bottom = 13.dp)
                )
            }
        }
        Box(modifier = Modifier.fillMaxWidth()) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 200.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Made With", Modifier.wrapContentWidth(Alignment.Start))
                Row() {
                    Text(
                        text = "Jetpack Compose",
                        Modifier.padding(top = 5.dp),
                        fontSize = 20.sp,
                        color = Color(8, 48, 66, 255),
                        fontWeight = FontWeight.Medium
                    )
                    Image(
                        painter = painterResource(R.drawable.jetpack_compose_icon_rgb),
                        contentDescription = "logo",
                        Modifier.size(40.dp, 40.dp)
                    )
                }
            }
        }
//        Text(
//            text = "Made by Nishchay Dixit in Jetpack Compose",
//            fontWeight = FontWeight.Medium,
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(top = 30.dp),
//            textAlign = TextAlign.Center
//        )
//        Text(
//            text = (buildAnnotatedString {
//                append(
//                    text = "#ThursdayTrivia"
//                )
//                append(
//                    text = "  #ComposeCamp"
//                )
//                append(
//                    text = "  #DeveloperStudentClubs"
//                )
//            }), modifier = Modifier.padding(start = 12.dp)
//        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyComposeApplicationTheme {
        InstagramPostDesign()
    }
}