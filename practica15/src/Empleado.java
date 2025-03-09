import javax.swing.JOptionPane;

class Empleado   {
    protected String nombre;
    protected int id;
    protected double salario;

    public Empleado(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }

    public void mostrarInfo() {
        JOptionPane.showMessageDialog(null,
                "Nombre: " + nombre + "\nID: " + id + "\nSalario: " + salario,
                "Informacion de empleado", JOptionPane.INFORMATION_MESSAGE);
    }
}
