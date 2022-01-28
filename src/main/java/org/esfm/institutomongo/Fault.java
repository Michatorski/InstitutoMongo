package org.esfm.institutomongo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.Objects;

public class Fault {
    @JsonFormat(pattern = "yyyy/MM/dd")
    private Date date;
    private String module;

    public Fault(Date date, String module) {
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
        Fault fault = (Fault) o;
        return Objects.equals(date, fault.date) && Objects.equals(module, fault.module);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, module);
    }

    @Override
    public String toString() {
        return "Fault{" +
                "date=" + date +
                ", module='" + module + '\'' +
                '}';
    }
}
