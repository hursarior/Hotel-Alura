

import Dao.HuespedDao;
import Model.Huesped;

public class testhuesped {
    public static void main(String[] args) {
        Huesped hh = new Huesped();
        HuespedDao jj = new HuespedDao();

        hh.setApellido("Marcos");
        hh.setNombre("James");
        hh.setNacionalidad("dominicano");
        hh.setNacionalidad("Dominicano");
        hh.setTelefono("null");

        jj.Guardar(hh);
        System.out.println(hh);

    }
}
