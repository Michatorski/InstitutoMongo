package org.esfm.institutomongo.controller.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.Objects;

public class AbsenceApi {
    @JsonFormat(pattern = "yyyy/MM/dd")
    private Date date;
    private String module;

    public AbsenceApi(Date date, String module) {
        this.date = date;
        this.module = module;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbsenceApi absenceApi = (AbsenceApi) o;
        return Objects.equals(date, absenceApi.date) && Objects.equals(module, absenceApi.module);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, module);
    }

    @Override
    public String toString() {
        return "Absence{" +
                "date=" + date +
                ", module='" + module + '\'' +
                '}';
    }
}
