import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        String apellidoPA = JOptionPane.showInputDialog("Ingrese su apellido paterno");
        String apellidoMA = JOptionPane.showInputDialog("Ingrese su apellido materno");
        String carrera = JOptionPane.showInputDialog("Ingrese su carrera");
        String ano = JOptionPane.showInputDialog("Ingrese su año de nacimiento");
        int year = 2025;
        String MATRICULA =
                String.valueOf(year).substring(2) +
                        ano.substring(2) +
                        nombre.substring(0, 1) +
                        apellidoPA.substring(0, 1) +
                        apellidoMA.substring(0, 1) +
                        String.format("%03d", (int) (Math.random() * 1000)) +
                        carrera.substring(0, 3);
        System.out.println(MATRICULA);
    }

    }


