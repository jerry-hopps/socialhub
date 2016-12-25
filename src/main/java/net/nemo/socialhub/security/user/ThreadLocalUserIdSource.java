package net.nemo.socialhub.security.user;

import net.nemo.socialhub.security.SecurityContext;
import org.springframework.social.UserIdSource;

/**
 * Created by tonyshi on 2016/12/22.
 */
public class ThreadLocalUserIdSource implements UserIdSource {

    public String getUserId() {
        return SecurityContext.getCurrentUser().getName();
    }
}
