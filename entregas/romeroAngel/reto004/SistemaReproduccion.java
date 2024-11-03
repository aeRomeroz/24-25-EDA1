package romeroAngel.reto004;

import java.util.Scanner;

import romeroAngel.reto_001.Cola;

public class SistemaReproduccion {
    
    private List canciones;
    private Playlist cancionesFavoritas;
    private List playlists;
    private List colaReproduccion;
    private Cancion cancionActual;
    private List historial;
    private boolean aleatorio;
    private boolean repeticion;

    public SistemaReproduccion(){
        this.canciones = new List();
        this.playlists = new List();
        this.colaReproduccion = new List();
        this.cancionActual = null;
        this.aleatorio = false;
        this.repeticion = false;
    }

    public void mostrarMenuPrincipal(){
        Scanner scanner =  new Scanner(System.in);
        int opcion;

        do{
            System.out.println("=== MENÚ PRINCIPAL ===");
            System.out.println("1. Reproducción");
            System.out.println("2. Biblioteca");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción.");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarMenuReproduccion();
                    break;
            
                case 2:
                    mostrarMenuBiblioteca();
                    break;
                
                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;
                
                default:
                    System.out.println("Elija una opción válida");
            }
        } while (opcion != 3);
    }

    private void mostrarMenuReproduccion() {
        Scanner scanner = new Scanner(System.in);
        int opcion; 

        do{
            System.out.println("=== MENÚ REPRODUCCIÓN ===");
            System.out.println("1. Ver canción actual");
            System.out.println("2. Reproducir siguiente");
            System.out.println("3. Reproducir anterior");
            System.out.println("4. Ver cola de reproducción");
            System.out.println("5. Ver historial");
            System.out.println("6. Activar/desactivar aleatorio");
            System.out.println("7. Activar/desactivar repetición");
            System.out.println("8. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    verCancionActual();
                    break;
                case 2:
                    reproducirSiguiente();
                    break;
                case 3:
                    reproducirAnterior();
                    break;
                case 4:
                    verColaReproduccion();
                    break;
                case 5:
                    verHistorial();
                    break;
                case 6:
                    aleatorio = !aleatorio;
                    System.out.println("Modo aleatorio " + (aleatorio ? "activado." : "desactivado."));
                    break;
                case 7:
                    repeticion = !repeticion;
                    System.out.println("Modo repetición " + (repeticion ? "activado." : "desactivado."));
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
            
        } while(opcion != 8);
    }
}