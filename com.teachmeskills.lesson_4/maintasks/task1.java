package com.teachmeskills.lesson_4;

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        String [][] chessBoard = new String[8][8];
        for(int i = 0;i < 8; i++){
            for(int j = 0; j < 8 ;j ++){
                chessBoard[i][j] = (i + j) % 2 == 0 ? "White" : "Black";
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(chessBoard[i][j]+" ");
            }
            System.out.println();
        }
    }
}
