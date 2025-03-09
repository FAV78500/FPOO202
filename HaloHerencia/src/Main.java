public class Main {
    public static void main(String[] args) {
Spartan2 jefemaestro=new Spartan2("Jefe Maestro",100,"Fusil",150);
        jefemaestro.mostrarInfo();
jefemaestro.usarManejoAvanzado();
jefemaestro.atacar("covenant");
jefemaestro.recibirDano(20);
jefemaestro.recargarEscudo();

Spartan3 Linda=new Spartan3("Linda",100,"Francotirador",80);
        Linda.mostrarInfo();
Linda.camuflajeActivo();
Linda.atacar("Elite");
Linda.recibirDano(20);
Linda.recargarEscudo();

Spartan4 Locke=new Spartan4("Locke",100,"Fusil",100);
        Locke.mostrarInfo();
Locke.usarPropulsores();
Locke.atacar("Brute");
Locke.recibirDano(20);
Locke.recargarEscudo();
    }
}
