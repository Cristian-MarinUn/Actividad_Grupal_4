package Inmueble;

public class LocalComercial extends Local{
    protected static double valorArea = 3000000;
    protected String centroComercial;
    LocalComercial(int identificadorInmobiliario, int Area, String direccion, tipo tipoLocal, String centroComercial) {
        super(identificadorInmobiliario, Area, direccion, tipoLocal);
        this.centroComercial=centroComercial;
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Centro comercial = " + centroComercial);
        System.out.println();
    }
}
