package repository;

import entity.Person;
import org.springframework.stereotype.Repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class GetRepository {
    @PersistenceContext
    private EntityManager manager;

    public List<Person> getPersonsByCity(String city) {
        return manager.createQuery("SELECT p FROM Person p WHERE p.city_of_living = :city")
                .setParameter("city",city).getResultList();
    }
}