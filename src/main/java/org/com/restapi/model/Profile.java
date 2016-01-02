package org.com.restapi.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by LYES-PC on 28/12/2015.
 */

@XmlRootElement
public class Profile {

    private long id;
    private String name;
    private String profile;
    private String firstName;
    private String lasteName;
    private Date created;

    public Profile(long id, String name, String profile, String firstName, String lasteName, Date created) {
        this.id = id;
        this.name = name;
        this.profile = profile;
        this.firstName = firstName;
        this.lasteName = lasteName;
        this.created = created;
    }

    public Profile() {

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProfile() {
        return profile;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLasteName() {
        return lasteName;
    }

    public Date getCreated() {
        return created;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLasteName(String lasteName) {
        this.lasteName = lasteName;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", profile='" + profile + '\'' +
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
        if (getProfile() != null ? !getProfile().equals(profile1.getProfile()) : profile1.getProfile() != null)
            return false;
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
        result = 31 * result + (getProfile() != null ? getProfile().hashCode() : 0);
        result = 31 * result + (getFirstName() != null ? getFirstName().hashCode() : 0);
        result = 31 * result + (getLasteName() != null ? getLasteName().hashCode() : 0);
        result = 31 * result + (getCreated() != null ? getCreated().hashCode() : 0);
        return result;
    }

}
