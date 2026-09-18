package utils;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {
    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("iXitique");

    public static EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }
}
