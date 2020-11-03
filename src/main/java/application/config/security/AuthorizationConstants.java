package application.config.security;

public class AuthorizationConstants {
    public static final long ACCESS_TOKEN_VALIDITY_SECONDS = 5*60*60;

    public static final String SIGNING_KEY = "czIz";

    public static final String TOKEN_PREFIX = "Bearer ";

    public static final String HEADER_STRING = "Authorization";

    public static final String AUTHORITIES_KEY = "scopes";
}
