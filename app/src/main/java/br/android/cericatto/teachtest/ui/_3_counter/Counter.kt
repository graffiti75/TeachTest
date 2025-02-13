package br.android.cericatto.teachtest.ui._3_counter

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Counter(
	modifier : Modifier = Modifier
) {
	// Define state using remember
	var count = 0
	println("count: $count")

	Column(
		modifier = modifier.fillMaxSize(),
		horizontalAlignment = Alignment.CenterHorizontally,
		verticalArrangement = Arrangement.Center
	) {
		// This text will recompose when count changes
		Text(
			text = "Count: $count",
			fontSize = 40.sp,
			style = MaterialTheme.typography.labelSmall
		)
		Spacer(modifier = Modifier.height(16.dp))
		Button(
			onClick = {
				// Updating state triggers recomposition
				count++
			}
		) {
			Text(
				text = "Increment",
				fontSize = 20.sp,
			)
		}
	}
}

@Preview
@Composable
private fun CounterComposablePreview() {
	Counter()
}

// var count by remember { mutableStateOf(0) }