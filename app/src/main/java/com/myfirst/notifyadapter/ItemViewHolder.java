package com.myfirst.notifyadapter;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder {

    private ItemClickListener itemClickListener;
    private RelativeLayout mRlItem;
    private TextView mTvItem;

    public ItemViewHolder(@NonNull View itemView,ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        initViews();
    }

    private void initViews() {
        mRlItem = itemView.findViewById(R.id.rlItem);
        mTvItem = itemView.findViewById(R.id.tvItem);
    }

    public void setData(Item item){
        mRlItem.setBackground(item.getBackground());
        mTvItem.setText(item.getText());
        mTvItem.setTextColor(item.getTextColor());
        mRlItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onClick(item.getBoolean(),item,getAdapterPosition());
            }
        });
    }
}
