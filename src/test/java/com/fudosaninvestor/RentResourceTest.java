package com.fudosaninvestor;

import com.fudosaninvestor.fudosan.api.RentResource;
import javax.ws.rs.core.Application;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RentResourceTest extends JerseyTest {

    @Override
    protected Application configure() {
        return new ResourceConfig(RentResource.class);
    }

    /**
     * Test to see that the message "Got it!" is sent in the response.
     */
    @Test
    public void testGetIt() {
        final String responseMsg = target().path("rent").request().get(String.class);

        assertEquals("Hello, fudosan investor!", responseMsg);
    }
}
