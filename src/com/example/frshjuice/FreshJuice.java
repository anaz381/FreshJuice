package com.example.frshjuice;

/**
 * Created by anaz on 4/5/2017.
 */
public class FreshJuice {

    enum FreshJuiceSize {SMALL, MEDIUM, LARGE}

    FreshJuiceSize size;
}
     class FreshJuiceTest {

        public static void main(String args[]) {
            FreshJuice juice = new FreshJuice();
            juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
            System.out.println("Size: " + juice.size);
        }
    }
