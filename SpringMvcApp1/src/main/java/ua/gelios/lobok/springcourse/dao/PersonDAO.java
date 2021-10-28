package ua.gelios.lobok.springcourse.dao;

import org.springframework.stereotype.Component;
import ua.gelios.lobok.springcourse.models.Person;


import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT, "tom"));
        people.add(new Person(++PEOPLE_COUNT, "bob"));
        people.add(new Person(++PEOPLE_COUNT, "mike"));
        people.add(new Person(++PEOPLE_COUNT, "lola"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id)  {
        return people.stream().filter(person ->person.getId() == id).findAny().orElse(null);
    }
}
