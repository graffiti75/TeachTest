package br.android.cericatto.teachtest.ui._2_compose_way

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun UserName(
	modifier : Modifier = Modifier
) {
	var userName by remember { mutableStateOf("Doug") }
	Column(
		verticalArrangement = Arrangement.Center,
		horizontalAlignment = Alignment.CenterHorizontally,
		modifier = modifier.fillMaxSize()
			.background(Color.Black)
	) {
		Text(
			style = TextStyle(
				fontSize = 40.sp,
				color = Color.White
			),
			text = userName
		)
	}
}

@Preview
@Composable
private fun UserNamePreview() {
	UserName()
}