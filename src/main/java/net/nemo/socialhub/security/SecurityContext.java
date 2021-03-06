package net.nemo.socialhub.security;

import net.nemo.socialhub.entity.User;

/**
 * Created by tonyshi on 2016/12/25.
 */
public final class SecurityContext {

    private static final ThreadLocal<User> currentUser = new ThreadLocal<User>();

    public static User getCurrentUser() {
        User user = currentUser.get();
        if (user == null) {
            return new User("anonymous");
            //throw new IllegalStateException("No security is currently signed in");
        }
        return user;
    }

    public static void setCurrentUser(User user) {
        currentUser.set(user);
    }

    public static boolean userSignedIn() {
        return currentUser.get() != null;
    }

    public static void remove() {
        currentUser.remove();
    }
}
