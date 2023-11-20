package br.com.james.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.james.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {}