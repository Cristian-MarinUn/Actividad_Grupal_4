package Inmueble;

public class Apartaestudio extends Apartamento {
    protected  static double valorArea=1500000;
    public Apartaestudio(int identificadorInmobiliario, int Area, String direccion, int numerohabitaciones, int numerobaños) {
        super(identificadorInmobiliario, Area, direccion, 1, 1);

    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println();
    }
}
