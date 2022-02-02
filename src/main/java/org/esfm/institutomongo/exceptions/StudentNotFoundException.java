package org.esfm.institutomongo.exceptions;

public class StudentNotFoundException extends Exception {
    private String nif;

    public StudentNotFoundException(String nif) {
        this.nif = nif;
    }

    public String getNif() {
        return nif;
    }
}
