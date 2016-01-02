package org.com.restapi.ressources;

import org.com.restapi.model.Profile;
import org.com.restapi.service.ProfileService;

import javax.ws.rs.*;
import java.util.List;

/**
 * Created by Lyes CHIOUKH on 02/01/2015.
 */
@Path("/profiles")
@Produces("application/json")
@Consumes("application/json")
public class ProfileResource {

    /**
     * The Profile service.
     */
    ProfileService profileService = new ProfileService();

    /**
     * Gets profiles.
     *
     * @return the profiles
     */
    @GET
    public List<Profile> getProfiles() {
        return profileService.getAllProfiles();
    }

    /**
     * Gets profile.
     *
     * @param profileName the profile name
     * @return the profile
     */
    @GET
    @Path("/{profileName}")
    public Profile getProfile(@PathParam("profileName") String profileName) {
        return profileService.getProfile(profileName);
    }

    /**
     * Add profile profile.
     *
     * @param profile the profile
     * @return the profile
     */
    @POST
    public Profile addProfile(Profile profile) {
        return profileService.addProfile(profile);
    }

    /**
     * Update profile profile.
     *
     * @param profile the profile
     * @return the profile
     */
    @PUT
    public Profile updateProfile(Profile profile) {
        return profileService.updateProfile(profile);
    }

    /**
     * Delete profile profile.
     *
     * @param profileName the profile name
     * @return the profile
     */
    @DELETE
    @Path("/{profileName}")
    public Profile DELETEProfile(@PathParam("profileName") String profileName) {
        return profileService.deleteProfile(profileName);
    }
}
