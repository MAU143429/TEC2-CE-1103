package backend;

public abstract class Motor {
   abstract public void encender();
   abstract public void acelerar();
   abstract public void apagar();
}

   // Esta es la clase que recibe la orden del usuario que hizo en la clase apliacion, esta clase conecta con todos los motores para realizar
   // los metodos de los mismos

