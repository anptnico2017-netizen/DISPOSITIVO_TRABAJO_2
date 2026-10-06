package DISPOSITIVOS;

public class Dispositivo {
    int nodispositivo1;
    int nodispositivo2;
    int nodispositivo3;
    private String nombre;
    private String tipo;
    private boolean activo;
    char disp1;
    char disp2;
    char disp3;
    public void setNombre(String nombre){
        if (nombre != null && !nombre.isBlank()) {
            System.out.println("El nombre es válido.");
        } else {
            System.out.println("El nombre es nulo o está en blanco.");
        }
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
}
