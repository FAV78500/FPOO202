import javax.swing.JOptionPane;
public class Envio {
    private String codigoEnvio;
    private String destino;
    private double peso;

    public Envio(String codigoEnvio, String destino) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = 0;
    }
    public Envio(String codigoEnvio, String destino, double peso) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = peso;
    }
    public String getCodigoEnvio() { return codigoEnvio; }
    public void setCodigoEnvio(String codigoEnvio) { this.codigoEnvio = codigoEnvio; }
    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }
    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public static Envio crearEnvio() {
        String codigo = JOptionPane.showInputDialog("Ingrese el codigo del envio:");
        String destino = JOptionPane.showInputDialog("Ingrese el destino del envio:");
        String opcion = JOptionPane.showInputDialog("¿Desea ingresar el peso del envio?");
        if (opcion.equalsIgnoreCase("Sí")) {
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese en kg:"));
            return new Envio(codigo, destino, peso);
        } else {
            return new Envio(codigo, destino);
        }
    }
    public String toString() {
        return "Envio, Codigo: " + codigoEnvio + ", Destino: " + destino + ", Peso: " + peso + " kg";
    }
}

