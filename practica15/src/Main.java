import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Main {
    private static ArrayList<Empleado> empleados = new ArrayList<>();
    public static void main(String[] args) {
        boolean salir = false;
        while (!salir) {
            String opcion = JOptionPane.showInputDialog(null,
                    "1. Agregar Empleado\n2. Mostrar info de empleados\n3. Salir", "Menu", JOptionPane.QUESTION_MESSAGE);

            if (opcion == null) break;
            switch (opcion) {
                case "1":
                    agregarEmpleado();
                    break;
                case "2":
                    listarEmpleados();
                    break;
                case "3":
                    salir = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no valida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private static void agregarEmpleado() {
        String tipo = JOptionPane.showInputDialog(null,
                "Seleccione el tipo de empleado:\n1. Conductor\n2. Administrativo", "Tipo de Empleado", JOptionPane.QUESTION_MESSAGE);

        if (tipo == null) return;

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre:");
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su ID:"));
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario:"));

        switch (tipo) {
            case "1":
                String licencia = JOptionPane.showInputDialog("Ingrese el tipo de licencia:");
                empleados.add(new Conductores(nombre, id, salario, licencia));
                break;
            case "2":
                String departamento = JOptionPane.showInputDialog("Ingrese el departamento:");
                empleados.add(new Administrativo(nombre, id, salario, departamento));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void listarEmpleados() {
        if (empleados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay valores registrados", "No hay valores registrados", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (Empleado e : empleados) {
            e.mostrarInfo();
        }
    }
}
