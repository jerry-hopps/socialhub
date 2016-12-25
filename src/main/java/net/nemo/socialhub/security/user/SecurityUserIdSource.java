package net.nemo.socialhub.security.user;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.social.UserIdSource;

/**
 * Created by tonyshi on 2016/12/25.
 */
public class SecurityUserIdSource implements UserIdSource {

    public String getUserId() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null) {
            throw new IllegalStateException("Unable to get a ConnectionRepository: no security signed in");
        }
        return authentication.getName();
    }
}
