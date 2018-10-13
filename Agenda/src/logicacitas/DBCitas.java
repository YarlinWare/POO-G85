/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicacitas;

import datos.DBConexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import logica.Contacto;


/**
 *
 * @author Rapter
 */
public class DBCitas {
    DBConexion cn;

    public DBCitas() {
        cn = new DBConexion();
    }
    public Citas[] getCitas(){
        int registros = 0;
        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement("SELECT count(1) as cont" +
                                                                        " FROM citas ");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("cont");
            res.close();
        }catch(SQLException e){
            System.out.println(e);
        }
            Citas[] data = new Citas[registros];
        try{
        PreparedStatement pstm = cn.getConexion().prepareStatement("SELECT cit_id, " +
                                                                    " cit_id_contacto, " +
                                                                    " cit_fecha, " +
                                                                    " cit_lugar, " +
                                                                    " cit_hora," +
                                                                    " cit_descripcion, " +
                                                                    " con_nombre, con_apellido " +
                                                                    " FROM citas " +
                                                                    " inner join contactos on(con_id = cit_id_contacto)" +
                                                                    " ORDER BY cit_id");
        
        ResultSet res = pstm.executeQuery();
        int i = 0;
        while(res.next()){
            data[i] = new Citas();
            data[i].setId(res.getInt("cit_id"));
            data[i].setPersona(res.getInt("cit_id_contacto"));
            /*data[i].setFecha(res.getDate("cit_fecha"));
            data[i].setHora(res.getTime("cit_hora"));*/
            data[i].setFecha2(res.getString("cit_fecha"));
            data[i].setHora2(res.getString("cit_hora"));
            data[i].setLugar(res.getString("cit_lugar"));
            data[i].setDescripcion(res.getString("cit_descripcion"));
            data[i].setNombre(res.getString("con_nombre") +" " + res.getString("con_apellido"));
            i++;
        }
        res.close();
        }catch(SQLException e){
            System.out.println(e);
        }
            return data;
        }
    
    public int insertarCitas(Citas c){
        int cont_usuario = -1;
        int resultado = 0;//no hubo errores de validacion
        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement("select count(1) as cont " +
                                                                        " from citas " +
                                                                        " where cit_fecha = ? ");
            pstm.setDate(1, c.getFecha());
            ResultSet res = pstm.executeQuery();
            res.next();
            cont_usuario = res.getInt("cont");
            res.close();
            if(cont_usuario==0){
                pstm = cn.getConexion().prepareStatement("insert into citas (cit_id_contacto, " +
                                                        " cit_fecha, " +
                                                        " cit_lugar, " +
                                                        " cit_hora," +
                                                        " cit_descripcion, " +
                                                        " values(?,?,?,?,?,?)");

                pstm.setInt(1, c.getPersona());
                //pstm.setDate(2, c.getFecha2());
                pstm.setString(3, c.getLugar());
               // pstm.setTime(4, c.getHora2());
                pstm.setString(2, c.getFecha2());
                pstm.setString(4, c.getHora2());
                pstm.setString(5, c.getDescripcion());

                pstm.executeUpdate();

                pstm = cn.getConexion().prepareStatement("select last_insert_id()");
                res = pstm.executeQuery();
                res.next();
                resultado = res.getInt(1);
                res.close();
            }else{
                resultado = -2;//el login ya existe
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return resultado;
    }

    public int actualizarCita(Citas cts) {
        int resultado = 0;
        try{PreparedStatement pstm = cn.getConexion().prepareStatement("update citas"+" set" +
                                                                    " cit_id_contacto=?, " +
                                                                    " cit_fecha=?, " +
                                                                    " cit_lugar=?, " +
                                                                    " cit_hora=?," +
                                                                    " cit_descripcion=?, " +
                                                                    " con_nombre=?, con_apellido =?" +
                                                                    " where cit_id = ?" +
                                                                    " inner join contactos on(con_id = cit_id_contacto)" +
                                                                    " ORDER BY cit_id");
            pstm.setInt(1, cts.getPersona());
            pstm.setString(2, cts.getLugar());
            pstm.setString(3, cts.getFecha2());
            pstm.setString(4, cts.getHora2());
            pstm.setString(5, cts.getNombre());
            pstm.setString(6, cts.getDescripcion());
            pstm.setInt(7, cts.getId());
            resultado = pstm.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
            return resultado;
    }
    
    public int borrarCita(Citas c){
        int resultado = 0;
        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement("delete from citas " +
            " where con_id = ?");
            pstm.setInt(1, c.getId());
            resultado = pstm.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
            return resultado;
        }
}
