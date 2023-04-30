package com.example.starter

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var editText: EditText
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.edit)
        button = findViewById(R.id.button)

        button.setOnClickListener(this)
    }

    @SuppressLint("QueryPermissionsNeeded")
    override fun onClick(v: View?) {
        val data = editText.text.toString()

        val intent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse(data)
        )

        val manager = packageManager
//        if (intent.resolveActivity(manager) != null) {
//            startActivity(intent)
//        }
        startActivity(intent)
    }
}