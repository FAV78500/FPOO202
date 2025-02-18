public class Spartan {
    public String nombre;
    public int salud, escudo;
    String armaPrincipal;

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
}
