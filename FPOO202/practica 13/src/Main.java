import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = null;
        Conductor conductor = null;
        Envio envio = null;
        int option;
        do {
            String menu = "Menu\n"
                    + "1. Ingresar vehículo\n"
                    + "2. Ingresar conductor\n"
                    + "3. Asignar conductor\n"
                    + "4. Registrar envio\n"
                    + "5. Mostrar info de auto\n"
                    + "6. Mostrar info de conductor\n"
                    + "7. Mostrar info de envio\n"
                    + "8. Salir\n"
                    + "Ingrese su opcion:";

            option = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (option) {
                case 1:
                    vehiculo = new Vehiculo();
                    JOptionPane.showMessageDialog(null, "Vehículo creado exitosamente.");
                    break;
                case 2:
                    conductor = new Conductor();
                    JOptionPane.showMessageDialog(null, "Conductor creado exitosamente.");
                    break;
                case 3:
                    if (vehiculo == null) {
                        JOptionPane.showMessageDialog(null, "Primero debe crear un vehículo.");
                    } else if (conductor == null) {
                        JOptionPane.showMessageDialog(null, "Primero debe crear un conductor.");
                    } else {
                        vehiculo.asignarConductor(conductor);
                    }
                    break;
                case 4:
                    envio = Envio.crearEnvio();
                    JOptionPane.showMessageDialog(null, "Envío registrado exitosamente.");
                    break;
                case 5:
                    if (vehiculo == null) {
                        JOptionPane.showMessageDialog(null, "No hay un vehículo registrado.");
                    } else {
                        JOptionPane.showMessageDialog(null, vehiculo.toString());
                    }
                    break;
                case 6:
                    if (conductor == null) {
                        JOptionPane.showMessageDialog(null, "No hay un conductor registrado.");
                    } else {
                        JOptionPane.showMessageDialog(null, conductor.toString());
                    }
                    break;
                case 7:
                    if (envio == null) {
                        JOptionPane.showMessageDialog(null, "No hay un envío registrado.");
                    } else {
                        JOptionPane.showMessageDialog(null, envio.toString());
                    }
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "Nos vemos pronto¡");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente nuevamente.");
            }
        } while (option != 8);
    }
}
