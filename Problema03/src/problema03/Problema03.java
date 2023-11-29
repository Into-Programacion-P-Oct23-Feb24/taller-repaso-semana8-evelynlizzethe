/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int num;
        int multiplicando;
        int multiplicador;
        int resultado = 0;

        System.out.println("Ingrese un valor");
        multiplicando = entrada.nextInt();
        System.out.println("Ingrese un valor");
        multiplicador = entrada.nextInt();

        do {
            if (multiplicador % 2 == 1) {
                resultado = resultado + multiplicando;
            }
            multiplicador = multiplicador / 2;
            resultado = resultado + multiplicando;
            
        } while (multiplicador >= 1);

        System.out.println(resultado);

    }



}