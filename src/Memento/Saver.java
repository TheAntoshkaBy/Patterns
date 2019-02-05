package Memento;

import java.util.Date;

public class Saver {
    private final String version;
    private final Date date;

    public Saver(String version)
    {
        this.version = version;
        this.date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public String getVersion() {
        return version;
    }
}
