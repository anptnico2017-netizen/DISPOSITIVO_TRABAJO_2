package dispositivos;

public class main {
    static void main() {
        disposi mouse;
        disposi teclado;
        disposi monitor;

        mouse=new disposi();
        teclado=new disposi();
        monitor=new disposi();
        mouse.nodispositivo1=41;
        teclado.nodispositivo2=23;
        monitor.nodispositivo3=45;
        System.out.println("EL ID DEL DISPOSITIVO 1 ES: "+mouse.nodispositivo1+" EL ID DEL SEGUNDO ES: "+teclado.nodispositivo2+" EL ID DEL DISPOSITIVO TRES ES: "+monitor.nodispositivo3);


    }
}
