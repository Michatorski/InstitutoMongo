package org.esfm.institutomongo.repository;

import org.esfm.institutomongo.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface StudentsRepository extends MongoRepository<Student, String > {
}
