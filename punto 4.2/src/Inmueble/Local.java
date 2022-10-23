package Inmueble;

public class Local extends Inmueble{
    enum tipo{INTERNO,CALLE};
    protected tipo tipoLocal;
    Local(int identificadorInmobiliario, int Area, String direccion,tipo tipoLocal) {
        super(identificadorInmobiliario, Area, direccion);
        this.tipoLocal=tipoLocal;
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Tipo de local ="+tipoLocal);
    }
}
