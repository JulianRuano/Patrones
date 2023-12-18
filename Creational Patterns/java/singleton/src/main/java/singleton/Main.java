package singleton;


public class Main {

    public static void main(String[] args) {
        UserSession instance = UserSession.getInstance("pedro");
        System.out.println(instance.getUser());
        // La instancia de 1 y 2 es la misma
        UserSession instance2 = UserSession.getInstance("juan");
        System.out.println(instance2.getUser());
    }
}
