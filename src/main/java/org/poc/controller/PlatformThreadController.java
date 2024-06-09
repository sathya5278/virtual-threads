package org.poc.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/platform")
public class PlatformThreadController {

    private static final Logger log = LoggerFactory.getLogger(PlatformThreadController.class);

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String platformDemo() throws InterruptedException {
        log.info("This is running as a platform thread");
        Thread.sleep(500);
        return "Hello from Quarkus REST - Platform";
    }
}
