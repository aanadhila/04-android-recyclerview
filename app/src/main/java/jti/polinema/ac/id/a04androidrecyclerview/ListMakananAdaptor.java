package jti.polinema.ac.id.a04androidrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class ListMakananAdaptor extends RecyclerView.Adapter<ListMakananAdaptor.ListViewHolder>{
    private ArrayList<Makanan> listMakanan;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onitemClickCallback){
    this.onItemClickCallback = onitemClickCallback;
    };

    public ListMakananAdaptor(ArrayList<Makanan> list){
        this.listMakanan = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_menu, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
     Makanan makan = listMakanan.get(position);
        Glide.with(holder.itemView.getContext())
                .load(makan.getPhoto())
                .apply(new RequestOptions().override(55, 55 ))
                .into(holder.imgPhoto);
        holder.tvName.setText(makan.getNama());
        holder.tvDetail.setText(makan.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listMakanan.get(holder.getAdapterPosition()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return listMakanan.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        ListViewHolder(View itemview) {
            super(itemview);
            imgPhoto = itemview.findViewById(R.id.img_item_menu);
            tvName = itemview.findViewById(R.id.tv_item_name);
            tvDetail = itemview.findViewById(R.id.tv_item_detail);

        }
    }
    public interface OnItemClickCallback{
      void onItemClicked(Makanan data);
    };
}
