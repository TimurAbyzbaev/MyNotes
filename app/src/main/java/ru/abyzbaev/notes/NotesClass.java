package ru.abyzbaev.notes;

public class NotesClass {
    private String noteName;
    private String descriptionNote;
    private String createDate;

    public NotesClass(String noteName, String descriptionNote, String createDate) {
        this.noteName = noteName;
        this.descriptionNote = descriptionNote;
        this.createDate = createDate;
    }

    public String getNoteName() {
        return noteName;
    }

    public String getDescriptionNote() {
        return descriptionNote;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setNoteName(String noteName) {
        this.noteName = noteName;
    }

    public void setDescriptionNote(String descriptionNote) {
        this.descriptionNote = descriptionNote;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
