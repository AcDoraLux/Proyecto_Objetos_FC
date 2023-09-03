package obj_mi_primera_aplicacion_cs;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Factura_Beans {

    private int id_factura;
    private int id_cliente;
    private int id_empleado;
    private String numero;
    private String fecha;
    private double subtotal;
    private double iva;
    private double total;
    private double descuento;
    private double efectivo;
    private double cambio;
    Acceso_BD bd;

    public Factura_Beans() throws Exception {
        bd = new Acceso_BD("127.0.0.1", "root", "0991301090angel", "facturacion");
        bd.conecta_BD();
    }

    public double getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(double efectivo) {
        this.efectivo = efectivo;
    }

    public double getCambio() {
        return cambio;
    }

    public void setCambio(double cambio) {
        this.cambio = cambio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int Incremento_factura() throws SQLException {
        int x = 0;
        ResultSet rs;
        rs = bd.consulta_BD("Select max(id_factura) as num from factura;");
        if (rs.next()) {
            x = rs.getInt(1) + 1;
        } else {
            x = 1;
        }
        return x;
    }

    public void Insertar_Factura() throws SQLException {
        String cadena = "insert into factura values ('" + getId_factura() + "','" + getId_cliente() + "','" + getId_empleado() + "','" + getNumero() + "','" + getFecha() + "','" + getSubtotal() + "','" + getIva() + "','" + getTotal() + "','" + getDescuento() + "','" + getEfectivo() + "','" + getCambio() +"');";
        bd.actualiza_BD(cadena);
    }

    public void Actualizar_Factura() {

    }

    public void Eliminar_Factura() {

    }

    public ResultSet Consultar_Factura(String sql) throws SQLException {
        return bd.consulta_BD(sql);
    }

    public void Consultar_Factura() throws SQLException {
        ResultSet rs;
        rs = bd.consulta_BD("select * from factura;");
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
