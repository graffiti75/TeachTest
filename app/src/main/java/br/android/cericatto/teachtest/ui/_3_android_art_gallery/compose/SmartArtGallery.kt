package br.android.cericatto.teachtest.ui._3_android_art_gallery.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import br.android.cericatto.teachtest.R

data class Painting(
	val title: String = "Android Gallery",
	val description: String = "Android Gallery",
	val imageRes: Int = R.drawable.android
)

// The system automatically handles updates when 'painting' changes
@Composable
fun SmartArtGallery(
	painting: Painting,
	modifier : Modifier = Modifier
) {
	// Just declare what you want to see
	Column(
		modifier = modifier,
		horizontalAlignment = Alignment.CenterHorizontally
	) {
		Text(
			text = painting.description,
			style = TextStyle(
				fontSize = 40.sp
			)
		)
		Image(
			painter = painterResource(painting.imageRes),
			contentDescription = painting.title,
			modifier = Modifier.fillMaxSize()
		)
	}
}

@Preview
@Composable
private fun SmartArtGalleryPreview() {
	SmartArtGallery(
		painting = Painting(),
		modifier = Modifier,
	)
}