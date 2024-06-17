package com.example.arabee.presentation.Hijaiyah;

import androidx.recyclerview.widget.RecyclerView;


import com.example.arabee.data.model.Hijaiyah;
import com.example.arabee.databinding.ItemHijaiyahBinding;

public class HijaiyahViewHolder extends RecyclerView.ViewHolder {

    private final ItemHijaiyahBinding binding;
    private final HijaiyahAdapter.OnItemClickListener itemClickListener;

    public HijaiyahViewHolder(ItemHijaiyahBinding binding, HijaiyahAdapter.OnItemClickListener itemClickListener) {
        super(binding.getRoot());
        this.binding = binding;
        this.itemClickListener = itemClickListener;
    }

    public void bindView(Hijaiyah item) {
//        binding.ivHijaiyah.setImageResource(item.getImage());
        itemView.setOnClickListener(v -> itemClickListener.onItemClick(item));
    }
}
