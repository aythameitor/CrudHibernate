package CrudLocalidad;

import Modelo.LocalidadEntity;
import org.hibernate.Session;

import java.util.List;

public class CrudLocalidad {


    public CrudLocalidad() {
    }

    public void ReadLocalidad(Session session)
    {
        List<LocalidadEntity> comautom = session.createQuery("from LocalidadEntity ", LocalidadEntity.class).getResultList();
        for(LocalidadEntity comunAutonoma : comautom)
        {
            System.out.println("id: " +comunAutonoma.getCodLocalidad()+" Nombre: " + comunAutonoma.getNombreLocalidad()+
                    " Capital: " + comunAutonoma.getCapitalLocalidad()+ " Poblacion: " + comunAutonoma.getPoblacionLocalidad());
        }
        session.getTransaction().commit();
    }

    public void UpdateLocalidad(Session session, int codigo, String poblacion, String nombre, String capital){
        LocalidadEntity com = (LocalidadEntity) session.get(LocalidadEntity.class, codigo);
        com.setCapitalLocalidad(capital);
        com.setNombreLocalidad(nombre);
        com.setPoblacionLocalidad(poblacion);
        System.out.println("Actualizado con éxito");
        session.getTransaction().commit();
    }

    public void CreateLocalidad(Session session, int codigo, String poblacion, String nombre, String capital){
        LocalidadEntity com = new LocalidadEntity();
        com.setCapitalLocalidad(capital);
        com.setNombreLocalidad(nombre);
        com.setPoblacionLocalidad(poblacion);
        com.setCodLocalidad(codigo);
        session.save(com);
        System.out.println("Insertado con exito");
        session.getTransaction().commit();
    }

    public void DeleteLocalidad(Session session, int codigo){
        LocalidadEntity com = (LocalidadEntity) session.load(LocalidadEntity.class, codigo);
        session.delete(com);
        System.out.println("borrado con éxito");
        session.getTransaction().commit();
    }
}
