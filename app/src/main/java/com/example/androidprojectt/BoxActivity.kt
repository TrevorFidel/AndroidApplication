package com.example.androidprojectt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidprojectt.ui.theme.AndroidProjectTTheme

class BoxActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidProjectTTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreeen()

                }
            }
        }
    }
}
@Composable
fun HomeScreeen(){
    Box(modifier = Modifier
        .background(Color.Cyan)
        .fillMaxSize(),
        contentAlignment = Alignment.Center){
        Box(modifier = Modifier
            .background(Color.Green)
            .width(150.dp)
            .height(150.dp),
            contentAlignment = Alignment.BottomCenter){
            Box(modifier = Modifier
                .background(Color.Magenta)){
                Text(text = "Please read the terms and conditions",
                fontSize = 20.sp)
            }

        }
    }
}
@Preview
@Composable
fun HomeScreenPreview(){
    HomeScreeen()
}
