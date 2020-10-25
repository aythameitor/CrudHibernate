package CrudComAutonoma;

import Modelo.ComautonomaEntity;
import org.hibernate.Session;

import java.util.List;

public class CrudComAutonoma {


    public CrudComAutonoma() {
    }

    public void ReadComAutonoma(Session session)
    {
        List<ComautonomaEntity> comautom = session.createQuery("from ComautonomaEntity ", ComautonomaEntity.class).getResultList();
        for(ComautonomaEntity comunAutonoma : comautom)
        {
            System.out.println("id: " +comunAutonoma.getCodComAutonoma()+" Nombre: " + comunAutonoma.getNombreComunidad()+
                    " Capital: " + comunAutonoma.getCapitalComunidad()+ " Poblacion: " + comunAutonoma.getPoblacionComunidad() +
                    " Superficie: "+ comunAutonoma.getSuperficieComunidad());
        }
        session.getTransaction().commit();
    }

    public void UpdateComAutonoma(Session session, int codigo, String poblacion, String nombre, String superficie, String capital){
        ComautonomaEntity com = (ComautonomaEntity) session.get(ComautonomaEntity.class, codigo);
        com.setCapitalComunidad(capital);
        com.setSuperficieComunidad(superficie);
        com.setNombreComunidad(nombre);
        com.setPoblacionComunidad(poblacion);
        System.out.println("Actualizado con éxito");
        session.getTransaction().commit();
    }

    public void CreateComAutonoma(Session session, int codigo, String poblacion, String nombre, String superficie, String capital){
        ComautonomaEntity com = new ComautonomaEntity();
        com.setSuperficieComunidad(superficie);
        com.setCapitalComunidad(capital);
        com.setNombreComunidad(nombre);
        com.setPoblacionComunidad(poblacion);
        com.setCodComAutonoma(codigo);
        session.save(com);
        System.out.println("Insertado con exito");
        session.getTransaction().commit();
    }

    public void DeleteComAutonoma(Session session, int codigo){
        ComautonomaEntity com = (ComautonomaEntity) session.load(ComautonomaEntity.class, codigo);
        session.delete(com);
        System.out.println("borrado con éxito");
        session.getTransaction().commit();
    }
}
