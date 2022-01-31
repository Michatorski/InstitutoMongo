package org.esfm.institutomongo.repository;

import org.esfm.institutomongo.Group;
import org.esfm.institutomongo.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GroupRepository extends MongoRepository<Group, Integer> {


}
