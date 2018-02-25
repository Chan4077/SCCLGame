package com.edricchan.scclgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SelectionCardActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<SelectionCard> selectionCards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_card);
        recyclerView = (RecyclerView) findViewById(R.id.selectionCardRecyclerView);
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
        selectionCards = new ArrayList<>();
        selectionCards.add(new SelectionCard("我", "I", "wǒ"));
        selectionCards.add(new SelectionCard("你", "You", "nǐ"));
        selectionCards.add(new SelectionCard("她", "She", "tā"));
        selectionCards.add(new SelectionCard("他", "He", "tā"));
        selectionCards.add(new SelectionCard("它", "It", "tā"));
        selectionCards.add(new SelectionCard("一", "One", "yī"));
    }

    /**
     * Initializes the adapter used for the recycler view
     */
    private void initializeAdapter() {
        SelectionCardAdapter flashCardAdapter = new SelectionCardAdapter(selectionCards, this);
        recyclerView.setAdapter(flashCardAdapter);
    }
}
