package hotel.reservation;

import org.restlet.data.Form;
import org.restlet.representation.Representation;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

public class FilterRessource extends ServerResource{
	@Post
    public String sendRequest(final Representation entity) {
        final Form form = new Form(entity);
        final String date = form.getFirstValue("date");
        final String nbNight = form.getFirstValue("nbNight");
        final String nbRoom = form.getFirstValue("nbRoom");
        return "Information about hotel request : \n"
                + "date :" + date + "\n"
                + "nombre de nuit :" + nbNight + "\n"
                + "nombre de chambre :" + nbRoom + "\n";
    }

}
