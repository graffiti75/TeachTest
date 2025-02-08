package br.android.cericatto.teachtest.ui._3_android_art_gallery.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import br.android.cericatto.teachtest.ui._2_compose_way.ComposeViewModel
import br.android.cericatto.teachtest.ui.theme.TeachTestTheme

class SmartArtComposeActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		val viewModel = ComposeViewModel()
		enableEdgeToEdge()
		setContent {
			TeachTestTheme {
				Scaffold(
					modifier = Modifier.fillMaxSize()
				) { innerPadding ->
					SmartArtGallery(
						painting = Painting(),
						modifier = Modifier.padding(innerPadding)
							.fillMaxSize()
					)
				}
			}
		}
	}
}