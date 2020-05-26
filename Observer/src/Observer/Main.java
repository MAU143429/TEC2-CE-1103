package Observer;

/**
 * Este ejemplo del patron consiste en un sistema de aceleracion de un carro.
 * En este caso existen dos objetos el acelerador y el o los motores.
 * El patron funciona de la siguiente manera: El objeto observado es el acelerador y los observadores son los motores que en este caso pueden ser una cantidad indefinida de motores
 * El acelerador notificara a los motores que esten enlazados a el, en caso de que exista un cambio en el estado del acelerador(si esta siendo presionado o no)
 *Cuando se ejecuta un evento como el pisarElacelerador este debe notificar a los motores que fue presionado con el fin de que los motores entren en funcionamiento y permitan que el carrro en ese caso se comience a movilizar
 *
 * */

public class Main {
    public static void main (String [] args){
/**
        En este caso podriamos crear la cantidad de motores que queramos por lo que pueden existir muchos observadores(motores)

 */


    // Creacion de los motores
        Motor V8 = new Motor();
        Motor V9 = new Motor();
        Motor V10 = new Motor();
        Motor V11= new Motor();
        Motor V12 = new Motor();

    //Creacion del acelerador
        Acelerador x = new Acelerador();


    //Enlace entre motor y acelerador
        x.enlazarObservador(V8);
        x.enlazarObservador(V9);
        x.enlazarObservador(V10);
        x.enlazarObservador(V11);
        x.enlazarObservador(V12);


    // Evento de pisar el acelerador
        x.pisarElAcelerador();




    }


}
