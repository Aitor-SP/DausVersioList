package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	int d1, d2, numTirades;


        List<Integer> resultatTirades = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Cuantas veces vas a tirar: ");
        numTirades = input.nextInt();

        // Lanzamientos de los dados
        for (int i = 0; i < numTirades; i++) {
            d1 = random.nextInt(6)+1;
            d2 = random.nextInt(6)+1;
            resultatTirades.add((d1)+(d2));
        }
        // Añadir la tirada al list
        System.out.println("Has tirado "+numTirades+" veces.");
        System.out.println("Estos han sido los resultados: "+resultatTirades);

        // Calcular la frecuencia de resultados repetidos INDIVIDUALMENTE
        //int freq = Collections.frequency(resultatTirades, 2);
        //int freq = Collections.frequency(resultatTirades, 3);
        //System.out.println(freq);
        // Otra forma
        //Set<Integer> resultadoUnico = new HashSet<Integer>(resultatTirades);
        //for(Integer i : resultadoUnico) {
        //System.out.println(i+ ": " + Collections.frequency(resultatTirades,i));
        for (i = 2; i < 12; i++) {
            System.out.println(i + " -> %d%n", Collections.frequency(resultatTirades,i));
        }
        System.out.println("Total de tiradas: " + resultatTirades.size());
    }
}
