package com.example.dialogue

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.dialogue.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Are you Sure ?")
            builder1.setMessage("Do you want to close the app")
            builder1.setPositiveButton("Yes",DialogInterface.OnClickListener { dialog, which ->
                finish()
            })
            builder1.setNegativeButton("No",DialogInterface.OnClickListener { dialog, which ->

            })
            builder1.show()
        }

    }
}
