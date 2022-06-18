package Tugas1;

import java.util.Scanner;

public class Selde {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String inputString = String.valueOf(input);
        boolean isSelde = true;
        for(int i = 0; i < inputString.length() / 2; i++){
            if (inputString.charAt(i) != inputString.charAt(inputString.length() - 1 - i)){
                isSelde = false;
                break;
            }
        }
        System.out.println(isSelde ? inputString + " adalah selde." : inputString + " bukan selde.");
    }
}
