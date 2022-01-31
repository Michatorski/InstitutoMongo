package org.esfm.institutomongo.controller;

import org.esfm.institutomongo.Group;
import org.esfm.institutomongo.repository.GroupRepository;
import org.esfm.institutomongo.services.GroupService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class GroupController {
    //Listar grupos
    //
    //- Listar alumnos de un grupo /groups/{groupId}/students
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
}
