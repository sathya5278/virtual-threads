package org.poc.controller;

import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/virtual")
public class VirtualThreadController {

    private static final Logger log = LoggerFactory.getLogger(VirtualThreadController.class);

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @RunOnVirtualThread
    public String virtualDemo() throws InterruptedException {
        log.info("This is running as a virtual thread");
        Thread.sleep(500);
        return "Hello from Quarkus REST - Virtual";
    }
}
