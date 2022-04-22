package com.example.demo.services

import com.example.demo.models.Person

interface PersonService {
    fun get(id: Int): Person?

    fun add(person: Person)
}