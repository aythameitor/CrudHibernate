import CrudComAutonoma.CrudComAutonoma;
import CrudLocalidad.CrudLocalidad;
import CrudProvincia.CrudProvincia;
import Hibernate.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    private static final SessionFactory ourSessionFactory;
    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            ourSessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    public static void main(final String[] args) throws Exception {
        CrudComAutonoma crudComAutonoma = new CrudComAutonoma();
        CrudLocalidad crudLocalidad = new CrudLocalidad();
        CrudProvincia crudProvincia = new CrudProvincia();

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        //crudLocalidad.CreateLocalidad(session, 2, "39000 personas", "Telde", "Telde");
        //crudLocalidad.UpdateLocalidad(session, 2, "40000 personas", "Telde", "Telde");
        //crudLocalidad.DeleteLocalidad(session, 2);
        //crudLocalidad.ReadLocalidad(session);


        //crudComAutonoma.ReadComAutonoma(session);
        //crudComAutonoma.UpdateComAutonoma(session, 2,"700000 personas", "Murcia", "1200km2", "Murcia");
        //crudComAutonoma.DeleteComAutonoma(session, 3);
        //crudComAutonoma.CreateComAutonoma(session, 3, "40000 personas", "Islas Baleares", "600km2", "Palma de mallorca");


        //crudProvincia.ReadProvincia(session);
        //crudProvincia.CreateProvincia(session, 2, "70000 personas", "Las palmas", "600km2", "Las palmas");
        //crudProvincia.UpdateProvincia(session, 2, "60000 personas", "Las palmas", "600km2", "Las palmas");
        //crudProvincia.DeleteProvincia(session, 2);

        sessionFactory.close();
        session.close();
    }

}