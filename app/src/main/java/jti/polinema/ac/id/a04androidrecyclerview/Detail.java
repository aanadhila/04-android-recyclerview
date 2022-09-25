package jti.polinema.ac.id.a04androidrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Detail extends AppCompatActivity {
    public static final String ITEM_EXTRA = "item_extra";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imgMakanan = findViewById(R.id.imgMakanan);
        TextView tvMakananNama = findViewById(R.id.tvMakananNama);
        TextView tvMakananDetail = findViewById(R.id.tvMakananDetail);

        Makanan makan = getIntent().getParcelableExtra(ITEM_EXTRA);
        if(makan != null ){
            Glide.with(this)
                .load(makan.getPhoto())
                    .into(imgMakanan);
            tvMakananNama.setText(makan.getNama());
            tvMakananDetail.setText(makan.getDetail());
        }
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Detail Makanan");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}