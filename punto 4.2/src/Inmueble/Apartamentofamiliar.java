package Inmueble;

public class Apartamentofamiliar extends Apartamento{
    protected static double valorArea = 2000000;
    protected int valorAdministracion;
    public Apartamentofamiliar(int identificadorInmobiliario, int Area, String direccion, int numerohabitaciones, int numerobaños, int valorAdministracion) {
        super(identificadorInmobiliario, Area, direccion, numerohabitaciones, numerobaños);
        this.valorAdministracion=valorAdministracion;
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Valor de la administracion=$"+valorAdministracion);
        System.out.println();
    }
}
