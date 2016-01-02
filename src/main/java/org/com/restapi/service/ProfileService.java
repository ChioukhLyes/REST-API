package org.com.restapi.service;

import org.com.restapi.Bundle.Database;
import org.com.restapi.model.Profile;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Lyes CHIOUKH on 28/12/2015.
 */
public class ProfileService {

    private Map<String, Profile> profiles = Database.getProfiles();

    /**
     * Instantiates a new Profile service.
     */
    public ProfileService () {
        profiles.put("@lyes", new Profile(1, "@lyes","Lyes","Admin"));
        profiles.put("@mdr", new Profile(2, "@mdr", "Md", "R"));
    }

    /**
     * Get all profiles list.
     *
     * @return the list
     */
    public List<Profile> getAllProfiles() {
        return new ArrayList<>(profiles.values());
    }

    /**
     * Get mesage profile.
     *
     * @param name the name
     * @return the profile
     */
    public Profile getProfile(String name) {
        return profiles.get(name);
    }

    /**
     * Add profile profile.
     *
     * @param profile the profile
     * @return the profile
     */
    public Profile addProfile(Profile profile) {
        profile.setId(profiles.size() + 1);
        profiles.put(profile.getName(), profile);
        return profile;
    }

    /**
     * Update profile profile.
     *
     * @param profile the profile
     * @return the profile
     */
    public Profile updateProfile(Profile profile) {
        if (profile.getName().isEmpty()) {
            return null;
        }
        profiles.put(profile.getName(), profile);
        return profile;
    }

    /**
     * Delete profile profile.
     *
     * @param name the name
     * @return the profile
     */
    public Profile deleteProfile(String name) {
        return profiles.remove(name);
    }
}

