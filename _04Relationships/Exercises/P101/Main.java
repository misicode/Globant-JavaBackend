package com.misicode._04Relationships.Exercises.P101;

import com.misicode._04Relationships.Exercises.P101.entities.Person;
import com.misicode._04Relationships.Exercises.P101.services.PersonService;

public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService();

        System.out.println("Registrando Persona 1");
        Person person1 = personService.createPerson();
        System.out.println("\nRegistrando Persona 2");
        Person person2 = personService.createPerson();

        System.out.println(person1);
        System.out.println(person2);
    }
}
