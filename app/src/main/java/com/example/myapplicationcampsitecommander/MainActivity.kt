package com.example.myapplicationcampsitecommander

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Locale

class MainActivity: AppCompatActivity(){
    val Itemname = arrayOf(
        "Sleeping Bag",
        "Tinned Food",
        "Matchstick box",
    )
    val category = arrayOf""( Shelter, Food, Safety)
    val quantity = arrayOf(3,7,4)

    val comments = arrayOf(One per person, For eating,To start a fire)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtTable =
            findViewById<TextView>(R.id.txtTable)

        val txtResults =

            findViewById<TextView>(R.id.txtResults)

        val btnCalculate =
            findViewById<Button>(R.id.btnCalculate)

        //Dispalay table
        var table = "ITEMNAME\tCATEGORY\tQUANTITY\tComments\n\n"

        for(i in Itemname.indices) {

            table +=
                "${Itemname[i]}\t${category[i]}\t${quantity[i]}\t${comments[i]}\n"
        }
        txtTable.text=table

        //Calculate totals
        btnCalculate.setOnClickListener {
            var totalMax = 0

            for (quantity) {
                totalMax += quantity
            }
            val totalCap=
                totalMax / quantity.size

            txtResults.text =
                "Total quantity:$totalMax\n" +
        }
    }
}


