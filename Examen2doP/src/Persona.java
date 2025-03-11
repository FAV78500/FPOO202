import javax.swing.JOptionPane;
public class Persona {
    protected String nombre;
    protected String apellidoPA;
    protected String apellidoMA;
    protected String ano;
    protected String carrera;
    protected int year;


    public Persona(String nombre, String carrera, String apellidoMA, String apellidoPA, String ano) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.apellidoMA = apellidoMA;
        this.apellidoPA = apellidoPA;
        this.ano = ano;
        this.year = 2025;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = 2025;
    }

    public String getApellidoPA() {
        return apellidoPA;
    }

    public void setApellidoPA(String apellidoPA) {
        this.apellidoPA = apellidoPA;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getApellidoMA() {
        return apellidoMA;
    }

    public void setApellidoMA(String apellidoMA) {
        this.apellidoMA = apellidoMA;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getano() {
        return ano;
    }

    public void setAño(String ano) {
        this.ano = ano;
    }

}