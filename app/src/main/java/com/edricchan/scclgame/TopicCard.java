package com.edricchan.scclgame;

import android.graphics.Bitmap;

/**
 * A data adapter used for the RecyclerView in `SelectionCardActivity`
 */
class TopicCard {
    Number topicId;
    String topicEng;
    String topicChi;
    Integer bitmap;
    Boolean isLocked;

    /**
     * Creates a topic card with the specified parameters
     * @param topicId The ID of the topic card
     * @param topicEng The English version of the topic name
     * @param topicChi The Chinese version of the topic name
     * @param bitmap The bitmap of the topic
     */
    TopicCard(Number topicId, String topicEng, String topicChi, Integer bitmap, Boolean isLocked) {
        this.topicId = topicId;
        this.topicEng = topicEng;
        this.topicChi = topicChi;
        this.bitmap = bitmap;
        this.isLocked = isLocked;
    }

}