package arrays;

public class arrays {
    public static void main(String[] args) {
        int intArray[] = {1,2,3};
        int intArray_2[] = new int[10];
        
        intArray[1] = 1;
        for (byte i = 0; i<intArray.length; i++){
            System.out.println(intArray[i]);
        }
// PARA ARRAYS MULTIDIMENSIONALES SE PONEN [][] EN 2d Y [][][] EN 3D..

        int[][][] array_3d = new int [3][3][3];
        array_3d[0][0][1] = 1;
        array_3d[0][1][0] = 2;
        array_3d[1][0][0] = 3;
// el primer [] simboliza la matriz, el eje Z. La segunda [] simboliza la fila. La tercera [] y última, simboliza la posición en la fila.
        for (int a=0; a<array_3d.length; a++){
            for(int x=0; x<array_3d.length; x++){
                for(int z=0; z<array_3d.length; z++){
                    System.out.print(" "+array_3d[a][x][z]+" ");
                }
                System.out.println("\n Siguiente línea: ");
            }
            System.out.println("\nSiguiente matriz: ");
        }
    }
}