package Inmueble;

public class Casarural extends Casa{
    protected static double valorArea= 1500000;
    protected int distanciaCabera;
    protected int altitud;

    public Casarural(int identificarInmobiliario, int Area, String direccion, int numerohabitaciones, int numerobaños, int numeroPisos,int distanciaCabera,int altitud) {
        super(identificarInmobiliario, Area, direccion, numerohabitaciones, numerobaños, numeroPisos);
        this.distanciaCabera=distanciaCabera;
        this.altitud=altitud;
    }


    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Distancia la cabecera municipal="+numerohabitaciones+"Km.");
        System.out.println("Altitud sobre el nivel del mar="+altitud+"metros.");
        System.out.println();
    }
}
