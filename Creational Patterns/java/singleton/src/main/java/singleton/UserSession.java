package singleton;

/**
 *
 * @author julianm
 */
public final class UserSession {
    private static UserSession instance;
    private String user;

    private UserSession(String value) {
       user = value;
    }
    
    public static UserSession getInstance(String value){
        if(instance == null){
           instance = new UserSession(value);
        }
        return  instance;          
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
    
}
