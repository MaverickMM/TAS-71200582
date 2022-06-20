package com.uas.prakrplbo;

import java.util.List;

public abstract class Notes {
    private String notesName;
    public Notes(String notesName) {
        this.notesName = notesName;
    }

    public void addNotes(String notesName) {
        this.notesName = notesName;
    }

    public void showNotes() {
        this.notesName = notesName;
    }

    public Notes loadNotes(String notesName) {
        this.notesName = notesName;
    }

    public void saveNotes() {
        this.notesName = notesName;
    }
}
