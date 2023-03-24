package homework.HomeWork5;

import java.util.Arrays;

public class ex3_1 {
    static int[] desk = new int[8];
    static Integer currentIndex = 0;
    static Integer QueenNumber = 1;
    static Boolean findAnswer = false;
    public static void main(String[] args) {
        while (!findAnswer) {
            if (CanPutQueen()){
                if (currentIndex == 7) {
                    findAnswer = true;
                }
                else {
                    currentIndex++;
                }
            }
            else {
                desk[currentIndex]++;
            }
        }
        int[][] chessdesk = new int[8][8];
        for (int i = 0; i < chessdesk.length; i++) {
            chessdesk[i][desk[i]] = 1;
        }
        Arrays.stream(chessdesk).map(Arrays::toString).forEach(System.out::println);
    }
    
    
    static Boolean CanPutQueen()
    {
        if (desk[currentIndex]>7){
            desk[currentIndex] = 0;
            currentIndex--;
            return false;
        }
        for (int i : desk) {
            if(i==QueenNumber)
            {
                QueenNumber++;
                return false;
            }
        }
        for (int i = 0;i<currentIndex;i++){
            if ((desk[currentIndex] == desk[i])|((Math.abs(desk[currentIndex] - desk[i])) == (currentIndex-i))){
                return false;
            }
            
        }
        return true;
    }
    
    
}

