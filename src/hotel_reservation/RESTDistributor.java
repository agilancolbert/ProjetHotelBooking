/*
 * Copyright (c) 2018, CGI.
 */
package hotel_reservation;

/**
 * @author agilan.colbert
 */
import org.restlet.Component;
import org.restlet.data.Protocol;

public class RESTDistributor {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(final String[] args) throws Exception {
        // TODO Auto-generated method stub
        // Create a new Restlet component and add a HTTP server connector to it
        final Component component = new Component();
        component.getServers().add(Protocol.HTTP, 8080);

        // Attach the application to the component and start it
        component.getDefaultHost().attach("/reservation/", new RouterApplication());
        component.start();
    }

}