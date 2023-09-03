package obj_mi_primera_aplicacion_cs;

import java.sql.*;

public class Empleado_Bens {

    private int id_empleado;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String telefono;
    private String cargo;
    Acceso_BD bd;

    public Empleado_Bens() throws Exception {
        bd = new Acceso_BD("127.0.0.1", "root", "0991301090angel", "facturacion");
        bd.conecta_BD();
    }

    public Empleado_Bens(int id_empleado, String nombres, String apellidos, String direccion, String telefono, String cargo) {
        this.id_empleado = id_empleado;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cargo = cargo;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int Incremento_Empleado() throws SQLException {
        int x = 0;
        ResultSet rs;
        rs = bd.consulta_BD("Select max(id_empleado) as num from empleado;");
        if (rs.next()) {
            x = rs.getInt(1) + 1;
        } else {
            x = 1;
        }
        return x;
    }

    public void Insertar_Empleado() throws SQLException {
        String cadena = "insert into empleado values ('" + getId_empleado() + "','" + getNombres() + "','" + getApellidos() + "','" + getDireccion() + "','" + getTelefono() + "','" + getCargo() + "');";
        bd.actualiza_BD(cadena);
    }

    public void Actualizar_Empleado(int id, String nombres, String apellidos, String direccion, String telefono, String cargo) throws SQLException {
        String actu = "UPDATE empleado SET nombres = '" + nombres + "', apellidos = '" + apellidos + "', direccion = '" + direccion + "', telefono = '" + telefono + "', cargo = '" + cargo + "' " + "WHERE id_empleado = " + id + ";";
        bd.actualiza_BD(actu);
    }

    public void Eliminar_Empleado(int id) throws SQLException {
        String eli = "DELETE FROM empleado WHERE id_empleado = " + id + ";";
        bd.actualiza_BD(eli);
    }

    public ResultSet Consultar_Tabla(String sql) throws SQLException {
        return bd.consulta_BD(sql);
    }

    public void Consultar_Empleado() throws SQLException {
        ResultSet rs;
        rs = bd.consulta_BD("select * from empleado;");
        while (rs.next()) {
            System.out.print(rs.getInt(1) + " - ");
            System.out.print(rs.getString(2) + " - ");
            System.out.print(rs.getString(3) + " - ");
            System.out.print(rs.getString(4) + " - ");
            System.out.print(rs.getString(5) + " - ");
            System.out.print(rs.getString(6));
            System.out.println("");
        }
    }
}
