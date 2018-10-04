package com.example.asus.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {
    ListView listview;
    Person p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18;
    ArrayList<Person> liste = new ArrayList<Person>();
    ListeViewAdapter lva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listview = (ListView) findViewById(R.id.listview_lv);
        p1 = new Person(23, "joe", "Doe");
        p2 = new Person(23, "joe", "Doe");
        p3 = new Person(23, "joe", "Doe");
        p4 = new Person(23, "joe", "Doe");
        p5 = new Person(23, "joe", "Doe");
        p6 = new Person(23,"joe", "Doe");
        p7 = new Person(23, "joe", "Doe");
        p8 = new Person(23, "joe", "Doe");
        p9 = new Person(23, "joe", "Doe");
        p10 = new Person(23, "joe", "Doe");
        p11 = new Person(23, "Mik", "Biel");
        p12 = new Person(23, "Mik", "Biel");
        p13 = new Person(23, "Mik", "Biel");
        p14 = new Person(23, "Mik", "Biel");
        p15 = new Person(23, "Mik", "Biel");
        p16 = new Person(23, "Mik", "Biel");
        p17 = new Person(23, "Mik", "Biel");
        p18 = new Person(23, "Mik", "Biel");

        liste.add(p1);
        liste.add(p2);
        liste.add(p3);
        liste.add(p4);
        liste.add(p5);
        liste.add(p6);
        liste.add(p7);
        liste.add(p8);
        liste.add(p9);
        liste.add(p10);
        liste.add(p11);
        liste.add(p12);
        liste.add(p13);
        liste.add(p14);
        liste.add(p15);
        liste.add(p16);
        liste.add(p17);
        liste.add(p18);
        lva = new ListeViewAdapter(getApplicationContext(), liste);
        listview.setAdapter(lva);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String elt = (String) parent.getItemAtPosition(position).toString();
                //TextView v=(TextView) view.findViewById(R.id.person_item_tv);
                Toast.makeText(getApplicationContext(), "Element de la liste", Toast.LENGTH_LONG).show();

            }
        });


    }
}