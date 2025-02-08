package br.android.cericatto.teachtest.ui._3_android_art_gallery.traditional

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import br.android.cericatto.teachtest.R

// View System Example - Manual Updates
class ArtGalleryActivity : AppCompatActivity() {
	private lateinit var paintingView: ImageView
	private lateinit var descriptionView: TextView

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_gallery)

		// Finding each view manually (like walking to each painting).
		paintingView = findViewById(R.id.paintingImageView)
		descriptionView = findViewById(R.id.descriptionTextView)

		// Manually updating each view (like physically changing each item).
		val viewModel = ArtGalleryViewModel()
		viewModel.painting.observe(this) { newPainting ->
			paintingView.setImageDrawable(newPainting)
		}
		val drawable: Drawable? = ContextCompat.getDrawable(this, R.drawable.android)
		viewModel.updatePainting(drawable!!)
	}
}
