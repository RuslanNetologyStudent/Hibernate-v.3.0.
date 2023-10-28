package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import entity.Person;
import service.GetService;

import java.util.List;

@RestController
public class GetController {
    private final GetService service;

    public GetController(GetService service) {
        this.service = service;
    }

    @GetMapping("/persons/by-city")
    @ResponseBody
    public List<Person> getProduct(@RequestParam("city") String city) {
        return service.getPersonsByCity(city);
    }
}