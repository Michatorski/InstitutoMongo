package org.esfm.institutomongo.controller;

import org.esfm.institutomongo.repository.StudentsRepository;
import org.esfm.institutomongo.services.StudentService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentsController {

    //
    //- Añadir alumno a grupo
    //
    //- Eliminar alumno
    //
    //- Actualizar los datos de un alumno
    //
    //- **** Dado un nif, una fecha y un módulo, añadir una falta a un alumno

    private StudentService studentService;

    public StudentsController(StudentService studentService) {
        this.studentService = studentService;
    }

    public void insert(){
        
    }

    public void delete(){

    }

    public void update(){

    }
}
