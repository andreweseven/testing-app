package com.example.demo.controllers

import com.example.demo.models.Person
import com.example.demo.services.PersonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("person")
class PersonController() {
    @Autowired
    private val personService: PersonService? = null

    @GetMapping("/{id}")
    fun get(@PathVariable id: Int): Person? {
        return personService?.get(id)
    }

    @PostMapping
    fun add(@RequestBody person: Person) {
        personService?.add(person)
    }
}