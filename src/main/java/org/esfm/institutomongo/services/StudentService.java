package org.esfm.institutomongo.services;

import org.esfm.institutomongo.Absence;
import org.esfm.institutomongo.Student;
import org.esfm.institutomongo.exceptions.GroupNotFoundException;
import org.esfm.institutomongo.exceptions.StudentNotFoundException;
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

    public List<Student> findStudents() {
        return studentsRepository.findAll();
    }

    public List<Absence> findAbsence(String nif) throws StudentNotFoundException {
        if (!studentsRepository.existsById(nif)) {
            throw new StudentNotFoundException(nif);
        }
        return studentsRepository.findByNif(nif).getFaults();

    }

    public boolean deleteByNif(String nif) {
        if (studentsRepository.existsById(nif)) {
            return false;
        }
        studentsRepository.deleteById(nif);
        return true;
    }

    public boolean update(Student student){
        if (!studentsRepository.existsById(student.getNif())){
            return false;
        }
        studentsRepository.save(student);
        return true;
    }

}
