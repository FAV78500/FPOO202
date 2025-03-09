import javax.swing.JOptionPane;
class Conductores extends Empleado {
    private String licencia;

    public Conductores(String nombre, int id, double salario, String licencia) {
        super(nombre, id, salario);
        this.licencia = licencia;
    }

    @Override
    public void mostrarInfo() {
        JOptionPane.showMessageDialog(null,
                "Nombre: " + nombre + "\nID: " + id + "\nSalario: " + salario + "\nLicencia: " + licencia,
                "Informacion de conductor", JOptionPane.INFORMATION_MESSAGE);
    }
}
