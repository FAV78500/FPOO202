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
       setLongitud(longitud);
       this.mayus = mayus;
       this.especialChar = especialChar;
       this.passw=PasswGenerador();
    }
    private String PasswGenerador() {
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
    public String comprobacion() {
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
      try{
          String inputLongitud =JOptionPane.showInputDialog("Ingrese longitud de contraseña");
          int longitud = Integer.parseInt(inputLongitud);
int mayusOption=JOptionPane.showConfirmDialog(null,"¿Desea incluir mayusculas?");
boolean includeMayus=(mayusOption==JOptionPane.YES_OPTION);
int especialOption=JOptionPane.showConfirmDialog(null,"¿Desea incluir caracteres especiales?");
boolean includeEspecial=(especialOption==JOptionPane.YES_OPTION);

Main generator =new Main(longitud,includeMayus,includeEspecial);
String password =generator.getContraseña();
String fort =generator.comprobacion();
JOptionPane.showMessageDialog(null,"Contraseña: "+password+"\nSu contraseña es: "+fort,"Resultado",JOptionPane.INFORMATION_MESSAGE);
      }catch(NumberFormatException e){
          JOptionPane.showMessageDialog(null,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
      }
    }
    public boolean isMayus() {
        return mayus;
    }

    public void setMayus(boolean mayus) {
        this.mayus = mayus;
    }

    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }

    public boolean isEspecialChar() {
        return especialChar;
    }

    public void setEspecialChar(boolean especialChar) {
        this.especialChar = especialChar;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
}
