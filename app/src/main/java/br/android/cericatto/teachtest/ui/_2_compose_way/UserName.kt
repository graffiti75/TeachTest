package br.android.cericatto.teachtest.ui._2_compose_way

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle

@Composable
fun UserName(
	viewModel : ComposeViewModel = ComposeViewModel(),
	modifier : Modifier = Modifier
) {
	val userName by viewModel.userName.collectAsStateWithLifecycle()
	Column(
		verticalArrangement = Arrangement.Center,
		horizontalAlignment = Alignment.CenterHorizontally,
		modifier = modifier
	) {
		Text(
			style = TextStyle(
				fontSize = 40.sp
			),
			text = userName
		)
	}
}