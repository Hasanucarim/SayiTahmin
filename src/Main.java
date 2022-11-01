import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sayi = (int) (Math.random()*10);
        System.out.println("random "+sayi);

        while (true) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir ile on arasında bir sayi giriniz: ");
        int tahmin = input.nextInt();
        System.out.println(tahmin);


        if (sayi == tahmin) {
                System.out.println("Tebrikler sayıyı dogru tahmin ettiniz");
                break;
        } else if (sayi > tahmin) {
                System.out.println("Random sayi " + tahmin + " 'den büyüktür");
        } else  {
                System.out.println("Random sayi " + tahmin + " 'den küçüktür");
        }
        }

    }

}
