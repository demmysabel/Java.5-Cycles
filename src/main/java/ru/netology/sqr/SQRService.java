package ru.netology.sqr;

public class SQRService {
    public int ShouldCountSquareInRange(int limitMin, int limitMax) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int x = i * i;
            if (x > limitMin) {
                if (x < limitMax) {
                    count++;
                }
            }


        }


        return count;
    }
}
