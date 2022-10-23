package Inmueble;

public class Main {
    public static void main(String[] args) {
        Apartamentofamiliar apto1 = new
                Apartamentofamiliar(103067,120,"Avenida Santander 45-45",3,2,200000);
        System.out.println("Datos Apartamento");
        apto1.calcularprecioventa(apto1.valorArea);
        apto1.imprimir();
        System.out.println("Datos apartamento");
        Apartaestudio aptestudio1 = new
                Apartaestudio(12354,50,"Avenida Caracas 30-15",1,1);
        aptestudio1.calcularprecioventa(aptestudio1.valorArea);
        aptestudio1.imprimir();

    }

}
