package sg.edu.rp.c346.id19013886.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvAndroid;
    //ArrayList<String> alAndroid;
    //ArrayAdapter<String> aaAndroid;
    ArrayList<AndroidVersion> alAndroid;
    //ArrayAdapter<AndroidVersion> aaAndroid;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAndroid = findViewById(R.id.lvAndroid);
        alAndroid = new ArrayList<>();

        /*alAndroid.add("Pie - 9.0");
        alAndroid.add("Oreo - 8.0 - 8.1");
        alAndroid.add("Nougat - 7.0 - 7.1.2");
        alAndroid.add("Marshmallow - 6.0 - 6.0.1");
        alAndroid.add("Lollipop - 5.0 - 5.1.1");
        alAndroid.add("KitKat - 4.4 - 4.4.4");
        alAndroid.add("Jelly Bean - 4.1 - 4.3.1");*/

        alAndroid.add(new AndroidVersion("Pie", "9.0"));
        alAndroid.add(new AndroidVersion("Oreo", "8.0 - 8.1"));
        alAndroid.add(new AndroidVersion("Nougat", "7.0 - 7.1.2"));
        alAndroid.add(new AndroidVersion("Marshmallow", "6.0 - 6.0.1"));
        alAndroid.add(new AndroidVersion("Lollipop", "5.0 - 5.1.1"));
        alAndroid.add(new AndroidVersion("KitKat", "4.4 - 4.4.4"));
        alAndroid.add(new AndroidVersion("Jelly Bean", "4.1 - 4.3.1"));

        //aaAndroid = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alAndroid);
        //lvAndroid.setAdapter(aaAndroid);

        adapter = new CustomAdapter(this, R.layout.row, alAndroid);
        lvAndroid.setAdapter(adapter);

    }
}