// package homework.HomeWork5;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// public class ex_3 {
//     public static void main(String[] args) {
//         int[][] chessDesk = new int[8][8];
//         Arrays.stream(chessDesk).map(Arrays::toString).forEach(System.out::println);
//         System.out.println(IsComplete(chessDesk));
//         //for (int i = 0; i < 3; i++) {
//             PutQueen(chessDesk);
//             PutQueen(chessDesk);
//             PutQueen(chessDesk);
//         //}
//         System.out.println(IsComplete(chessDesk));
//         Arrays.stream(chessDesk).map(Arrays::toString).forEach(System.out::println);
//         System.out.println(chessDesk[0][2]);
//     }
//     static Boolean IsComplete(int[][]deck)
//     {
//         Integer queens = 0;
//         Integer queen = 1;
//         for (int[] is : deck) {
//             if(LineEquals(is, queen))
//             {
//                 queens++;
//             };
//         }
//         if(queens==8){return true;}
//         return false;
//     }
//     static void PutQueen(int[][]deck)
//     {
//         int row = 0;
//         for (int i = 0; i < deck.length; i++) {
//             if (LineEquals(deck[i],1)) {
//                 row+=1;
                
//             }
//             else
//             {
//                 if(DxDyConditionMet(deck, row, IsConditionMet(deck)))
//                 {
//                     deck[row][IsConditionMet(deck)] = 1;
                    
//                     return;
//                 }
//                 else
//                 {
//                     row+=1;
//                 }
//             }
//         }
//     }
//     static Integer IsConditionMet(int[][]deck)
//     {
//         for (int i = 0; i < 8; i++) {
//             if(IsColumnConditionMet(deck, i))
//             {
//                 return i;
//             }
//         }
//         return -1;
//     }
//     static Boolean IsColumnConditionMet(int[][]deck, Integer index)
//     {
//         Integer nonQueen = 0;
//         for (int[] is : deck) {
//             if (is[index]==1)
//             {
//                 nonQueen++;
//             }
//         }
//         if (nonQueen==0) {
//             return true;
//         }
//         return false;
//     }
//     static List<Integer> AllQueensCoordinates(int[][]deck)
//     {
//         List<Integer> queensCoordinates = new ArrayList<>();
//         for (int i = 0; i < deck.length; i++) {
//             if(LineEquals(deck[i], 1))
//             {
//                 Integer number = Arrays.asList(deck[i]).indexOf(1);
//                 String textNumber = Integer.toString(i)+Integer.toString(number);
//                 number = Integer.parseInt(textNumber);
//                 queensCoordinates.add(number);
//             }
//         }
//         return queensCoordinates;
//     }
//     static Boolean DxDyConditionMet(int[][]deck, Integer row, Integer col)
//     {
        
//         List<Integer> queensCoordinates = AllQueensCoordinates(deck);
//         if(queensCoordinates.isEmpty())
//         {
//             return true;
//         }
//         for (Integer coordinates : queensCoordinates) {
//             if(Math.abs(row - coordinates/10) == Math.abs(col - coordinates%10))
//             {
//                 return false;
//             }
//         }
//         return true;
//     }
//     static Integer AllConditionsMet(int[][]deck, Integer row, Integer col)
//     {
//         if(DxDyConditionMet(deck, row, col))
//         {
//             return IsConditionMet(deck);
//         }
//         return -1;
//     }
//     static boolean LineEquals(int[]line, Integer index)
//     {
//         for (int i : line) {
//             if (i==index) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }
