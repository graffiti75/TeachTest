package br.android.cericatto.teachtest.ui._3_android_art_gallery.traditional

import android.graphics.drawable.Drawable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ArtGalleryViewModel : ViewModel() {
	// Private mutable LiveData to store the actual data
	private val _painting = MutableLiveData<Drawable>(null)

	// Public immutable LiveData for traditional view system
	val painting: LiveData<Drawable> = _painting

	// Function to update the user name
	fun updatePainting(painting: Drawable) {
		_painting.value = painting
	}

	// Clean up when ViewModel is cleared
	override fun onCleared() {
		super.onCleared()
		// Remove the forever observer to prevent memory leaks
		painting.removeObserver { }
	}
}