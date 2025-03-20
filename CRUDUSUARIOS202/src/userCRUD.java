/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author avila
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class userCRUD {
    private Connection conexion;
    public userCRUD(){
    conexion= ConexionMySQL.conectar();
    }
    public boolean crearusuario(String nombre, String contraseña, String correo){
        String sqlInsert="INSERT INTO Usuarios(nombre, correo, contraseña) values (?,?,?)";
    try{
        PreparedStatement ps = conexion.prepareStatement(sqlInsert);
        ps.setString(1, nombre);
        ps.setString(2, correo);
        ps.setString(3, contraseña);
        return ps.executeUpdate()>0;
    }
    catch(SQLException e){
    System.out.println("Error al intentar Insertar"+e.getMessage());
    return false;
    }
    }
}
