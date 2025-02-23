import javax.swing.JOptionPane;
import java.security.SecureRandom;

public class Main {
    private int longitud;
    private boolean mayus;
    private boolean especialChar;
    private String passw;
    private static final String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMEROS = "0123456789";
    private static final String ESPECIALES = "!@#$%^&*()-_=+[]{}|;:,.<>?";

    private static final SecureRandom random = new SecureRandom();
    public Main(int longitud, boolean mayus, boolean especialChar) {
        this.longitud = (longitud < 8) ? 8 : longitud;
        this.mayus = mayus;
        this.especialChar = especialChar;
        this.passw = PasswGenerador();
    }
    public String PasswGenerador() {
        String caracteres = MINUSCULAS + NUMEROS;
        if (mayus) caracteres += MAYUSCULAS;
        if (especialChar) caracteres += ESPECIALES;

        StringBuilder contraseña = new StringBuilder(longitud);
        for (int i = 0; i < longitud; i++) {
            contraseña.append(caracteres.charAt(random.nextInt(caracteres.length())));
        }
        return contraseña.toString();
    }
    public String getContraseña() {
        return passw;
    }
    public String comprobarFortaleza() {
        int puntaje = 0;
        if (longitud >= 12) puntaje++;
        if (mayus) puntaje++;
        if (especialChar) puntaje++;
        if (passw.matches(".*\\d.*")) puntaje++;
        switch (puntaje) {
            case 4: return "Muy fuerte";
            case 3: return "Fuerte";
            case 2: return "Moderada";
            default: return "Débil";
        }
    }
    public static void main(String[] args) {
        try {
            String inputLongitud = JOptionPane.showInputDialog("Ingrese la longitud de la contraseña:");
            int longitud = Integer.parseInt(inputLongitud);
            int mayusOption = JOptionPane.showConfirmDialog(null, "¿Desea incluir mayúsculas?", "Opciones", JOptionPane.YES_NO_OPTION);
            boolean incluirMayus = (mayusOption == JOptionPane.YES_OPTION);
            int especialOption = JOptionPane.showConfirmDialog(null, "¿Desea incluir caracteres especiales?", "Opciones", JOptionPane.YES_NO_OPTION);
            boolean incluirEspeciales = (especialOption == JOptionPane.YES_OPTION);
            Main generador = new Main(longitud, incluirMayus, incluirEspeciales);
            String password = generador.getContraseña();
            String fortaleza = generador.comprobarFortaleza();
            JOptionPane.showMessageDialog(null, "Contraseña: " + password +" Su contraseña es: "+ fortaleza, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese un número valido para la longitud.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
