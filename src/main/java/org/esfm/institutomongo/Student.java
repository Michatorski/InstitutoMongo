package org.esfm.institutomongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Objects;

@Document(collection = "students")
public class Student {
    @Id
    private String nif;
    private String name;
    private String surname;
    private int idGroup;
    private List<Fault>faults;

    public Student(String nif, String name, String surname, int idGroup, List<Fault> faults) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
        this.idGroup = idGroup;
        this.faults = faults;
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

    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    public List<Fault> getFaults() {
        return faults;
    }

    public void setFaults(List<Fault> faults) {
        this.faults = faults;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return idGroup == student.idGroup && Objects.equals(nif, student.nif) && Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(faults, student.faults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, surname, idGroup, faults);
    }

    @Override
    public String toString() {
        return "Students{" +
                "nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", idGroup=" + idGroup +
                ", faults=" + faults +
                '}';
    }
}
