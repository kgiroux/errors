package com.giroux.kevin.dofustuff.error;

public enum ErrorProfile {
    /**
     * Cannot delete Functionality => A right is associate to this func
     */
    ERR_PROFILE_01,
    /**
     * Cannot delete Right => A Profile is associate to this right
     */
    ERR_PROFILE_02,
    /**
     * Cannot find user
     */
    ERR_PROFILE_03,
    /**
     * Invalid input
     */
    ERR_PROFILE_04,
    /**
     * Invalid password
     */
    ERR_PROFILE_05,
    /**
     * No authorization provided in the header.
     */
    ERR_PROFILE_06,
    /**
     * Credentials not available.
     */
    ERR_PROFILE_07,
    /**
     * Unknown user.
     */
    ERR_PROFILE_08,
    /**
     * Incorrect password.
     */
    ERR_PROFILE_09,
    /**
     * No profiles has been defined for
     */
    ERR_PROFILE_10,
    /**
     * User déjà existant.
     */
    ERR_PROFILE_11
}
