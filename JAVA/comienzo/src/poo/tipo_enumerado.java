package poo;

import java.util.Scanner;

public class tipo_enumerado {
    
    enum ciclo_formativo {
        DAM("D"), ASIR("A"), DAW("W");
        private ciclo_formativo(String abreviatura){
            this.ciclo_formativo = abreviatura;            
        }
        private String ciclo_formativo;

        public String dame_ciclo(){
            return ciclo_formativo;
        }
    }

    public static void main(String[] args) {
        
        System.out.println("MEte un valor: DAM, DAW, ASIR.");
    
        Scanner entrada = new Scanner(System.in);

        String entrada_datos = entrada.next().toUpperCase();

        ciclo_formativo ciclo_formativo = Enum.valueOf(ciclo_formativo.class, entrada_datos);

        entrada.close();

        System.out.println("Ciclo formativo: " + ciclo_formativo);
        System.out.println("Abreviatura: " + ciclo_formativo.dame_ciclo());
    }
}
