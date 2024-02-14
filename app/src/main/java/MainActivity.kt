import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.datingapp.pacaya.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val browseButton = findViewById<Button>(R.id.browseButton)
        browseButton.setOnClickListener {
            // Navigate to browse activity or any other desired functionality
            startActivity(Intent(this, BrowseActivity::class.java))
        }
    }
}

class BrowseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_browse) // Ensure you have a layout named activity_browse.xml
    }
}
