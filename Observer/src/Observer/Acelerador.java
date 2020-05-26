package Observer;

import java.util.ArrayList;

public class Acelerador implements SujetoObservable{
// Se crea un arraylist en donde se almacenan a todos los observadores
    private ArrayList<Observador> observadores;

    public Acelerador(){

        observadores = new ArrayList<Observador>();
    }
// Este es el evento que cambio el estado del acelerador debido a esto es que se notifica un cambio
    public void pisarElAcelerador(){
            // vas a asubir la potencia del motor
            notificar();

    }
// Este metodo permite enlazar observadores al acelerador para esto se agrega un nuevo observador al arraylist
    public void enlazarObservador (Observador o) {observadores.add(o);};
// El metodo notificar envia la notificacion que algo cambio en el objeto observado
    @Override
    public void notificar() {
        for(Observador o:observadores){o.update();}

    }
}
