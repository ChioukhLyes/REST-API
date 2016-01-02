package org.com.restapi.service;

import org.com.restapi.Bundle.Database;
import org.com.restapi.model.Profile;

import java.util.Map;

/**
 * Created by LYES-PC on 28/12/2015.
 */
public class ProfileService {

    private Map<Long, Profile> profiles = Database.getProfiles();


}
