package com.corejava.oop.asbtraction.partial;

public class StockPrice extends Sentiment {
    int price = 100;
    public static void main(String[] args) {
        StockPrice st = new StockPrice();
        st.isPositive = true;
        st.price++;
    }
}
