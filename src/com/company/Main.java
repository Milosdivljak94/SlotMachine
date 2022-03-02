package com.company;

import java.util.Random;

public class Main
{
    public static void main(String[] args) {
        String items [] = {"apple", "ball", "joker", "coin", "heart"};

        String result [] = new String[5];
        Random random = new Random();
        int q = random.nextInt(items.length);
        System.out.println(items[q]);
        result[0]= items[q];

        int w = random.nextInt(items.length);
        System.out.println(items[w]);
        result[1]= items[w];

        int e = random.nextInt(items.length);
        System.out.println(items[e]);
        result[2]= items[e];

        int r = random.nextInt(items.length);
        System.out.println(items[r]);
        result[3]= items[r];

        int t = random.nextInt(items.length);
        System.out.println(items[t]);
        result[4]= items[t];

        int apple = 0;
        int ball = 0;
        int joker = 0;
        int coin = 0;
        int heart = 0;


        for(int i=0;i<result.length;i++)
        {
            if(result[i]=="apple")
                apple++;
            if(result[i]=="ball")
                ball++;
            if(result[i]=="joker")
                joker++;
            if(result[i]=="coin")
                coin++;
            if(result[i]=="heart")
                heart++;
        }

        if (q==w&&w==e&&e==r&&r==t){
            System.out.println("JACKPOT!!!!!!!!");
        }
        if(joker>0)
        {
            if(apple>0&&ball==0&&coin==0&&heart==0)
            {
                System.out.println("JACKPOT!!!!!!!");
            }
            if(apple==0&&ball>0&&coin==0&&heart==0)
            {
                System.out.println("JACKPOT!!!!!!!!");
            }
            if(apple==0&&ball==0&&coin>0&&heart==0)
            {
                System.out.println("JACKPOT!!!!!!!");
            }
            if(apple==0&&ball==0&&coin==0&&heart>0)
            {
                System.out.println("JACKPOT!!!!!!!");
            }



        }
    }
}

