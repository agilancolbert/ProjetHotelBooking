/*
 * Copyright (c) 2018, CGI.
 */
package hotel_reservation;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

/**
 * @author agilan.colbert
 */
public class RouterApplication extends Application {
    /**
     * Creates a root Restlet that will receive all incoming calls.
     */
    @Override
    public synchronized Restlet createInboundRoot() {
        // Create a router Restlet that routes each call to a new respective instance of resource.
        final Router router = new Router(getContext());
        // Defines only two routes
        router.attach("/reservation", ReservationRessource.class);
        // router.attach("/reservation/{uid}", ReservationRessource.class);
        return router;
    }

}
