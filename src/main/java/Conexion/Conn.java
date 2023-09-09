package Conexion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conn {
    
    public EntityManagerFactory factory =  Persistence.createEntityManagerFactory(
        "hotel");
    
    public EntityManager CrearConexion(){
        return factory.createEntityManager();
    }

}
