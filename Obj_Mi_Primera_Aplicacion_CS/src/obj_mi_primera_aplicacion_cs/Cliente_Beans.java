package obj_mi_primera_aplicacion_cs;

import java.sql.*;

public class Cliente_Beans {

    private int id_cliente;
    private String cedula;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String telefono;
    Acceso_BD bd;

    public Cliente_Beans() throws Exception {
        bd = new Acceso_BD("127.0.0.1", "root", "0991301090angel", "facturacion");
        bd.conecta_BD();
    }

    public Cliente_Beans(int id_cliente, String cedula, String nombres, String apellidos, String direccion, String telefono) {
        this.id_cliente = id_cliente;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public int Incremento_Cliente() throws SQLException {
        int x = 0;
        ResultSet rs;
        rs = bd.consulta_BD("Select max(id_cliente) as num from cliente;");
        if (rs.next()) {
            x = rs.getInt(1) + 1;
        } else {
            x = 1;
        }
        return x;
    }

    public void Insertar_Cliente() throws SQLException {
        String cadena = "insert into cliente values ('" + getId_cliente() + "','" + getCedula() + "','" + getNombres() + "','" + getApellidos() + "','" + getDireccion() + "','" + getTelefono() + "');";
        bd.actualiza_BD(cadena);
    }

    public void Actualizar_Cliente(int id, String cedula, String nombres, String apellidos, String direccion, String telefono) throws SQLException {
        String actu = "UPDATE cliente SET cedula = '" + cedula + "', nombres = '" + nombres + "', apellidos = '" + apellidos + "', direccion = '" + direccion + "', telefono = '" + telefono + "' " + "WHERE id_cliente = " + id + ";";
        bd.actualiza_BD(actu);
    }

    public void Eliminar_Cliente(int id) throws SQLException {
        String eli = "DELETE FROM cliente WHERE id_cliente = " + id + ";";
        bd.actualiza_BD(eli);
    }

    public ResultSet Consultar_Tabla(String sql) throws SQLException {
        return bd.consulta_BD(sql);
    }

    public void Consultar_Cliente() throws SQLException {
        ResultSet rs;
        rs = bd.consulta_BD("select * from cliente;");
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
