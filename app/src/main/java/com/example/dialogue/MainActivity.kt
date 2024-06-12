package com.example.dialogue

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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
            builder1.setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, which ->
                // Action to be performed when Yes is clicked
                finish()
            })
            builder1.setNegativeButton("No", DialogInterface.OnClickListener { dialog, which ->
                // Action to be performed when No is clicked
                dialog.dismiss()
            })
            builder1.show()
        }

        binding.btn2.setOnClickListener {
            val options = arrayOf("Leg piece", "Kali march chicken", "Tandoori chicken", "Mai vegetarian hu")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Which is your favourite Dish ?")
            builder2.setSingleChoiceItems(options, 0, DialogInterface.OnClickListener { dialog, which ->
                // Action to be performed when an item is clicked
                Toast.makeText(this, "You clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("Submitted", DialogInterface.OnClickListener { dialog, which ->
                // Action to be performed when Submitted is clicked
                finish()
            })
            builder2.setNegativeButton("Declined", DialogInterface.OnClickListener { dialog, which ->
                // Action to be performed when Declined is clicked
                dialog.dismiss()
            })
            builder2.show() // This line was missing
        }

        binding.btn3.setOnClickListener {
            val options = arrayOf("Leg piece", "Kali march chicken", "Tandoori chicken", "Mai vegetarian hu")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Which is your favourite Dish ?")
            builder2.setMultiChoiceItems(options,null,DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                Toast.makeText(this, "You clicked on ${options[which]}", Toast.LENGTH_SHORT).show()

            })
            builder2.setPositiveButton("Submitted", DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this, "You clicked on ${options[which]}", Toast.LENGTH_SHORT).show()

                // Action to be performed when Submitted is clicked
                finish()
            })
            builder2.setNegativeButton("Declined", DialogInterface.OnClickListener { dialog, which ->
                // Action to be performed when Declined is clicked
                dialog.dismiss()
            })
            builder2.show() // This line was missing

        }
    }
}
