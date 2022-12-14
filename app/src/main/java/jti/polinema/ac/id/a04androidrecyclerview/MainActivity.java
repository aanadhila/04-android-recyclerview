package jti.polinema.ac.id.a04androidrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMakan;
    private ArrayList<Makanan> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMakan = findViewById(R.id.rv_makan);
        rvMakan.setHasFixedSize(true);

        list.addAll(MakananData.getListData());
        showRecyclerList();

    }

    private void showRecyclerList(){
      rvMakan.setLayoutManager(new LinearLayoutManager(this));
        ListMakananAdaptor listMakananAdaptor = new ListMakananAdaptor(list);
        rvMakan.setAdapter(listMakananAdaptor);

        listMakananAdaptor.setOnItemClickCallback(new ListMakananAdaptor.OnItemClickCallback() {
            @Override
            public void onItemClicked(Makanan makan) {
                Intent moveIntent = new Intent (MainActivity.this, Detail.class);
                moveIntent.putExtra(Detail.ITEM_EXTRA, makan);
                startActivity(moveIntent);
            }
        });
    }


}