package Inmueble;

public class Casaindependiente extends Casaurbana {
    protected static double valorArea=3000000;

    public Casaindependiente(int identificarInmobiliario, int Area, String direccion, int numerohabitaciones, int numerobaños, int numeroPisos) {
        super(identificarInmobiliario, Area, direccion, numerohabitaciones, numerobaños, numeroPisos);
    }


    @Override
    void imprimir() {
        super.imprimir();
        System.out.println();
    }
}
