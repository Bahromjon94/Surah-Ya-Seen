package uz.bahromjon.surahyaseen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private SurahAdapter adapter;
    private List<Surah> yaSeen;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);
        yaSeen = new ArrayList<>();
        adapter = new SurahAdapter(this, yaSeen);
        listView.setAdapter(adapter);

        getAyat();
    }

    public void getAyat() {

        yaSeen.add(new Surah(1, getString(R.string.one)));
        yaSeen.add(new Surah(2, getString(R.string.two)));
        yaSeen.add(new Surah(3, getString(R.string.three)));
        yaSeen.add(new Surah(4, getString(R.string.four)));

    }
}