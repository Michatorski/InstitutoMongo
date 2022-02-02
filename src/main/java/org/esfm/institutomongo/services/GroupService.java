package org.esfm.institutomongo.services;

import org.esfm.institutomongo.Group;
import org.esfm.institutomongo.Student;
import org.esfm.institutomongo.exceptions.GroupNotFoundException;
import org.esfm.institutomongo.repository.GroupRepository;
import org.esfm.institutomongo.repository.StudentsRepository;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class GroupService {
    private GroupRepository groupRepository;
    private StudentsRepository studentsRepository;

    public GroupService(GroupRepository groupRepository, StudentsRepository studentsRepository) {
        this.groupRepository = groupRepository;
        this.studentsRepository = studentsRepository;
    }

    public List<Group> findGroup() {
        return groupRepository.findAll();
    }

    public boolean insert(Group group) {
        if (groupRepository.existsById(group.getId())) {
            return false;
        }
        groupRepository.insert(group);
        return true;
    }

    public List<Student> findByGroupId( int groupId) throws GroupNotFoundException {

        if (!groupRepository.existsById(groupId)) {
            throw new GroupNotFoundException(groupId);
        } else {

            List<Student> allStudentsList = studentsRepository.findAll();
            List<Student> students = new LinkedList<>();

            for (Student student: allStudentsList){
                if (student.getIdGroup()==groupId){
                    students.add(student);
                }
            }

            return  students;
        }
    }


}
