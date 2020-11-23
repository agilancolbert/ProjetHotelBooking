/*
 * Copyright (c) 2018, CGI.
 */
package hotel.reservation;

import org.restlet.data.Form;
import org.restlet.representation.Representation;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

/**
 * @author agilan.colbert
 */
public class ReservationRessource extends ServerResource {
    /*
     * @Override
     * @Get public String toString() { // final String uid = (String) getRequestAttributes().get("uid"); final String uid = "nothing"; return
     * "Information about hotel \"" + uid + "\" is: yet to come"; }
     */

    @Post
    public String sendRequest(final Representation entity) {
        /*
    	final Form form = new Form(entity);
        final String date = form.getFirstValue("date");
        final String nbNight = form.getFirstValue("nbNight");
        final String nbRoom = form.getFirstValue("nbRoom");
        return "Information about hotel request : \n"
                + "date :" + date + "\n"
                + "nombre de nuit :" + nbNight + "\n"
                + "nombre de chambre :" + nbRoom + "\n";
    	*/
    	return "Call to reserve received.";
    }
}
