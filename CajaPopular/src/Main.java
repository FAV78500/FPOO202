import javax.swing.JOptionPane;
class Titular {
    private String nombre;
    private int edad;

    public Titular(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = (edad > 0) ? edad : 1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }
    }
}

class Cuenta {
    private int numeroCuenta;
    private Titular titular;
    private double saldo;

    public Cuenta(int numeroCuenta, Titular titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = (saldoInicial >= 0) ? saldoInicial : 0;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void ingreso(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    public boolean retiro(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            return true;
        }
        return false;
    }

    public boolean deposito(Cuenta cuentaDestino, double monto) {
        if (retiro(monto)) {
            cuentaDestino.ingreso(monto);
            return true;
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad:"));
        Titular titular = new Titular(nombre, edad);

        int numeroCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de cuenta:"));
        double saldoInicial = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo inicial:"));

        Cuenta cuenta = new Cuenta(numeroCuenta, titular, saldoInicial);

        boolean continuar = true;
        while (continuar) {
            String[] opciones = {"Consultar saldo", "Ingresar efectivo", "Retirar efectivo", "Salir"};
            int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Administración de Cuenta",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (opcion) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Saldo actual: " + cuenta.consultarSaldo()+"$");
                    break;
                case 1:
                    double ingreso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a depositar:"));
                    cuenta.ingreso(ingreso);
                    JOptionPane.showMessageDialog(null, "Depósito exitoso. Nuevo saldo: " + cuenta.consultarSaldo()+"$");
                    break;
                case 2:
                    double retiro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a retirar:"));
                    if (cuenta.retiro(retiro)) {
                        JOptionPane.showMessageDialog(null, "Retiro exitoso. Nuevo saldo: " + cuenta.consultarSaldo()+"$");
                    } else {
                        JOptionPane.showMessageDialog(null, "Saldo insuficiente o monto inválido.");
                    }
                    break;
                case 3:
                    continuar = false;
                    JOptionPane.showMessageDialog(null, "Hasta luego.");
                    break;
            }
        }
    }
}
