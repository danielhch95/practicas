// package antes_de_poo;
// import java.util.Scanner;

// public class while_dow {

//     public static void main(String[] args){
//         System.out.println("Hemos generado un número al azar de 1 a 10. Intenta adivinarlo :)");
// // El *100 es porque el método random genera un número aleatorio double entre 0.0 y 1.0
//         int numero_aleatorio = (int)(Math.random()*10);        
//         Scanner entrada = new Scanner(System.in);
//         int numero_adivinado = 0;
//         int intentos = 0;

//         while (numero_aleatorio != numero_adivinado){
//             intentos ++;
//             System.out.print("Mete un número: ");
//             numero_adivinado = entrada.nextInt();
            
//            if (numero_adivinado < numero_aleatorio){
//                 System.out.print("Pon un número más alto: ");
//            }
//            else if (numero_adivinado > numero_aleatorio){
//                 System.out.print("Pon un número más bajo: ");
//            }
//            else {
//                 System.out.print("Enhorabuena has acertado en " + intentos + " intentos :)");
//            }

//         }
//     }
// }
