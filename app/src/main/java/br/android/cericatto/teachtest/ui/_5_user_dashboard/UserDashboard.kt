package br.android.cericatto.teachtest.ui._5_user_dashboard

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun UserDashboard(user: User) {
	var isEditing by remember { mutableStateOf(false) }

	Column {
		// This only recomposes when user.name changes
		UserHeader(user.name)

		// This only recomposes when isEditing changes
		if (isEditing) {
			UserEditForm(user)
		} else {
			UserInfo(user)
		}

		// This only recomposes when isEditing changes
		Button(
			onClick = { isEditing = !isEditing }
		) {
			Text(if (isEditing) "Save" else "Edit")
		}
	}
}

data class User(
	val name: String
)
data class UserHeader(
	val title: String
)
data class UserEditForm(
	val user: User
)
data class UserInfo(
	val user: User
)