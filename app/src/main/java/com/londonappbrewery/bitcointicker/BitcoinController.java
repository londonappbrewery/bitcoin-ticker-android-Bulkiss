package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

public class BitcoinController {

    private String mBitcoinPrice;

    public static BitcoinController fromJson(JSONObject jsonObject) {

        try {
            BitcoinController btcPrice = new BitcoinController();

            btcPrice.mBitcoinPrice = jsonObject.getString("ask");

            return btcPrice;

        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }

    }

    public String getBitcoinPrice() {
        return mBitcoinPrice;
    }
}
