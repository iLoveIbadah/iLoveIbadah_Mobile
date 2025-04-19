package com.programir.iloveibadah

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.programir.iloveibadah.Greeting
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            App()
//            MaterialTheme {
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colors.background
//                ) {
//                    val scope = rememberCoroutineScope()
//                    var text by remember { mutableStateOf("Loading") }
//                    LaunchedEffect(true) {
//                        scope.launch {
//                            text = try {
//                                Greeting().greet()
//                            } catch (e: Exception) {
//                                e.localizedMessage ?: "error"
//                            }
//                        }
//                    }
//                    GreetingView(text)
//                }
//            }
        }
    }
}
//@Composable
//fun GreetingView(text: String) {
//    Text(text = text)
//}

@Preview
@Composable
fun AppAndroidPreview() {
    //GreetingView("Hello, Android!")
    App()
}