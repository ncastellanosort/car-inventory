package org.example;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();

        while (true) {

            menu.selecciones();
            int opc = menu.in.nextInt();

            switch (opc) {
                // Caso 1
                case 1:
                    menu.agregar();
                    break;

                // Caso 2
                case 2:
                    menu.mostrar();
                    break;

                // Caso 3
                case 3:
                    menu.editar();
                    break;

                // Caso 4
                case 4:
                    menu.eliminar();
                    break;

                // Caso 5
                case 5:
                    menu.salir();
                    return;
            }
        }
    }
}
