import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner jugador = new Scanner(System.in);
        System.out.println("Juego de Piedra, papel o Tijera");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");
        System.out.printf("Elije con cual participar: ");
        int eleccion = jugador.nextInt();
        if(eleccion == 1){
            System.out.println("Elegiste Piedra");
        } else if (eleccion == 2) {
            System.out.println("Elegiste Papel");
        } else if (eleccion == 3) {
            System.out.println("Elegiste Tijera");
        }
        int numeroaleatorio = 0;
        Random computador = new Random();
        numeroaleatorio = (int) (computador.nextDouble()*3+1);
        if (numeroaleatorio == 1 ){
            System.out.println("El computador eligio Piedra");
        } else if (numeroaleatorio == 2) {
            System.out.println("El computador eligio Papel");
        } else if (numeroaleatorio == 3) {
            System.out.println("El computador eligio Tijera");
        }
        if (eleccion == numeroaleatorio){
            System.out.println("Empate");
        } else if (eleccion == 1 && numeroaleatorio == 3) {
            System.out.println("Ganaste");
        } else if (eleccion == 2 && numeroaleatorio == 1) {
            System.out.println("Ganaste");
        } else if (eleccion == 3 && numeroaleatorio == 2) {
            System.out.println("Ganaste");
        }else{
            System.out.println("Perdiste");
        }
    }
}