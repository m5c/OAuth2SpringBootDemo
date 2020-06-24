package eu.kartoffelquadrat.timeservice;

import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

/**
 * Controller that resolves to a user identity based on a passed oauth2 token.
 *
 * Sample access:
 * curl "http://127.0.0.1:8084/api/username?access_token=...="
 */
public class IdentifyUserController {

    @GetMapping(value = "/api/username")
    public String currentUserName(Principal principal) {
        return principal.getName();
    }
}
