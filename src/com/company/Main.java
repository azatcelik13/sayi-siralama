package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a,b,c ;

        System.out.print("a. sayıyı giriniz:" );
        a=inp.nextInt();

        System.out.print("b. sayıyı giriniz=" );
        b=inp.nextInt();

        System.out.print("c. sayıyı giriniz=" );
        c=inp.nextInt();

        if (a>b&&b>c&&a>c){
            System.out.println("Sayılar sıralandı=a >b >c");
        }else if (b>a&&a>c&&b>c){
            System.out.println("b>a>c");
        }else if (c>a&&c>b&&b>a){
            System.out.println("c>b>a");
        }else {
            System.out.println("Sayılar eşit olabilir");
        }


    }
}
