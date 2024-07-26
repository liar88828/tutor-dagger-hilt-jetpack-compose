package com.tutor.tutor_dagger_hilt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import com.tutor.tutor_dagger_hilt.ui.theme.TutordaggerhiltTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContent {
			TutordaggerhiltTheme {
//				val mainVM = hiltViewModel<UserVM>()

				Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
					Text("Hello World")
				}
			}
		}
	}
}

