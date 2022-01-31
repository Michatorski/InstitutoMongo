package org.esfm.institutomongo.exceptions;

import org.esfm.institutomongo.Group;

public class GroupNotFoundException extends Exception {

    private int id;

    public GroupNotFoundException(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
