package obj_mi_primera_aplicacion_cs;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Detalle_Factura_Beans {

    private int id_detalle_factura;
    private int id_factura;
    private int id_producto;
    private int cantidad;
    private double pvp;
    private double subtotal;
    private String forma_pago;
    Acceso_BD bd;

    public Detalle_Factura_Beans() throws Exception {
        bd = new Acceso_BD("127.0.0.1", "root", "0991301090angel", "facturacion");
        bd.conecta_BD();
    }

    public int getId_detalle_factura() {
        return id_detalle_factura;
    }

    public void setId_detalle_factura(int id_detalle_factura) {
        this.id_detalle_factura = id_detalle_factura;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getPvp() {
        return pvp;
    }

    public void setPvp(Double pvp) {
        this.pvp = pvp;
    }

    public String getForma_pago() {
        return forma_pago;
    }

    public void setForma_pago(String forma_pago) {
        this.forma_pago = forma_pago;
    }

    public int Incremento_Detalle_factura() throws SQLException {
        int x = 0;
        ResultSet rs;
        rs = bd.consulta_BD("Select max(id_detalle_factura) as num from detalle_factura;");
        if (rs.next()) {
            x = rs.getInt(1) + 1;
        } else {
            x = 1;
        }
        return x;
    }

    public void Insertar_Detalle_factura() throws SQLException {
        String cadena = "insert into detalle_factura values ('" + getId_detalle_factura() + "','" + getId_factura() + "','" + getId_producto() + "','" + getCantidad() + "','" + getPvp() + "','" + getSubtotal() + "','" + getForma_pago() + "');";
        bd.actualiza_BD(cadena);
    }

    public void Actualizar_Detalle_factura() {

    }

    public void Eliminar_Detalle_factura() {

    }

    public ResultSet Consultar_Tabla(String sql) throws SQLException {
        return bd.consulta_BD(sql);
    }

    public void Consultar_Detalle_factura() throws SQLException {
        ResultSet rs;
        rs = bd.consulta_BD("select * from detalle_factura;");
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
