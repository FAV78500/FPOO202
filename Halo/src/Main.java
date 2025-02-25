public class Main {
    public static void main(String[] args) {
Spartan jefeMaestro = new Spartan("Rifle de asalto MA40",50,"John",100);
        jefeMaestro.MostrarInfo();
        jefeMaestro.atacar("Skirmisher");
        jefeMaestro.recargarArma(50);
        jefeMaestro.correr(true);
        jefeMaestro.setNombre("Fernando focking Avila");
        jefeMaestro.MostrarInfo();
        System.out.println(jefeMaestro.getNombre());
        /* Intento de uso de un metodo privados
        jefeMaestro.consultaCortana();*/
System.out.println("----------------------------------------------------");
        Spartan Linda058 = new Spartan("Rifle francotirador nornfang",100,"Linda",0);
        Linda058.MostrarInfo();
        Linda058.atacar("Elite");
        Linda058.recargarArma(5);
        Linda058.correr(false);
    }
}
