package ch.agilesolutions.data.rest.resource;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ch.agilesolutions.data.rest.model.Person;


@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

}