package net.nemo.socialhub.entity;

/**
 * Created by tonyshi on 2016/12/25.
 */
public class User {

    private String name;

    public User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
