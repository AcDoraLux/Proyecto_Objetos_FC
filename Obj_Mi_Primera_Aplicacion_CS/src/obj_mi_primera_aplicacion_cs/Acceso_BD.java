package obj_mi_primera_aplicacion_cs;

import java.sql.*;

public class Acceso_BD {

    private final String host;
    private final String user;
    private final String password;
    private final String bd;

    private Connection conexion;

    public Acceso_BD(String host, String user, String password, String bd) {
        this.host = host;
        this.user = user;
        this.password = password;
        this.bd = bd;
    }

    public String getHost() {
        return host;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getBd() {
        return bd;
    }

    public void conecta_BD() throws Exception {
        //estas tres opciones siempre tienen que estar para cualquier motor de base de datos
        try {
            //Driver driver = (Driver)//definir driver
            Class.forName("com.mysql.jdbc.Driver");//instanciar el driver
            String cadena = "jdbc:mysql://" + getHost() + ":3307/" + getBd();
            this.conexion = DriverManager.getConnection(cadena, getUser(), getPassword());
            System.out.println("Conexion exitosa a la base de datos.....COMMIT");
        } catch (Exception e) {
            System.out.println("Error de conexion a la base de datos....RollBack " + e.toString());
        }
    }

    public void actualiza_BD(String sql) throws SQLException {
        try {
            Statement stm = conexion.createStatement();
            stm.executeUpdate(sql);
            System.out.println("Transaccion exitosa....COMMIT");
        } catch (SQLException e) {
            System.out.println("Error en la transaccion...Rollbalck " + e.toString());
        }
    }

    public ResultSet consulta_BD(String sql) throws SQLException {
        ResultSet cursor;
        Statement stm = conexion.createStatement();
        cursor = stm.executeQuery(sql);
        return cursor;
    }

    public void cerrar_BD() throws SQLException {
        this.conexion.close();
    }
}
