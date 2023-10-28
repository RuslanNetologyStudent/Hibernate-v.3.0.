package service;

import entity.Person;
import org.springframework.stereotype.Service;
import repository.GetRepository;

import java.util.List;

@Service
public class GetService {
    private final GetRepository repository;

    public GetService(GetRepository repository) {
        this.repository = repository;
    }

    public List<Person> getPersonsByCity(String city) {
        return repository.getPersonsByCity(city);
    }
}