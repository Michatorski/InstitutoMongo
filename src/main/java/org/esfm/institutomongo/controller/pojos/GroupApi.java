package org.esfm.institutomongo.controller.pojos;

import java.util.Objects;

public class GroupApi {

    private int id;
    private String title;
    private String curso;
    private String letra;
    private String aula;
    private int year;

    public GroupApi(int id, String title, String curso, String letra, String aula, int year) {
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
        GroupApi groupApi = (GroupApi) o;
        return id == groupApi.id && year == groupApi.year && Objects.equals(title, groupApi.title) && Objects.equals(curso, groupApi.curso) && Objects.equals(letra, groupApi.letra) && Objects.equals(aula, groupApi.aula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, curso, letra, aula, year);
    }

    @Override
    public String toString() {
        return "GroupApi{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", curso='" + curso + '\'' +
                ", letra='" + letra + '\'' +
                ", aula='" + aula + '\'' +
                ", year=" + year +
                '}';
    }
}
