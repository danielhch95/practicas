package antes_de_poo;
public class for_arrays {
    
    public static void main(String[] args){

        String [] lugares = {"Barcelona", "Mexico DF", "Ciudad Real", "A Coruña", "Vigo", "Santiago"};
    
        for(String elemento:lugares){
            System.out.println("Estamos en: " + elemento);
        }

        int [] matriz_aleatoria = new int[150];

        for ( int i=0; i<matriz_aleatoria.length; i++){

            matriz_aleatoria[i] = (int)Math.round(Math.random()*100);
        }
        for (int numeros:matriz_aleatoria){

            System.out.print(numeros + " ");
        }
    }
}
