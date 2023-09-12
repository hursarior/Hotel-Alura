package Dao;

import java.util.List;

import javax.persistence.EntityManager;


import Conexion.Conn;
import Model.Huesped;

public class HuespedDao {
    Conn conn = new Conn();

    public void Guardar(Huesped huesped) {
        EntityManager con = conn.CrearConexion();
        con.getTransaction().begin();
        con.persist(huesped);
        con.getTransaction().commit();
        con.close();
    }


    public void Eliminar(Huesped huesped) { 
        EntityManager con = conn.CrearConexion();
        con.getTransaction().begin();
        con.remove(huesped);
        con.getTransaction().commit();
        con.close();
    }

   
    public List<Huesped> Consultar() {
        EntityManager con = conn.CrearConexion();
        con.getTransaction().begin();
        String jpql = "SELECT h FROM Huesped h";
        List<?> Resultado = con.createQuery(jpql).getResultList();
        con.getTransaction().commit();
        con.close();
        return (List<Huesped>) Resultado;
    }

    
    public Object ConsultaId(Long id) {
        EntityManager con = conn.CrearConexion();
        con.getTransaction().begin();
        Huesped resultado = con.find(Huesped.class, id);
        con.getTransaction().commit();
        con.close();
        return resultado;

        
    }

    public List<Huesped> ConsultaApellido(String apellido) {
        EntityManager con = conn.CrearConexion();
        con.getTransaction().begin();
        String sql = "SELECT e FROM Huesped e WHERE e.apellido = '" + apellido + "'";
        List<Huesped> resultado = con.createQuery(sql).getResultList();
        con.getTransaction().commit();
        con.close();
        return resultado; 
    }
    


    
}
