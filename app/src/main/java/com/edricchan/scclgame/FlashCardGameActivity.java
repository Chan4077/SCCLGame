package com.edricchan.scclgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FlashCardGameActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<FlashCardGame> flashCardGames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash_card_game);
        recyclerView = (RecyclerView) findViewById(R.id.flashCardGameRecyclerView);
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
        flashCardGames = new ArrayList<>();
        flashCardGames.add(new FlashCardGame("我", "I", "wǒ"));
        flashCardGames.add(new FlashCardGame("你", "You", "nǐ"));
        flashCardGames.add(new FlashCardGame("她", "She", "tā"));
        flashCardGames.add(new FlashCardGame("他", "He", "tā"));
        flashCardGames.add(new FlashCardGame("它", "It", "tā"));
        flashCardGames.add(new FlashCardGame("一", "One", "yī"));
    }

    /**
     * Initializes the adapter used for the recycler view
     */
    private void initializeAdapter() {
        FlashCardGameAdapter flashCardGameAdapter = new FlashCardGameAdapter(flashCardGames, this);
        recyclerView.setAdapter(flashCardGameAdapter);
    }
}
