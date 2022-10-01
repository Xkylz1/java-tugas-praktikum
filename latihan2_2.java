/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum2;
import java.util.Scanner;
/**
 *
 * @author xkylz
 */
public class latihan2_2 {
    public static void main(String[] args) {
        /*Buatlah program yang menampilkan perbandingan nilai “lebih besar dari” atau > dari dua
variabel bertipe data double yang menggunakan operator ternary dengan inputan.*/
        Scanner input = new Scanner(System.in);
        double a, b;
    System.out.print("Masukan angka pertama :"); a = input.nextDouble();
    System.out.print("Masukan angka kedua :"); b = input.nextDouble();
    String kondisi= a > b ? "lebih besar dari" : "lebih kecil dari";
        System.out.println(a+ " " + kondisi +" " + b);
    
    }
}
