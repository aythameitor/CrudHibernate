package CrudProvincia;

import Hibernate.HibernateUtil;
import Modelo.ProvinciaEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class CrudProvincia {


    public CrudProvincia() {
    }

    public void ReadProvincia(Session session)
    {
        List<ProvinciaEntity> comautom = session.createQuery("from ProvinciaEntity ", ProvinciaEntity.class).getResultList();
        for(ProvinciaEntity comunAutonoma : comautom)
        {
            System.out.println("id: " +comunAutonoma.getCodProvincia()+" Nombre: " + comunAutonoma.getNombreProvincia()+
                    " Capital: " + comunAutonoma.getCapitalProvincia()+ " Poblacion: " + comunAutonoma.getPoblacionProvincia() +
                    " Superficie: "+ comunAutonoma.getSuperficieProvincia());
        }
        session.getTransaction().commit();
    }

    public void UpdateProvincia(Session session, int codigo, String poblacion, String nombre, String superficie, String capital){
        ProvinciaEntity com = (ProvinciaEntity) session.get(ProvinciaEntity.class, codigo);
        com.setCapitalProvincia(capital);
        com.setSuperficieProvincia(superficie);
        com.setNombreProvincia(nombre);
        com.setPoblacionProvincia(poblacion);
        System.out.println("Actualizado con éxito");
        session.getTransaction().commit();
    }

    public void CreateProvincia(Session session, int codigo, String poblacion, String nombre, String superficie, String capital){
        ProvinciaEntity com = new ProvinciaEntity();
        com.setSuperficieProvincia(superficie);
        com.setCapitalProvincia(capital);
        com.setNombreProvincia(nombre);
        com.setPoblacionProvincia(poblacion);
        com.setCodProvincia(codigo);
        session.save(com);
        System.out.println("Insertado con exito");
        session.getTransaction().commit();
    }

    public void DeleteProvincia(Session session, int codigo){
        ProvinciaEntity com = (ProvinciaEntity) session.load(ProvinciaEntity.class, codigo);
        session.delete(com);
        System.out.println("borrado con éxito");
        session.getTransaction().commit();
    }
}
