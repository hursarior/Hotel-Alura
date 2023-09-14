package Dao;

import java.util.List;

import javax.persistence.EntityManager;

import Conexion.Conn;
import Model.Huesped;
import Model.Reserva;

public class ReservaDao {

    Conn conn = new Conn();
   
    public void Guardar(Reserva reservacion) {
        EntityManager con = conn.CrearConexion();
        con.getTransaction().begin();
        con.persist(reservacion);
        con.getTransaction().commit();
        con.close();
    }

    
    public void Eliminar(Reserva reservacion) {
        EntityManager con = conn.CrearConexion();
        con.getTransaction().begin();
        con.remove(reservacion);
        con.getTransaction().commit();
        con.close();

    }

    
    public List<Reserva> Consultar() {

        EntityManager con = conn.CrearConexion();
        con.getTransaction().begin();
        String jpql = "SELECT r FROM Reserva r";
        List<Reserva> Resultado = con.createQuery(jpql).getResultList();
        con.getTransaction().commit();
        con.close();
        return Resultado;

    }

   
    public Object ConsultaId(Long id) {
        EntityManager con = conn.CrearConexion();
        con.getTransaction().begin();
        Reserva resultado = con.find(Reserva.class, id);
        con.getTransaction().commit();
        con.close();
        return resultado;
    }

    public List<Reserva> ConsultarReservaId(Long Id) {
        EntityManager con = conn.CrearConexion();
        con.getTransaction().begin();
        String sql = "SELECT e FROM Reserva e WHERE e.reserca_id = '" + Id + "'";
        List<Reserva> resultado = con.createQuery(sql).getResultList();
        con.getTransaction().commit();
        con.close();
        return resultado; 
    }
    
}
