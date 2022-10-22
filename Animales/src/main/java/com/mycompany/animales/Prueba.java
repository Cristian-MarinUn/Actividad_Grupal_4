package com.mycompany.animales;
public class Prueba {
public static void main(String[] args) {
    Animal[] animals = new Animal[4];
    animals[0] = new Gato();
    animals[1] = new Perro();
    animals[2] = new Lobo();
    animals[3] = new Leon();
    for (int i = 0; i < animals.length; i++) {
        System.out.println(animals[i].getNomCientifico());
        System.out.println("Sonido: " + animals[i].getSonido());
        System.out.println("Alimentos: " + animals[i].getAlimentos());
        System.out.println("Hábitat: " + animals[i].getHabitat());
        System.out.println();
        }
    }
}    

