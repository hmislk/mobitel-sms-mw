package org.carecode.sms.mobitel.controllers;

import java.util.Set;
import jakarta.ws.rs.core.Application;

/**
 *
 * @author Dr M H B Ariyaratne <buddhika.ari@gmail.com>
 */
@jakarta.ws.rs.ApplicationPath("ws")
public class ApplicationConfig extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(org.carecode.sms.mobitel.controllers.SmsResource.class);
    }
}
