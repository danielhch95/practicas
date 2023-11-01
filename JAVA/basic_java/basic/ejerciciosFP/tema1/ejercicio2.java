package ejerciciosFP.tema1;

class ejercicio2 {
    public static void main (String[] args){
        final int VELOCIDAD_LUZ=300000;
        final int SEGUNDOS_UN_AÑO=365*24*60*60;
        int añoLuz=SEGUNDOS_UN_AÑO*VELOCIDAD_LUZ;
        System.out.println("UN AÑO LUZ TIENE " +añoLuz+"km.");

        final long VELOCIDAD_LUZ_LONG = 300000L;
        final long SEGUNDOS_UN_AÑO_LONG = 365*24*60*60L;
        final long anoLuzLong = SEGUNDOS_UN_AÑO_LONG*VELOCIDAD_LUZ_LONG;
        System.out.println(anoLuzLong);
    }
}