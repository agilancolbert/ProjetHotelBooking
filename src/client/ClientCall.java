package client;

 

import java.io.IOException;

 

import org.restlet.data.Form;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

 

public class ClientCall {

 

    /**
     * @param args
     */
    public static void main(final String[] args) {
        // TODO Auto-generated method stub

 

        // Create the client resource
        final ClientResource resource = new ClientResource("http://localhost:8182/reservation");

        final Form form = new Form();
        form.add("date", "16/11/2020");
        form.add("nbRoom", "4");
        form.add("nbNight", "2");

        // Write the response entity on the console
        try {
            resource.post(form).write(System.out);

        } catch (final ResourceException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (final IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

 

}