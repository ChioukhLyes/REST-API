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
}
