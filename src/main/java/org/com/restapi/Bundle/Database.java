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

    public static Map<Long, Message> messages = new HashMap<>();
    public static Map<Long, Profile> profiles = new HashMap<>();

    public static Map<Long, Message> getMessages(){
        return messages;
    }

    public static Map<Long, Profile> getProfiles(){
            return profiles;
    }
}
