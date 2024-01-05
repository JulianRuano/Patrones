package com.proxy;

/**
 *
 * @author julian
 */
public class Proxy implements ISubject {
    private Subject realSubject;
    private String userRole;

    public Proxy(Subject realSubject, String userRole) {
        this.realSubject = realSubject;
        this.userRole = userRole;
    }

    @Override
    public void request() {
        if (checkAccess()) {
            realSubject.request();
        } else {
            System.out.println("Proxy: Access denied.");
        }
    }

    private boolean checkAccess() {
        // Verificar permisos basados en el rol del usuario
        return "admin".equals(userRole);
    }
  
}
