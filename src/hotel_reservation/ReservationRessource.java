/*
 * Copyright (c) 2018, CGI.
 */
package hotel_reservation;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

/**
 * @author agilan.colbert
 */
public class ReservationRessource extends ServerResource {
    @Override
    @Get
    public String toString() {
        final String uid = (String) getRequestAttributes().get("uid");
        return "Information about hotel \"" + uid + "\" is: yet to come";
    }
}
