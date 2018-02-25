package com.edricchan.scclgame;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.TooltipCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * An adapter used for the RecyclerView
 */

public class TopicCardAdapter extends RecyclerView.Adapter<TopicCardAdapter.TopicCardViewHolder> {
    List<TopicCard> topicCards;
    Context context;

    TopicCardAdapter(List<TopicCard> topicCards, Context context) {
        this.topicCards = topicCards;
        this.context = context;
    }

    @Override
    public int getItemCount() {
        return topicCards.size();
    }

    @Override
    public TopicCardViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.topic_card_container, viewGroup, false);
        TopicCardViewHolder topicCardViewHolder = new TopicCardViewHolder(view, context);
        return topicCardViewHolder;
    }

    @Override
    public void onBindViewHolder(TopicCardViewHolder topicCardViewHolder, int i) {
        topicCardViewHolder.topicEng.setText(topicCards.get(i).topicEng);
        topicCardViewHolder.topicChi.setText(topicCards.get(i).topicChi);
        topicCardViewHolder.topicId.setText(topicCards.get(i).topicId.toString());
        topicCardViewHolder.topicImage.setImageResource(topicCards.get(i).bitmap);
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public static class TopicCardViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        TextView topicId;
        TextView topicEng;
        TextView topicChi;
        ImageView topicImage;

        TopicCardViewHolder(View itemView, final Context context) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.topicCardCardView);
            topicId = (TextView) itemView.findViewById(R.id.topicId);
            topicEng = (TextView) itemView.findViewById(R.id.topicEng);
            topicChi = (TextView) itemView.findViewById(R.id.topicChi);
            topicImage = (ImageView) itemView.findViewById(R.id.topicImage);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, FlashCardGameActivity.class);
                    context.startActivity(intent);
                }
            });
        }
    }
}
