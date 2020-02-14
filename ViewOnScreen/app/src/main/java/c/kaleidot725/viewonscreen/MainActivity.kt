package c.kaleidot725.viewonscreen

import android.graphics.Point
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        location_in_window_button.setOnClickListener { toastAllViewLocationInWindow() }
        location_on_screen_button.setOnClickListener { toastAllViewLocationOnScreen() }
    }

    private fun toastAllViewLocationInWindow() {
        var str = getViewLocationInWindowString("one", one) + "\n"
        str += getViewLocationInWindowString("two", two) + "\n"
        str += getViewLocationInWindowString("three", three) + "\n"
        str += getViewLocationInWindowString("four", four) + "\n"
        str += getViewLocationInWindowString("five", five) + "\n"
        str += getViewLocationInWindowString("six", six) + "\n"
        str += getViewLocationInWindowString("seven", seven) + "\n"
        str += getViewLocationInWindowString("eight", eight) + "\n"
        str += getViewLocationInWindowString("nine", nine) + "\n"
        Toast.makeText(applicationContext, str, Toast.LENGTH_LONG).show()
    }

    private fun getViewLocationInWindowString(name: String, view: View): String {
        val inWindow = view.getLocationPointInWindow()
        return "${name} inWindow ${inWindow}"
    }

    private fun toastAllViewLocationOnScreen() {
        var str = getViewLocationOnScreenString("one", one) + "\n"
        str += getViewLocationOnScreenString("two", two) + "\n"
        str += getViewLocationOnScreenString("three", three) + "\n"
        str += getViewLocationOnScreenString("four", four) + "\n"
        str += getViewLocationOnScreenString("five", five) + "\n"
        str += getViewLocationOnScreenString("six", six) + "\n"
        str += getViewLocationOnScreenString("seven", seven) + "\n"
        str += getViewLocationOnScreenString("eight", eight) + "\n"
        str += getViewLocationOnScreenString("nine", nine) + "\n"
        Toast.makeText(applicationContext, str, Toast.LENGTH_LONG).show()
    }

    private fun getViewLocationOnScreenString(name: String, view: View): String {
        val onScreen = view.getLocationPointOnScreen()
        return "${name} onScreen ${onScreen}"
    }

    private fun View.getLocationPointInWindow(): Point {
        val array = IntArray(2)
        this.getLocationInWindow(array)
        return Point(array[0], array[1])
    }

    private fun View.getLocationPointOnScreen(): Point {
        val array = IntArray(2)
        this.getLocationOnScreen(array)
        return Point(array[0], array[1])
    }

    private fun printLocationInWindow() {
        val textView = findViewById<TextView>(R.id.text_view)
        val point = textView.getLocationPointInWindow()
        Log.v("LOG", "X ${point.x} Y ${point.y}")
    }

    private fun printLocationOnScreen() {
        val textView = findViewById<TextView>(R.id.text_view)
        val point = textView.getLocationPointOnScreen()
        Log.v("LOG", "X ${point.x} Y ${point.y}")
    }
}
