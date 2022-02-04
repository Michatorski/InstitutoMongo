package org.esfm.institutomongo.repository;

import org.esfm.institutomongo.Absence;
import org.esfm.institutomongo.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentsRepository extends MongoRepository<Student, String > {


    Student findByNif(String nif);
}
