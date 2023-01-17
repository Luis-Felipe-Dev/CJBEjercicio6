package org.example;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String textoInvertido = reverse("Hola mundo");
        System.out.println(textoInvertido);

        System.out.println("#############################");

        String[] intArray = {"Luis", "Felipe", "Huaranca", "Berrospi"};

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        System.out.println("#############################");

        int intArrayBidi[][] = new int[3][3];
        intArrayBidi[0][0] = 1;
        intArrayBidi[0][1] = 2;
        intArrayBidi[0][2] = 3;
        intArrayBidi[1][0] = 4;
        intArrayBidi[1][1] = 5;
        intArrayBidi[1][2] = 6;
        intArrayBidi[2][0] = 7;
        intArrayBidi[2][1] = 8;
        intArrayBidi[2][2] = 9;

        for (int i = 0; i < intArrayBidi.length; i++) {
            for (int j = 0; j < intArrayBidi.length; j++) {
                System.out.println("Posición: [" + i + "][" + j + "], Valor: " + intArrayBidi[i][j]);
            }
        }

        System.out.println("#############################");

        Vector<Integer> vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        System.out.println(vector);

        vector.remove(1);
        vector.remove(2);
        System.out.println(vector);

        System.out.println("#############################");

        System.out.println("El uso de vectores consume mayor recursos al crecer el vector.");

        System.out.println("#############################");

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Luis");
        lista.add("Felipe");
        lista.add("Huaranca");
        lista.add("Berrospi");

        for (String item : lista) {
            System.out.println(item);
        }

        LinkedList<String> listaEnlazada = new LinkedList<String>(lista);

        for (String item : listaEnlazada) {
            System.out.println(item);
        }
        System.out.println("#############################");

        ArrayList<Integer> listaEnteros = new ArrayList<Integer>();

        for (int i = 1; listaEnteros.size() < 10; i++) {
            listaEnteros.add(i);
        }

        System.out.println(listaEnteros);

        for (int i = 0; i < listaEnteros.size(); i++) {
            if (listaEnteros.get(i) % 2 == 0) {
                listaEnteros.remove(i);
            }
        }

        System.out.println(listaEnteros);

        System.out.println("#############################");

        try {
            DividePorCero(5, 0);
            System.out.println("Demo de código");
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        }

        System.out.println("#############################");

        entradaSalida("src\\org\\example\\ficheroPrueba.txt", "src\\org\\example\\copiaFicheroPrueba.txt");

        programaFinal("src\\org\\example\\ficheroPrueba.txt", "src\\org\\example\\programaFinal.txt");
    }

    static double DividePorCero(int n1, int n2) {
        double result = n1 / n2;
        return result;
    }

    public static String reverse(String texto) {
        String textoInvertido = "";
        char letra;
        System.out.println(texto);

        for (int i = 0; i < texto.length(); i++) {
            letra = texto.charAt(i);
            textoInvertido = letra + textoInvertido;
        }
        return textoInvertido;
    }

    public static PrintStream entradaSalida(String fileIn, String fileOut) throws IOException {
        InputStream entrada = new FileInputStream(fileIn);
        byte []datos = entrada.readAllBytes();

        PrintStream salida = new PrintStream(fileOut);
        salida.write(datos);
        return salida;
    }
    public static PrintStream programaFinal(String fileIn, String fileOut) throws IOException {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        InputStream entrada = new FileInputStream(fileIn);
        byte[] datos = entrada.readAllBytes();
        for (int num: datos) {
            numeros.add(num);
        }
        entrada.close();

        HashMap<String, Integer> mapa = new HashMap<>();

        PrintStream salida = new PrintStream(fileOut);
        for (Integer num: numeros) {
            mapa.put("Clave" + num, num * 10);
            salida.write(num);
        }

        salida.close();


        for(Map.Entry elemento : mapa.entrySet()){
            System.out.println("Elemento clave es: " + elemento.getKey());
            System.out.println("Elemento valor es: " + elemento.getValue());
        }
        return salida;
    }
}


//Sorpréndenos creando un programa de tu elección que utilice
// InputStream, PrintStream, excepciones, un HashMap y un ArrayList,
// LinkedList o array.