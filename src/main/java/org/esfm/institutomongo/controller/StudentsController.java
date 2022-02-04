package org.esfm.institutomongo.controller;

import org.esfm.institutomongo.Absence;
import org.esfm.institutomongo.Student;
import org.esfm.institutomongo.exceptions.StudentNotFoundException;
import org.esfm.institutomongo.repository.StudentsRepository;
import org.esfm.institutomongo.services.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentsController {

    private StudentService studentService;

    public StudentsController(StudentService studentService) {
        this.studentService = studentService;
    }

    //- Actualizar los datos de un alumno
    public void modifyStudent(
            @PathVariable("groupId") String groupId,
            @PathVariable("nif") String nif
    ){
        return studentService.
    }

    //Listar faltas de alumnos
    @RequestMapping(method = RequestMethod.GET, path = "/students/{nif}/absences")
    public List<Absence> findAbsence(
            @PathVariable("nif") String nif
    ) throws StudentNotFoundException {
        return studentService.findAbsence(nif);
    }

    //- Añadir alumno a grupo
    public void insert(){
        
    }

    //- Eliminar alumno
    @RequestMapping(method = RequestMethod.DELETE, path = "/students/{nif}")
    public void delete(
            @PathVariable("nif") String nif
    ){
        studentService.deleteByNif(nif);
    }




    //- Dado un nif, una fecha y un módulo, añadir una falta a un alumno
    public void insterAbsecne(){

    }
}
