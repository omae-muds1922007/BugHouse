package app.nickname.myoji.bughouse

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_save.*

class SaveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_save)

        saveButton.setOnClickListener {
            val sharedPreferences = getSharedPreferences("Save%Load", Context.MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            val text = input.text.toString()
            editor.putString("SAVE_DATA", text)
            editor.apply()
        }
    }

}
