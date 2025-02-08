package br.android.cericatto.teachtest.ui._2_compose_way

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ComposeViewModel : ViewModel() {
	private val _userName = MutableStateFlow("")
	val userName: StateFlow<String> = _userName

	init {
		updateUserName("Billy")
	}

	private fun updateUserName(newName: String) {
		_userName.value = newName
	}
}