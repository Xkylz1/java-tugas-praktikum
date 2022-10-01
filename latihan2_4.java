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
public class latihan2_4 {
    public static void main(String[] args) {
        /*Buatlah program untuk menghitung luas lingkaran dengan konstanta pi = 3.141592 dan
inputkan jari-jari lingkaran = 23.12 dengan hasilnya berupa bilangan bulat.*/
        final double pi=3.141592;
        double r;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jari-jari lingkaran: "); r= input.nextDouble();
        double luasLingkaran=pi*r*r;
        int luasLingkaran2=(int)luasLingkaran;
        System.out.println("Luas lingkaran adalah: "+luasLingkaran2 );
    }
    
}
