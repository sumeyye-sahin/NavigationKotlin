package com.sumeyyesahin.navigationkotlintekrar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class BlankFragment2 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            val kullaniciAdi = BlankFragment2Args.fromBundle(it).userName
            val textView = view.findViewById<android.widget.TextView>(R.id.textView2) // textView ID'sini kontrol edin
            textView.text = kullaniciAdi
        }

        val button = view.findViewById<Button>(R.id.button2) // button ID'sini kontrol edin
        button.setOnClickListener {
            val action = BlankFragment2Directions.actionBlankFragment2ToBlankFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }

}