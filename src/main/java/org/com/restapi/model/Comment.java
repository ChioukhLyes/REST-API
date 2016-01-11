package org.com.restapi.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by Lyes CHIOUKH on 11/01/2016.
 */
@XmlRootElement
public class Comment {

    private String comment;
    private Date created;
    private long id;
    private String author;

    /**
     * Instantiates a new Comment.
     */
    public Comment() {
    }

    /**
     * Instantiates a new Comment.
     *
     * @param comment the comment
     * @param author  the author
     */
    public Comment(long id, String comment, String author) {
        this.id = id;
        this.comment = comment;
        this.created = new Date();
        this.author = author;
    }

    /**
     * Gets comment.
     *
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets comment.
     *
     * @param comment the comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * Gets created.
     *
     * @return the created
     */
    public Date getCreated() {
        return created;
    }

    /**
     * Sets created.
     *
     * @param created the created
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * Gets author.
     *
     * @return the author
     */
    public String getAutho() {
        return author;
    }

    /**
     * Sets author.
     *
     * @param author the author
     */
    public void setAutho(String author) {
        this.author = author;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "comment='" + comment + '\'' +
                ", created=" + created +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Comment)) return false;

        Comment comment1 = (Comment) o;

        if (getComment() != null ? !getComment().equals(comment1.getComment()) : comment1.getComment() != null)
            return false;
        if (getCreated() != null ? !getCreated().equals(comment1.getCreated()) : comment1.getCreated() != null)
            return false;
        return author != null ? author.equals(comment1.author) : comment1.author == null;

    }

    @Override
    public int hashCode() {
        int result = getComment() != null ? getComment().hashCode() : 0;
        result = 31 * result + (getCreated() != null ? getCreated().hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        return result;
    }
}
