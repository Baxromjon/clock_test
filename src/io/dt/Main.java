package io.dt;

import java.util.Scanner;

/**
 * created by Baxromjon
 * 28.08.2021
 **/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soat, min;
        System.out.print("soatni kiriting ");
        soat = scanner.nextInt();
        System.out.print("minutni kiriting ");
        min = scanner.nextInt();
        double a, b, c;
        b = min * 6;

        if (soat < 12 && min <= 59) {
            a = (soat * 30) + (min / 2);
            c = a > b ? a - b : b - a;
            System.out.print("gradus: " + c);
        } else if (soat == 12) {
            a = min / 2;
            c = a > b ? a - b : b - a;
            System.out.print("gradus: " + c);
        } else if (soat > 12 && soat < 24 && min <= 59) {
            a = ((soat - 12) * 30) + (min / 2);
            c = a > b ? a - b : b - a;
            System.out.print("gradus: " + c);
        } else {
            System.out.println("Noto`g`ri son kiritildi!");
        }
    }
}
