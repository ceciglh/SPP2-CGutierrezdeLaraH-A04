/*//Cecilia Gutierrez de Lara Hernandez-A0141404-IIS
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.cgutierrezdelarah.a04;
import java.util.Scanner;
/**
 *
 * @author cecigutierrez
 */
public class SPP2CGutierrezdeLaraHA04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Definir Variables
        //Variables.
         int opEntrada;
         Scanner kb = new Scanner (System.in);
         double angulo, resultado,rad;
         
         //Desplegar menu
         System.out.println("Calculadora de seno, coseno y tangente de un angulo");
          System.out.println("Introduzca la opción deseada");
          System.out.println("1. Calcular Tangente.");
          System.out.println("2. Calcular Seno. ");
          System.out.println("3. Calcular Coseno. ");
          System.out.println("4. Salir");
          opEntrada=kb.nextInt();
          
          switch (opEntrada){
              case 1:
                  System.out.println("Bienvenido al cálculo de tangente");
                 System.out.println("Introduce el ángulo entre 0 y 360º");
                 angulo=kb.nextDouble();
                 rad = Math.toRadians(angulo);
                 resultado = Math.tan(rad);
                 System.out.println("La tangente del ángulo es "+ resultado);
                  break;
              case 2:
                  System.out.println("Bienvenido al cálculo de seno");
                 System.out.println("Introduce el ángulo entre 0 y 360º");
                 angulo=kb.nextDouble();
                 rad=Math.toRadians(angulo);
                 resultado = Math.sin(rad);
                 System.out.println("El seno del ángulo es "+ resultado);
                  break;
              case 3:
                  System.out.println("Bienvenido al cálculo de coseno");
                 System.out.println("Introduce el ángulo entre 0 y 360º");
                 angulo=kb.nextDouble();
                 rad=Math.toRadians(angulo);
                 resultado = Math.cos(rad);
                 System.out.println("El coseno del ángulo es "+ resultado);
                  break;
              case 4:
                  System.out.println("Adios");
                       
    }
    
}}
