package com.example.demo.services.impl

import com.example.demo.models.Person
import com.example.demo.services.PersonService
import org.springframework.stereotype.Service

@Service
class PersonServiceImpl: PersonService {
    private val personList: HashSet<Person> = hashSetOf(Person(1, "Elena", 28), Person(2, "Andrey", 27))

    override fun get(id: Int): Person? {
        return personList.stream().filter {
            it.id == id
        }.findAny().orElse(null)
    }

    override fun add(person: Person) {
        personList.add(person)
    }
}
