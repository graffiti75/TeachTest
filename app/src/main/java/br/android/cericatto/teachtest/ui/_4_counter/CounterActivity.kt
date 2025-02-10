package br.android.cericatto.teachtest.ui._4_counter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import br.android.cericatto.teachtest.ui.theme.TeachTestTheme

class CounterActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContent {
			TeachTestTheme {
				Scaffold(
					modifier = Modifier.fillMaxSize()
				) { innerPadding ->
					Counter(
						modifier = Modifier.padding(innerPadding)
							.fillMaxSize()
					)
				}
			}
		}
	}
}