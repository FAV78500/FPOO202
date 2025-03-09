public class Spartan {
    private String nombre;
    private int salud;
    private int escudo;
    private String armaPrincipal;

    public Spartan(String armaPrincipal, int salud, String nombre, int escudo) {
        this.armaPrincipal = armaPrincipal;
        this.salud = salud;
        this.nombre = nombre;
        this.escudo = escudo;
    }
    
    public void MostrarInfo() {
        System.out.println("Informacion del Spartan");
        System.out.println("Nombre del Spartan: " + nombre);
        System.out.println("Porcentaje de Salud: " + salud);
        System.out.println("Porcentaje de Escudo: " + escudo);
        System.out.println("Arma Principal: " + armaPrincipal);
    }
    public void atacar(String enemigo){
        System.out.println(nombre+" ataca a "+enemigo+" con el arma: "+armaPrincipal);
    }
    public void recargarArma(int municion){
        int restantes =10;
        int total=restantes+municion;
        System.out.println(armaPrincipal+" ahora tiene disponibles "+total+" de municiones");
    }
    public void correr(boolean status){
        if(status){
            System.out.println("Spartan: "+nombre+" esta corriendo");
        }else {
            System.out.println("Spartan: "+nombre+" se detuvo");
        }
    }
    private void consultaCortana(){
        System.out.println("Conversacion privada...");
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public String getArmaPrincipal() {
        return armaPrincipal;
    }

    public void setArmaPrincipal(String armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
