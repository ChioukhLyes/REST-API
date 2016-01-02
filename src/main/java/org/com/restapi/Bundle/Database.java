package org.com.restapi.Bundle;

import org.com.restapi.model.Message;
import org.com.restapi.model.Profile;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by LYES-PC on 28/12/2015.
 */

/**
 * My database class, JUST FOR LEARNING !
 */
public class Database {

    /**
     * The constant messages.
     */
    public static Map<Long, Message> messages = new HashMap<>();
    /**
     * The constant profiles.
     */
    public static Map<Long, Profile> profiles = new HashMap<>();

    /**
     * Get messages map.
     *
     * @return the map
     */
    public static Map<Long, Message> getMessages() {
        return messages;
    }

    /**
     * Get profiles map.
     *
     * @return the map
     */
    public static Map<Long, Profile> getProfiles() {
        return profiles;
    }
}
