package Dao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;


import Conexion.Conn;
import Model.Huesped;
import Model.Nacionalidad;
import Model.Reserva;
import net.bytebuddy.asm.Advice.Local;

public class HuespedDao {
    Conn conn = new Conn();

    public void Guardar(Huesped huesped) {
        EntityManager con = conn.CrearConexion();
        con.getTransaction().begin();
        con.persist(huesped);
        con.getTransaction().commit();
        con.close();
    }


    public void Eliminar(Long id) { 
        EntityManager con = conn.CrearConexion();
        con.getTransaction().begin();
        Huesped huesped = con.find(Huesped.class, id);
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

    
    public Huesped ConsultaId(Long id) {
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
    
    public void ActualizarHuesped(Long id, String nombre, String apellido,LocalDate 
    fecha, String telefono ){

        EntityManager con = conn.CrearConexion();
        con.getTransaction().begin();
        Huesped huesped = con.find(Huesped.class, id);

        huesped.setNombre(nombre);
        huesped.setApellido(apellido);
        huesped.setFecha_nacimiento(fecha);
        huesped.setTelefono(telefono);

        con.getTransaction().commit();
        con.close();
    }

    
}
