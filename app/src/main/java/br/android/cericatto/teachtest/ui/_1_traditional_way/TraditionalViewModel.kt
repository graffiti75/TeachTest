package br.android.cericatto.teachtest.ui._1_traditional_way

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TraditionalViewModel : ViewModel() {
	// Private mutable LiveData to store the actual data
	private val _userName = MutableLiveData<String>("")

	// Public immutable LiveData for traditional view system
	val userName: LiveData<String> = _userName

	// Function to update the user name
	fun updateUserName(newName: String) {
		_userName.value = newName
	}

	// Clean up when ViewModel is cleared
	override fun onCleared() {
		super.onCleared()
		// Remove the forever observer to prevent memory leaks
		userName.removeObserver { }
	}
}