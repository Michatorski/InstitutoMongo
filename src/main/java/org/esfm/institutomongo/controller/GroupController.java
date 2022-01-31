package org.esfm.institutomongo.controller;

import org.esfm.institutomongo.Group;
import org.esfm.institutomongo.Student;
import org.esfm.institutomongo.exceptions.GroupNotFoundException;
import org.esfm.institutomongo.repository.GroupRepository;
import org.esfm.institutomongo.services.GroupService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.lang.reflect.Method;
import java.util.List;

@RestController
public class GroupController {
    //Listar grupos - HECHO
    //
    //- Listar alumnos de un grupo /groups/{groupId}/students hecho
    //
    //- Listar las faltas de un alumno
    //
    //- Añadir grupo

    private GroupService groupService;

    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/groups")
    public List<Group> findGroup(){
        return groupService.findGroup();
    }

    @RequestMapping(method = RequestMethod.POST, path = "/groups")
    public void insert(
            @RequestBody Group group
    ) {
        if (!groupService.insert(group)){
            throw new ResponseStatusException(HttpStatus.CONFLICT,
                    "Ya existe este grupo");
        }
    }

    @RequestMapping(method = RequestMethod.GET, path = "/groups/{group_id}/students")
    public List<Student> findByGroupId(
            @PathVariable ( "group_id") int groupId
    ) throws GroupNotFoundException {
        return groupService.findByGroupId(groupId);
    }
}
