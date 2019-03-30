package com.example.cake

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val setList = HashMap<String,String>()
        addBtn.setOnClickListener{
            val vocabWord = vocabWordBox.text.toString()
            val vocabDef = definitionBox.text.toString()
            val currItems = setItems.text.toString()
            val newItems = "Word: $vocabWord Definition: $vocabDef \r\n"
            val items: String
            setList[vocabWord] = vocabDef
            items = currItems + newItems
            setItems.text = items
        }
        if(vocabWordBox.toString().isBlank()){
            val hdrTxt = "Clear"
            header.text = hdrTxt
        }else{
            val hdrTxt = "Create Set"
            header.text = hdrTxt
        }


    }
}
