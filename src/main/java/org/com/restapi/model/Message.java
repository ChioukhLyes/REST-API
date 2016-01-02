package org.com.restapi.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by LYES-PC on 28/12/2015.
 */

@XmlRootElement
public class Message {

    private long id;
    private String message;
    private Date created;
    private String autho;

    public Message() {
    }

    public Message(long id, String message, String autho) {
        this.id = id;
        this.message = message;
        this.created = new Date();
        this.autho = autho;
    }

    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Date getCreated() {
        return created;
    }

    public String getAutho() {
        return autho;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setAutho(String autho) {
        this.autho = autho;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", message='" + message + '\'' +
                ", created=" + created +
                ", autho='" + autho + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message)) return false;

        Message message1 = (Message) o;

        if (getId() != message1.getId()) return false;
        if (!getMessage().equals(message1.getMessage())) return false;
        if (getCreated() != null ? !getCreated().equals(message1.getCreated()) : message1.getCreated() != null)
            return false;
        return getAutho() != null ? getAutho().equals(message1.getAutho()) : message1.getAutho() == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + getMessage().hashCode();
        result = 31 * result + (getCreated() != null ? getCreated().hashCode() : 0);
        result = 31 * result + (getAutho() != null ? getAutho().hashCode() : 0);
        return result;
    }
}
