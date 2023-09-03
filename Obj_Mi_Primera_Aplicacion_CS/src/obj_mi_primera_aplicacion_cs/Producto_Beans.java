package obj_mi_primera_aplicacion_cs;

import java.sql.*;

public class Producto_Beans {

    private int id_producto;
    private String cod_producto;
    private String nombre;
    private String descripcion;
    private double precio_costo;
    private double pvp;
    private int stock_maximo;
    private int stock_minimo;
    private String fecha_elaboracion;
    private String fecha_vencimiento;
    Acceso_BD bd;

    public Producto_Beans() throws Exception {
        bd = new Acceso_BD("127.0.0.1", "root", "0991301090angel", "facturacion");
        bd.conecta_BD();
    }

    public Producto_Beans(int id_producto, String cod_producto, String nombre, String descripcion, double precio_costo, double pvp, int stock_maximo, int stock_minimo, String fecha_elaboracion, String fecha_vencimiento) {
        this.id_producto = id_producto;
        this.cod_producto = cod_producto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio_costo = precio_costo;
        this.pvp = pvp;
        this.stock_maximo = stock_maximo;
        this.stock_minimo = stock_minimo;
        this.fecha_elaboracion = fecha_elaboracion;
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getCod_producto() {
        return cod_producto;
    }

    public void setCod_producto(String cod_producto) {
        this.cod_producto = cod_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio_costo() {
        return precio_costo;
    }

    public void setPrecio_costo(double precio_costo) {
        this.precio_costo = precio_costo;
    }

    public double getPvp() {
        return pvp;
    }

    public void setPvp(double pvp) {
        this.pvp = pvp;
    }

    public int getStock_maximo() {
        return stock_maximo;
    }

    public void setStock_maximo(int stock_maximo) {
        this.stock_maximo = stock_maximo;
    }

    public int getStock_minimo() {
        return stock_minimo;
    }

    public void setStock_minimo(int stock_minimo) {
        this.stock_minimo = stock_minimo;
    }

    public String getFecha_elaboracion() {
        return fecha_elaboracion;
    }

    public void setFecha_elaboracion(String fecha_elaboracion) {
        this.fecha_elaboracion = fecha_elaboracion;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public int Incremento_Producto() throws SQLException {
        int x = 0;
        ResultSet rs;
        rs = bd.consulta_BD("Select max(id_producto) as num from producto;");
        if (rs.next()) {
            x = rs.getInt(1) + 1;
        } else {
            x = 1;
        }
        return x;
    }

    public void Insertar_Producto() throws SQLException {
        String cadena = "insert into producto values ('" + getId_producto() + "','" + getCod_producto() + "','" + getNombre() + "','" + getDescripcion() + "','" + getPrecio_costo() + "','" + getPvp() + "','" + getStock_maximo() + "','" + getStock_minimo() + "','" + getFecha_elaboracion() + "','" + getFecha_vencimiento() + "');";
        bd.actualiza_BD(cadena);
    }

    public void Actualizar_Producto(int id, String cod, String nombre, String descripcion, double precio, double pvp, int stock_ma, int stock_mi, String fecha_e, String fecha_v) throws SQLException {
        String actu = "UPDATE producto SET cod_producto = '" + cod + "', nombre = '" + nombre + "', descripcion = '" + descripcion + "', precio_costo = '" + precio + "', pvp = '" + pvp + "', stock_maximo = '" + stock_ma + "', stock_minimo = '" + stock_mi + "', fecha_elaboracion = '" + fecha_e + "', fecha_vencimiento = '" + fecha_v + "' " + "WHERE id_producto = " + id + ";";
        bd.actualiza_BD(actu);
    }

    public void Eliminar_Producto(int id) throws SQLException {
        String eli = "DELETE FROM producto WHERE id_producto = " + id + ";";
        bd.actualiza_BD(eli);
    }

    public ResultSet Consultar_Tabla(String sql) throws SQLException {
        return bd.consulta_BD(sql);
    }

    public void Consultar_Producto() throws SQLException {
        ResultSet rs;
        rs = bd.consulta_BD("select * from producto;");
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
