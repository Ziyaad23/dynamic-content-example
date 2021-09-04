package com.ziyaad.dynamiccontentexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.ziyaad.dynamiccontentexample.ui.theme.DynamicContentExampleTheme

val namesList:List<String> = listOf("John", "Michael", "Paul", "Bala")

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingList(namesList)
        }
    }
}

@Composable
fun GreetingList(names: List<String>){
    Column() {
        for(name in names){
            Greeting(name = name)
        }
    }
}

@Composable
fun Greeting(name: String){
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GreetingList(namesList)
}