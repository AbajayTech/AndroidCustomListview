package com.example.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listview:ListView=findViewById(R.id.list_view)
        val list= mutableListOf<Model>()
        list.add(Model("Building","Architecture. a building of exceptional height completely supported by a framework," +
                " as of girders, from which the walls are suspended",R.drawable.buildingone))
        list.add(Model("Tower","The Burj Khalifa (/ˈbɜːrdʒ kəˈliːfə/; Arabic: برج خليفة, Arabic pronunciation: [bʊrd͡ʒ xaˈliːfa], Khalifa Tower), " +
                "known as the Burj Dubai prior to its inauguration in 2010, is a skyscraper in Dubai, United Arab Emirates.",R.drawable.buildingtwo))
        list.add(Model("Real Estate","People build skyscrapers primarily because they are convenient -" +
                "- you can create a lot of real estate out of a relatively small ground area.\n",R.drawable.buildingthree))
        list.add(Model("Skyscraaper","Dubai: A new skyscraper in Dubai – launched by Binghatti – is aiming to be the world’s tallest residential structure." +
                " In the process, the developer has coined a new term – ‘hyper-tower’.",R.drawable.buildingfour))
        list.add(Model("Monumental Building","The UK will be Europe’s best performing real estate market over the next five years because UK property yields are less vulnerable to rate" +
                " hikes than continental peers, according to a report published Thursday by AEW",R.drawable.buildingfive))
        list.add(Model("Apartment","A skyscraper is a tall continuously habitable building having multiple floors." +
                " Modern sources currently define skyscrapers as being at least 100 metres ",R.drawable.buildingsix))

        listview.adapter=MyAdapter(this,R.layout.row,list)

    }
}
