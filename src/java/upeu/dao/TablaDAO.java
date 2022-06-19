/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.dao;

import java.util.List;
import upeu.entity.Tabla;

/**
 *
 * @author alarc
 */
public interface TablaDAO {
     int create(Tabla tablita);

    int update(Tabla tablita);

    int delete(int idventa);

    Tabla read(int idventa);

    List<Tabla> readAll();
}
