package com.example.arabee.presentation.Hijaiyah;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.arabee.data.model.Hijaiyah;
import com.example.arabee.databinding.ItemHijaiyahBinding;

import java.util.List;

public class HijaiyahAdapter extends RecyclerView.Adapter<HijaiyahViewHolder> {

    private final AsyncListDiffer<Hijaiyah> dataDiffer = new AsyncListDiffer<>(this,
            new DiffUtil.ItemCallback<Hijaiyah>() {
                @Override
                public boolean areItemsTheSame(Hijaiyah oldItem, Hijaiyah newItem) {
                    return oldItem.getID() == newItem.getID();
                }

                @Override
                public boolean areContentsTheSame(Hijaiyah oldItem, Hijaiyah newItem) {
                    return oldItem.equals(newItem);
                }
            });

    private final OnItemClickListener itemClickListener;
    private final AdapterLayoutMode adapterLayoutMode;

    public HijaiyahAdapter(AdapterLayoutMode adapterLayoutMode, OnItemClickListener itemClickListener) {
        this.adapterLayoutMode = adapterLayoutMode;
        this.itemClickListener = itemClickListener;
    }

    public void submitData(List<Hijaiyah> data) {
        dataDiffer.submitList(data);
    }

    @Override
    public HijaiyahViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemHijaiyahBinding binding = ItemHijaiyahBinding.inflate(
                LayoutInflater.from(parent.getContext()),
                parent,
                false
        );
        return new HijaiyahViewHolder(binding, itemClickListener);
    }

    @Override
    public void onBindViewHolder(HijaiyahViewHolder holder, int position) {
        holder.bindView(dataDiffer.getCurrentList().get(position));
    }

    @Override
    public int getItemCount() {
        return dataDiffer.getCurrentList().size();
    }

    public interface OnItemClickListener {
        void onItemClick(Hijaiyah category);
    }
}
