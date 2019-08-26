package com.jackt.reactiveapi.constants;

import java.util.Base64;

import static org.springframework.security.crypto.keygen.KeyGenerators.secureRandom;

/**
 * <h1>SecurityConstants</h1>
 * <p>Class used to access / store constants for use in security classes</p>
 */
public final class SecurityConstants {

    public static final String AUTH_LOGIN_URL = ApplicationConstants.API_URL_EXT.concat("authenticate");
    public static final String JWT_SECRET = Base64.getEncoder().encodeToString(secureRandom(512).generateKey());
    public static final String TOKEN_HEADER = "Authorization";
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String TOKEN_TYPE = "JWT";
    public static final String TOKEN_ISSUER = "secure-api";
    public static final String TOKEN_AUDIENCE = "secure-app";

    private SecurityConstants() {

    }
}
