package com.company;
import java.util.Scanner;

/**
 * C5 = 3, C=A⊕B;
 * C7 = 4, long;
 * C11 = 3: Обчислити суму найбільших елементів кожного стовпця матриці
 */
public class Lab2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int s = in.nextInt();
        long[][] a = new long[s][s];
        long[][] b = new long[s][s];
        long[][] c = new long[s][s];
        int Res = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = (long) Math.round(Math.random() * 10);
                b[i][j] = (long) Math.round(Math.random() * 10);
                c[i][j] = (clonghar) (a[i][j] ^ b[i][j]);
            }
        }
        for (long[] ints : c) {
            for (long anInt : ints) {
                System.out.print((int)anInt + "\t");
            }
            System.out.println();
        }
        long cmax;
        for (int i = 0; i < c[0].length; i++) {
            cmax = 0;
            for(int j = 0; j < c.length; j++) {
                if (c[j][i] > cmax) {
                    cmax = c[j][i];
                }
            }
            Res += cmax;
        }
        System.out.println("The result is " + Res);
     }
    }

