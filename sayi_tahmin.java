package Oyunlar;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import java.util.Random;

public class sayi_tahmin {
    public static void main(String[] args) {

        Random rand = new Random();
        int number = rand.nextInt(100);
        //int num = (int)(Math.random()*100);
        Scanner inp = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        System.out.println(number);

        while (right < 5){
            System.out.println("Lütfen Tahminizi Giriniz: ");
            selected = inp.nextInt();

            if (selected<0 || selected>99){
                System.out.println("Lütfen 0 - 100 arasında değer giriniz !");
                continue;
            }

            if (selected == number){
                System.out.println("Tebrikler doğru tahmin!!!");
                isWin=true;
                break;
            }else {
                System.out.println("Hatalı bir sayı girdiniz !");
                if (selected>number){
                    System.out.println(selected+ " sayısı, gizli sayıdan büyüktür.");
                }else {
                    System.out.println(selected+ " sayısı, gizli sayıdan küçüktür.");
                }
                wrong[right]= selected;
                right++;
                System.out.println("Kalan hakkın: "+ (5-right));
            }
        }
        if (!isWin){
            System.out.println("Kaybettiniz !");
            System.out.println("Tahminleriniz: "+ Arrays.toString(wrong));
        }
    }
}
