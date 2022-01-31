package org.esfm.institutomongo.services;

import org.esfm.institutomongo.Student;
import org.esfm.institutomongo.exceptions.GroupNotFoundException;
import org.esfm.institutomongo.repository.GroupRepository;
import org.esfm.institutomongo.repository.StudentsRepository;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class StudentService {

    private StudentsRepository studentsRepository;
    private GroupRepository groupRepository;

    public StudentService(StudentsRepository studentsRepository, GroupRepository groupRepository) {
        this.studentsRepository = studentsRepository;
        this.groupRepository = groupRepository;
    }

    public List<Student> findStudents(){
        return studentsRepository.findAll();
    }


}
