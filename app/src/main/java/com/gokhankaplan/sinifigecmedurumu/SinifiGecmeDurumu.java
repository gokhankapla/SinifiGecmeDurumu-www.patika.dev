package com.gokhankaplan.sinifigecmedurumu;

import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        int mat, fizik, kimya, muzik, turkce;

        Scanner input = new Scanner(System.in);
        System.out.println("matematik notunuzu giriniz: ");
        mat = input.nextInt();
        System.out.println("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        System.out.println("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        System.out.println("Muzik notunuzu giriniz: ");
        muzik = input.nextInt();
        System.out.println("Turkce notunuzu giriniz: ");
        turkce = input.nextInt();

        if (fizik>100 || kimya>100 || mat>100 || muzik>100 || turkce>100 || fizik<0 || kimya<0 || mat<0 || muzik<0 || turkce<0) {
            System.out.println("0 ve 100 arasında bir sayı giriniz!");
        }
        else {
            double average = (mat + turkce + kimya + fizik + muzik) / 5;
            System.out.println("Not ortalamanız:" + average);
        }

        
}
}