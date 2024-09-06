package com.example.snakebartest

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import kotlin.random.Random

class SnakeBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snake_bar)
    }

    fun defsn(view: View) {
        Snackbar.make(view,"Это простой SnackBar", Snackbar.LENGTH_LONG).show()
    }
    fun calls(view: View) {
        Snackbar.make(view,"Вернуть всё, как было?", Snackbar.LENGTH_LONG).setAction("Вернуть как было")
        {
            findViewById<View>(R.id.customsnack).setBackgroundColor(Color.parseColor("#C56EEB"))
            Snackbar.make(view,"Всё вернулось на свои места", Snackbar.LENGTH_LONG).show()
        }.show()
    }
    fun cussn(view: View) {
        Snackbar.make(view,"Поменять цвет фона?", Snackbar.LENGTH_LONG).setAction("Поменять")
        {
            val randomColor = Color.rgb(Random.nextInt(256), Random.nextInt(256), Random.nextInt(256))
            findViewById<View>(R.id.customsnack).setBackgroundColor(randomColor)
        }.show()
    }
}