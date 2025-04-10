package za.ac.iie.imad


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputTime = findViewById<EditText>(R.id.editTextText)
        val suggestButton = findViewById<Button>(R.id.button2)
        val resetButton = findViewById<Button>(R.id.button)
        val suggestionText = findViewById<TextView>(R.id.textView)

        suggestButton.setOnClickListener {
            val timeOfDay = inputTime.text.toString().trim().lowercase()
            val mealSuggestion = if (timeOfDay == "morning") {
               "eggs and bacon "
            } else if (timeOfDay == "mid-morning") {
                "Fruit salad"
            } else if (timeOfDay == "afternoon") {
                "spaghetti"
            } else if (timeOfDay == "mid-afternoon") {
                "Cake"
            } else if (timeOfDay == "dinner") {
                "veggie burgers"
            } else {
                "Invalid input! Please enter a valid meal time."
            }
            suggestionText.text = mealSuggestion.toString()
        }

        resetButton.setOnClickListener {
            inputTime.text.clear()
            suggestionText.text = ""
        }
    }
}


