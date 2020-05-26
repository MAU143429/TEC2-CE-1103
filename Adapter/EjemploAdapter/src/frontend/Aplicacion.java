package frontend;

import backend.Motor;
import backend.MotorComun;
import backend.MotorEconomico;
import backend.MotorElectricoAdapter;
import java.util.Scanner;

public class Aplicacion {
    
    private static Scanner S = new Scanner(System.in);
    private static Motor motor;
    // La clase aplicacion es lo que el usuario utiliza y conecta con la clase Motor para asi dar uso de los 3 diferentes motores
    public static void main(String[] args) {
        System.out.println("");
        int opcion;
        do{
            opcion = preguntarOpcion();
            switch(opcion) {
                case 1:
                    motor = new MotorComun();
                    usarMotor();
                    break;
                case 2:
                    motor = new MotorEconomico();
                    usarMotor();
                    break;
                case 3:
                    motor = new MotorElectricoAdapter();
                    usarMotor();
                    break;
                case 4:
                    System.out.println("¡Cerrando programa!");
                    break;
                default:
                    System.out.println("La opción ingresada NO es válida.");
            }
            System.out.print("\n\n");
        }while(opcion!=4);
    }

    private static int preguntarOpcion() {
        System.out.print(
                "MENÚ DE OPCIONES\n"
               +"---- -- --------\n"
               +"1. Encender motor común.\n"
               +"2. Encender motor económico.\n"
               +"3. Encender motor eléctrico.\n"
               +"4. Salir.\n"
               +"Seleccione opción: "
        );
        return Integer.parseInt( S.nextLine() );
    }
    //aqui muestra el uso de la clase motor
    private static void usarMotor() {
        motor.encender();
        motor.acelerar();
        motor.apagar();
    }
}
