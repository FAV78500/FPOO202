public class Main {
    public static void main(String[] args) {
Spartan jefeMaestro = new Spartan();
jefeMaestro.nombre="John";
        jefeMaestro.salud=50;
        jefeMaestro.escudo=80;
        jefeMaestro.armaPrincipal="Rifle de asalto MA40";
        jefeMaestro.MostrarInfo();
        jefeMaestro.atacar("Skirmisher");
        jefeMaestro.recargarArma(50);
        jefeMaestro.correr(true);
System.out.println("----------------------------------------------------");
        Spartan Linda058 = new Spartan();
        Linda058.nombre="Linda";
        Linda058.salud=10;
        Linda058.escudo=0;
        Linda058.armaPrincipal="Rifle francotirador nornfang";
        Linda058.MostrarInfo();
        jefeMaestro.atacar("Elite");
        jefeMaestro.recargarArma(5);
        jefeMaestro.correr(false);
    }
}
