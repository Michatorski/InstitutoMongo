package org.esfm.institutomongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document(collection = "groups")
public class Group {
    @Id
    private int id;
    private String title;
    private String curso;
    private String letra;
    private String aula;
    private int year;

    public Group(int id, String title, String curso, String letra, String aula, int year) {
        this.id = id;
        this.title = title;
        this.curso = curso;
        this.letra = letra;
        this.aula = aula;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return id == group.id && year == group.year && Objects.equals(title, group.title) && Objects.equals(curso, group.curso) && Objects.equals(letra, group.letra) && Objects.equals(aula, group.aula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, curso, letra, aula, year);
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", curso='" + curso + '\'' +
                ", letra='" + letra + '\'' +
                ", aula='" + aula + '\'' +
                ", year=" + year +
                '}';
    }
}
