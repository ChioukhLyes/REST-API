package org.com.restapi.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by Lyes CHIOUKH on 28/12/2015.
 */
@XmlRootElement
public class Profile {

    private long id;
    private String name;
    private String firstName;
    private String lasteName;
    private Date created;

    /**
     * Instantiates a new Profile.
     *
     * @param id        the id
     * @param name      the name
     * @param firstName the first name
     * @param lasteName the laste name
     */
    public Profile(long id, String name, String firstName, String lasteName) {
        this.id = id;
        this.name = name;
        this.firstName = firstName;
        this.lasteName = lasteName;
        this.created = new Date();
    }

    /**
     * Instantiates a new Profile.
     */
    public Profile() {

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

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets laste name.
     *
     * @return the laste name
     */
    public String getLasteName() {
        return lasteName;
    }

    /**
     * Sets laste name.
     *
     * @param lasteName the laste name
     */
    public void setLasteName(String lasteName) {
        this.lasteName = lasteName;
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

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lasteName='" + lasteName + '\'' +
                ", created=" + created +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Profile)) return false;

        Profile profile1 = (Profile) o;

        if (getId() != profile1.getId()) return false;
        if (getName() != null ? !getName().equals(profile1.getName()) : profile1.getName() != null) return false;
        if (getFirstName() != null ? !getFirstName().equals(profile1.getFirstName()) : profile1.getFirstName() != null)
            return false;
        if (getLasteName() != null ? !getLasteName().equals(profile1.getLasteName()) : profile1.getLasteName() != null)
            return false;
        return getCreated() != null ? getCreated().equals(profile1.getCreated()) : profile1.getCreated() == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getFirstName() != null ? getFirstName().hashCode() : 0);
        result = 31 * result + (getLasteName() != null ? getLasteName().hashCode() : 0);
        result = 31 * result + (getCreated() != null ? getCreated().hashCode() : 0);
        return result;
    }

}
