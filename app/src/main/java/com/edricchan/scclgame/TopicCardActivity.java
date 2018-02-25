package com.edricchan.scclgame;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class TopicCardActivity extends AppCompatActivity {

    CardView cardView;
    RecyclerView recyclerView;
    List<TopicCard> topicCards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_card);
        cardView = (CardView) findViewById(R.id.topicCardCardView);
        recyclerView = (RecyclerView) findViewById(R.id.topicCardRecyclerView);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(gridLayoutManager);
        addFakeData();
        initializeAdapter();
    }

    /**
     * Creates an array list with some fake data
     * TODO: Replace this with a database (Firebase Realtime Database/Firestore?)
     */
    private void addFakeData() {
        topicCards = new ArrayList<>();
        topicCards.add(new TopicCard(1, "My Family", "我的家人", R.mipmap.topic_my_family, false));
        topicCards.add(new TopicCard(2, "Stationery", "文具", R.mipmap.topic_stationery, false));
        topicCards.add(new TopicCard(3, "Numbers", "数目", R.mipmap.topic_numbers, false));
    }

    /**
     * Initializes the adapter used for the recycler view
     */
    private void initializeAdapter() {
        TopicCardAdapter topicCardAdapter = new TopicCardAdapter(topicCards, this);
        recyclerView.setAdapter(topicCardAdapter);
    }
}
