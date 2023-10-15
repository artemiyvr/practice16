import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.practice16.R

class MainActivity : AppCompatActivity() {

    private var isDarkTheme = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(if (isDarkTheme) R.style.AppThemeDark else R.style.AppThemeLight)
        setContentView(R.layout.activity_main)
    }

    fun switchTheme() {
        isDarkTheme = !isDarkTheme
        recreate()
    }
}
