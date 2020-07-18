package app.nickname.myoji.bughouse

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_count.*

class LoadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_load)

        val sharedPreferences = getSharedPreferences("Save%Load", Context.MODE_PRIVATE)
        textView.text = sharedPreferences.getString("SAVE_DATA", "")
    }
}
