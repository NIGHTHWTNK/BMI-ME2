package th.ac.su.apichat.app.bmime2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        var bmiScore = findViewById<TextView>(R.id.tvResult)
        var result = findViewById<TextView>(R.id.tvResult2)
        var detail = findViewById<TextView>(R.id.tvResult3)

        
    }
}
