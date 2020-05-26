package Observer;

public class Motor implements Observador {

    public Motor(){}
    // Crea en la clase motor el metodo que pedira al sistema actualizaciones a cerca del estado del acelerador
    @Override
    public void update() {
        //accion a realizar despues de que se notifica que el acelerador a sido pisado
        System.out.println("El carro comienza a caminar");
    }
}
