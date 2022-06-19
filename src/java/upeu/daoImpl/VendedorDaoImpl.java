/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import upeu.config.Conexion;
import upeu.dao.VendedorDAO;
import upeu.entity.Vendedor;

/**
 *
 * @author alarc
 */
public class VendedorDaoImpl implements upeu.dao.VendedorDAO{
private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;
    
    @Override
    public int create(Vendedor vendedor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public int update(Vendedor vendedor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(int idvendedor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Vendedor read(int idvendedor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


@Override
    public List<Vendedor> readAll() {String SQL = "SELECT v.idvendedor, v.idpersona, v.nombre, p.nombres FROM vendedor v join personas p on v.idpersona = p.idpersona";
        List<Vendedor> lista = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Vendedor s = new Vendedor();
                s.setIdvendedor(rs.getInt("idvendedor"));
                s.setIdpersona(rs.getInt("idpersona"));
                s.setNombre(rs.getString("nombre"));
                s.setNombres(rs.getString("nombres"));
               
           
                lista.add(s);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return lista;
    }

  
    
}
 