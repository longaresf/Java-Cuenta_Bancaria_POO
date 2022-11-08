/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cuenta_bancaria_poo;
import java.util.Scanner;
/**
 *
 * @author fco
 */
public class Cuenta_Bancaria_POO {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Cuenta cuenta1 = new Cuenta("Francisco Longares",0);
        Cuenta cuenta2 = new Cuenta("Maria José",100);
        
        cuenta1.ingresar(400);
        cuenta2.ingresar(800);
        
        cuenta1.retirar(200);
        cuenta2.retirar(700);
        
        System.out.println(cuenta1);
        System.out.println(cuenta2);

    }
}
