package DISPOSITIVOS;

public class Maindispo {
    static void main() {
        Dispositivo mouse;
        Dispositivo teclado;
        Dispositivo monitor;

        mouse=new Dispositivo();
        teclado=new Dispositivo();
        monitor=new Dispositivo();
        mouse.nodispositivo1=41;
        teclado.nodispositivo2=23;
        monitor.nodispositivo3=45;
        System.out.println("EL ID DEL DISPOSITIVO 1 ES: "+mouse.nodispositivo1+" EL ID DEL SEGUNDO ES: "+teclado.nodispositivo2+" EL ID DEL DISPOSITIVO TRES ES: "+monitor.nodispositivo3);


    }
}
