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
public class latihan2_1 {
    public static void main(String[] args) {
        //Buatlah program untuk menghitung volume balok menggunakan inputan.
        Scanner input = new Scanner(System.in);
        int panjang, lebar, tinggi;
        System.out.print("Masukan panjang :"); panjang = input.nextInt();
        System.out.print("Masukan lebar :"); lebar = input.nextInt();
        System.out.print("Masukan tinggi :"); tinggi = input.nextInt();
        int volumeBalok = panjang*lebar*tinggi;
        System.out.print("Volume balok adalah:" + volumeBalok);
    }
}
