package br.android.cericatto.teachtest.ui._1_traditional_way

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import br.android.cericatto.teachtest.R

class TraditionalActivity : AppCompatActivity() {
	private lateinit var nameTextView: TextView

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_traditional)

		nameTextView = findViewById(R.id.nameTextView)

		// Update UI manually
		nameTextView.text = "Bill"
	}
}