package datasours;

import java.io.Serializable;

public class Image implements Serializable {
    private int id;
    private String uri;
    private int noteId;

    public Image() {
        this.id = -1;
        this.uri = "#";
        this.noteId = -1;
    }

    public Image(int id, String uri, int phoneId) {
        this.id = id;
        this.uri = uri;
        this.noteId = phoneId;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNoteId() {
        return noteId;
    }

    public void setPhoneId(int phoneId) {
        this.noteId = phoneId;
    }
}
