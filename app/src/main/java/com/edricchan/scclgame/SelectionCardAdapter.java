package com.edricchan.scclgame;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.TooltipCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.List;

/**
 * An adapter used for the RecyclerView
 */

public class SelectionCardAdapter extends RecyclerView.Adapter<SelectionCardAdapter.SelectionCardViewHolder> {
    List<SelectionCard> selectionCards;
    Context context;

    SelectionCardAdapter(List<SelectionCard> selectionCards, Context context) {
        this.selectionCards = selectionCards;
        this.context = context;
    }

    @Override
    public int getItemCount() {
        return selectionCards.size();
    }

    @Override
    public SelectionCardViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.selection_card_container, viewGroup, false);
        SelectionCardViewHolder selectionCardViewHolder = new SelectionCardViewHolder(view, context);
        return selectionCardViewHolder;
    }

    @Override
    public void onBindViewHolder(SelectionCardViewHolder selectionCardViewHolder, int i) {
        selectionCardViewHolder.chiText.setText(selectionCards.get(i).chiText);
        selectionCardViewHolder.pinyin.setText(selectionCards.get(i).pinyin);
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public static class SelectionCardViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        TextView chiText;
        TextView pinyin;

        SelectionCardViewHolder(View itemView, final Context context) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.selectionCardCardView);
            chiText = (TextView) itemView.findViewById(R.id.chiText);
            pinyin = (TextView) itemView.findViewById(R.id.pinyin);
        }
    }
}
