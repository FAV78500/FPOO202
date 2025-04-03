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
import java.sql.ResultSet;
public class userCRUD {
    private Connection conexion;
    
    public userCRUD(){
    conexion= ConexionMySQL.conectar();
    }
    public boolean crearusuario(String nombre, String correo, String contrasena){
        String sqlInsert="INSERT INTO Usuarios(nombre, correo, contrasena) values (?,?,?)";
    try{
        PreparedStatement ps = conexion.prepareStatement(sqlInsert);
        ps.setString(1, nombre);
        ps.setString(2, correo);
        ps.setString(3, contrasena);
        return ps.executeUpdate()>0;
    }
    catch(SQLException e){
    System.out.println("Error al intentar Insertar"+e.getMessage());
    return false;
    }
    }
    
    public ResultSet obtenerUsuarioPorID(int id){
    String selectSQL = "select * from Usuarios where id=?";
        try{
        PreparedStatement ps=conexion.prepareStatement(selectSQL);
        ps.setInt(1,id);
        return ps.executeQuery();
        }
        catch(SQLException e){
        System.out.println("Error al intentar consultar"+e.getMessage());
        return null;
        }
    }
    
public boolean actualizarUsuario(int id, String nombre, String correo, String contrasena) {
    Connection conexion = ConexionMySQL.conectar();
    if (conexion == null) return false;

    String sql = "UPDATE usuarios SET nombre=?, correo=?, contrasena=? WHERE id=?";
    try (PreparedStatement ps = conexion.prepareStatement(sql)) {
        ps.setString(1, nombre);
        ps.setString(2, correo);
        ps.setString(3, contrasena);
        ps.setInt(4, id);
        int filasAfectadas = ps.executeUpdate();
        return filasAfectadas > 0;
    } catch (SQLException e) {
        System.out.println("Error al actualizar usuario: " + e.getMessage());
        return false;
    }
}
    
    public boolean eliminarUsuario(int id) {
    String sql = "DELETE FROM usuarios WHERE id = ?";
    try ( Connection conexion = ConexionMySQL.conectar();
         PreparedStatement stmt = conexion.prepareStatement(sql)) {
        stmt.setInt(1, id);
        int filasAfectadas = stmt.executeUpdate();
        return filasAfectadas > 0;
    } catch (SQLException e) {
        System.out.println("Error al eliminar usuario: " + e.getMessage());
        return false;
    }
}
    
    public ResultSet obtenerTodos(){
    String sqlTodos="select * from usuarios";
    try{
       PreparedStatement ps=conexion.prepareStatement(sqlTodos);
        return ps.executeQuery();
    }
    catch(SQLException w){
        System.out.println("Error al consultar"+w.getMessage());
        return null;
    }
    }
}
