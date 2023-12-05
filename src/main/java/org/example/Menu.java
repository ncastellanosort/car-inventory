package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu implements IGestorCarros {

    ArrayList<Carro> carritos = new ArrayList<>();
    Scanner in = new Scanner(System.in);

    public Menu() {

    }

    @Override
    public void mostrarMarcas() {
        int num = 0;
        for (Carro carro : carritos) {
            System.out.println((num + 1) + ". " + carro.getMarca() + "\n");
            ++num;
        }
    }

    @Override
    public void selecciones() {
        System.out.println("------------------------------------");
        System.out.println("GESTOR DE INVENTARIO DE CARROS");
        System.out.println("------------------------------------\n");
        System.out.println("1. Ingresar Carros");
        System.out.println("2. Ver inventario de Carros");
        System.out.println("3. Editar Inventario");
        System.out.println("4. Eliminar");
        System.out.println("5. Salir");
        System.out.println("\nSelecciona: ");
    }

    @Override
    public void agregar() {

        System.out.println("Cantidad de carros que desea ingresar: ");
        int cant = in.nextInt();
        in.nextLine();

        for (int i = 0; i < cant; ++i) {
            System.out.printf("\nIngrese el carro %d: \n", (i + 1));

            System.out.println("\nMarca: ");
            String marc = in.nextLine();

            System.out.println("\nModelo: ");
            int model = in.nextInt();
            in.nextLine();

            System.out.println("\nColor: ");
            String colo = in.nextLine();

            carritos.add(new Carro(model, marc, colo));
        }

    }

    @Override
    public void editar() {

        mostrarMarcas();

        System.out.println("\nSeleccione el indice del carro a editar: ");

        int ind = in.nextInt();
        in.nextLine();

        System.out.println("Marca: " + carritos.get(ind - 1).getMarca());
        System.out.println("Modelo: " + carritos.get(ind - 1).getModelo());
        System.out.println("Color: " + carritos.get(ind - 1).getColor());

        System.out.println("\nQue deseas editar?");
        System.out.println("1. Nombre");
        System.out.println("2. Modelo");
        System.out.println("3. Color\n");
        System.out.println("Selecciona: ");

        int opcEdicion = in.nextInt();
        in.nextLine();

        switch (opcEdicion) {
            case 1 -> {
                System.out.println("Ingresa el nuevo nombre: ");
                String nuevoNombre = in.nextLine();
                carritos.get(ind - 1).setMarca(nuevoNombre);

            }
            case 2 -> {
                System.out.println("Ingresa el nuevo modelo: ");
                int nuevoMod = in.nextInt();
                carritos.get(ind - 1).setModelo(nuevoMod);
                in.nextLine();

            }
            case 3 -> {
                System.out.println("Ingresa el nuevo Color: ");
                String nuevoColor = in.nextLine();
                carritos.get(ind - 1).setColor(nuevoColor);

            }
        }

        System.out.println("Editado Exitosamente!\n");

    }

    @Override
    public void eliminar() {
        mostrarMarcas();

        System.out.println("\nSeleccione el indice del carro a eliminar del inventario: ");

        int ind = in.nextInt();
        in.nextLine();

        carritos.remove(ind - 1);

        System.out.println("Eliminado Exitosamente!\n");

    }

    @Override
    public void mostrar() {
        int i = 0;
        System.out.println("Inventario: \n");
        for (Carro carro : carritos) {
            System.out.printf("Carro numero: %d\n", (i + 1));
            System.out.printf("\tMarca: %s\n", carro.getMarca());
            System.out.printf("\tModelo: %s\n", carro.getModelo());
            System.out.printf("\tColor: %s\n", carro.getColor());
            ++i;
        }

    }

    @Override
    public void salir() {
        System.out.println("Hasta luego!");
    }

}
