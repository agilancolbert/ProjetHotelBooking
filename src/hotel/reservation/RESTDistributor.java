package hotel.reservation;

import org.restlet.Component;
import org.restlet.data.Protocol;

public class RESTDistributor {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(final String[] args) throws Exception {

        final Component component = new Component();
        component.getServers().add(Protocol.HTTP, 8182);
        //component.getDefaultHost().attach("/reservation/", new RouterApplication());
        component.getDefaultHost().attach(new RouterApplication());
        component.start();
    }

}