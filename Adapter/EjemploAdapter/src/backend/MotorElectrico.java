package backend;

public class MotorElectrico {

    private boolean conectado = false;

    public MotorElectrico() {
        System.out.println("Creando motor electrico...");
        this.conectado = false;
    }

    public void conectar() {
        System.out.println("Conectando motor eléctrico.");
        this.conectado = true;
    }

    public void activar() {
        if (!this.conectado) {
            System.out.println("No se puede activar porque no está conectado el motor eléctrico.");
        } else {
            System.out.println("Está conectado, activando motor eléctrico.");
        }
    }

    public void moverMasRapido() {
        if (!this.conectado) {
            System.out.println("No se puede mover rapido el motor eléctrico porque no está conectado.");
        } else {
            System.out.println("Moviendo más rapido, aumentando voltaje del motor eléctrico.");
        }
    }

    public void detener() {
        if (!this.conectado) {
            System.out.println("No se puede detener motor eléctrico porque no está conectado.");
        } else {
            System.out.println("Deteniendo motor eléctrico.");
        }
    }

    public void desconectar() {
        System.out.println("Desconectando motor eléctrico.");
        this.conectado = false;
    }
}

    // Este motor presenta metodos distintos a los que envia la clase Motor, por ende no es compatible con la misma, lo que hace
    // que esta no sea igual al resto de los motores y necesita que los comandos enviados por la clase Motor sean adaptados para esta
    // poder ejecutar sus metodos.