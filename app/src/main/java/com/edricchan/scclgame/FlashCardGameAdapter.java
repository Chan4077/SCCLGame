package com.edricchan.scclgame;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * An adapter used for the RecyclerView
 */

public class FlashCardGameAdapter extends RecyclerView.Adapter<FlashCardGameAdapter.FlashCardGameViewHolder> {
    List<FlashCardGame> flashCardGames;
    Context context;

    FlashCardGameAdapter(List<FlashCardGame> flashCardGames, Context context) {
        this.flashCardGames = flashCardGames;
        this.context = context;
    }

    @Override
    public int getItemCount() {
        return flashCardGames.size();
    }

    @Override
    public FlashCardGameViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.flash_card_game_container, viewGroup, false);
        FlashCardGameViewHolder flashCardGameViewHolder = new FlashCardGameViewHolder(view, context);
        return flashCardGameViewHolder;
    }

    @Override
    public void onBindViewHolder(FlashCardGameViewHolder flashCardGameViewHolder, int i) {
        flashCardGameViewHolder.chiText.setText(flashCardGames.get(i).chiText);
        flashCardGameViewHolder.pinyin.setText(flashCardGames.get(i).pinyin);
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public static class FlashCardGameViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        TextView chiText;
        TextView pinyin;

        FlashCardGameViewHolder(View itemView, final Context context) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.flashCardGameCardView);
            chiText = (TextView) itemView.findViewById(R.id.chiText1);
            pinyin = (TextView) itemView.findViewById(R.id.pinyin1);
        }
    }
}
