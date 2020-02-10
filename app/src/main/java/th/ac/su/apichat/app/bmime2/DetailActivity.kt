package th.ac.su.apichat.app.bmime2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val score = intent.getDoubleExtra("bmiScore",0.0)
        val result = intent.getStringExtra("result")
        val getweight = intent.getDoubleExtra("scoreWeight",0.0)
        val getheight = intent.getDoubleExtra("scoreHeight",0.0)



        var bmiScore = findViewById<TextView>(R.id.tvResult)
        bmiScore.setText(score.round(2).toString())

        var resultDisplay = findViewById<TextView>(R.id.tvResult2)
        resultDisplay.setText(result)

        var detail = findViewById<TextView>(R.id.tvResult3)
        detail.setText(" height " + getheight +" weight "+getweight)

        var btnShare = findViewById<Button>(R.id.btnShare)

        btnShare.setOnClickListener {
            var value = "My BMI is "+score.round(2) +"("+result+")"

            var intent = Intent();
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,value)
            intent.type = "text/plan"

            startActivity(Intent.createChooser(intent,"Share"))

            startActivity(intent)

        }

        var btnback = findViewById<Button>(R.id.btnexit)
        btnback.setOnClickListener {
            finish()

        }
    }
    fun Double.round(decimals: Int): Double {
        var multiplier = 1.0
        repeat(decimals) { multiplier *= 10 }
        return kotlin.math.round(this * multiplier) / multiplier
    }
}
