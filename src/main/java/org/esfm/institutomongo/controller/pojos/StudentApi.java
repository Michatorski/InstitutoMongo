package org.esfm.institutomongo.controller.pojos;

import org.esfm.institutomongo.Absence;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Objects;

@Document(collection = "students")
public class StudentApi {

    private String nif;
    private String name;
    private String surname;


    public StudentApi(String nif, String name, String surname) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentApi that = (StudentApi) o;
        return Objects.equals(nif, that.nif) && Objects.equals(name, that.name) && Objects.equals(surname, that.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, surname);
    }

}
