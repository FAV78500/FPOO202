public class Spartan4 extends Spartan{
    public Spartan4(String nombre, int salud, String arma, int escudo){
        super(nombre,salud,arma,escudo=100);
    }
    public void usarPropulsores(){
        System.out.println(nombre+" usa propulsores para moverse rapidamente");
    }
}
