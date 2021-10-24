package com.gnuvil_practice_ko.class_6.recyclerview;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gnuvil_practice_ko.class_6.R;

public class PostViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public CheckBox cbLike;
    public ImageView ivImg, ivShare;
    public TextView tvLikeCount, tvUserName, tvPostText;
    private PostAdapter mAdapter;

    public PostViewHolder(@NonNull View itemView, PostAdapter postAdapter) {
        super(itemView);
        mAdapter = postAdapter;

        ivImg = (ImageView) itemView.findViewById(R.id.iv_img);
        cbLike = (CheckBox) itemView.findViewById(R.id.cb_like);
        ivShare = (ImageView) itemView.findViewById(R.id.iv_share);
        tvLikeCount = (TextView) itemView.findViewById(R.id.tv_like_count);
        tvUserName = (TextView) itemView.findViewById(R.id.tv_username);
        tvPostText = (TextView) itemView.findViewById(R.id.tv_posttext);

        cbLike.setOnClickListener(this);
        ivShare.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        int position = getAdapterPosition();

        switch (view.getId()){
            case R.id.cb_like:
                mAdapter.onLikeClicked(position);
                break;

            case R.id.iv_share:
                break;
        }
    }
}
