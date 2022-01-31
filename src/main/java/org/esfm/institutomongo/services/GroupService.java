package org.esfm.institutomongo.services;

import org.esfm.institutomongo.Group;
import org.esfm.institutomongo.repository.GroupRepository;
import org.esfm.institutomongo.repository.StudentsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {
    private GroupRepository groupRepository;
    private StudentsRepository studentsRepository;

    public GroupService(GroupRepository groupRepository, StudentsRepository studentsRepository) {
        this.groupRepository = groupRepository;
        this.studentsRepository = studentsRepository;
    }

    public List<Group> findGroup(){
        return groupRepository.findAll();
    }

    public boolean insert(Group group){
        if (groupRepository.existsById(group.getId())){
            return false;
        }
        groupRepository.insert(group);
        return true;
    }
}
