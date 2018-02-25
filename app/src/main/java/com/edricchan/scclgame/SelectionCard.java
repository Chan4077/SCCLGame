package com.edricchan.scclgame;

/**
 * A data adapter used for the RecyclerView in `SelectionCardActivity`
 */
class SelectionCard {
    String chiText;
    String engDef;
    String pinyin;

    /**
     * Creates a flash card with the specified parameters
     * @param chiText The chinese text
     * @param engDef The English definition
     * @param pinyin The hanyu pinyin of the chinese text
     */
    SelectionCard(String chiText, String engDef, String pinyin) {
        this.chiText = chiText;
        this.engDef = engDef;
        this.pinyin = pinyin;
    }

}