/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan03;

/**
 *
 * @author PHUNG
 */
import java.util.Scanner;

public class Bai1 {

    static Scanner sc = new Scanner(System.in);

    static void output() {
        try {
            System.out.println("Nhap a, b, c: ");
            float a = Integer.parseInt(sc.nextLine());
            float b = Integer.parseInt(sc.nextLine());
            float c = Integer.parseInt(sc.nextLine());
            double s = c / (a - b);
            System.err.println("Ket qua cua phep tinh la: " + s);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.err.println("a-b = 0. Khong the thuc hien phep chia voi 0.x");
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.err.println("Cac ky tu da nhap khong phai so.");
        }

    }

    public static void main(String args[]) {
        output();
    }
}
