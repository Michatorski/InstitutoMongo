package org.esfm.institutomongo.repository;

import org.esfm.institutomongo.Group;
import org.esfm.institutomongo.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface GroupRepository extends MongoRepository<Group, Integer> {

    List<Student> findByGroupId(int groupId);
}
