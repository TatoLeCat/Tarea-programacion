/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.tarea2;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class Tarea2 {

    public static void main(String[] args) {
        String operacion;
        String sub1;
        String sub2;
        int c;
        Scanner console = new Scanner(System.in);
        System.out.println("introduzca la operacion que desea realizar: ");
        operacion = console.next();
        sub1 = console.next();
        sub2= console.next();
        var a=Integer.parseInt(operacion);
       int b=Integer.parseInt(sub2);
       
       c = switch (sub1) {
            case "+" -> a+b;
            case "-" -> a-b;
            case "*" -> a*b;
            case "%" -> a%b;
            default -> a/b;
        };
       
           System.out.println("el resultado es: "  + c);
        }
    }

