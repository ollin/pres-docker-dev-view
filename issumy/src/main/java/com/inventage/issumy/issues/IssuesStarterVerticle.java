package com.inventage.issumy.issues;

import org.vertx.java.core.Handler;
import org.vertx.java.core.eventbus.Message;
import org.vertx.java.core.http.HttpServerRequest;
import org.vertx.java.core.http.RouteMatcher;
import org.vertx.java.core.json.JsonArray;
import org.vertx.java.platform.Verticle;

/**
 * Inits all issue verticals.
 */
public class IssuesStarterVerticle extends Verticle {

    @Override
    public void start() {
        container.deployVerticle(IssuesVerticle.class.getName());
        container.deployVerticle(IssuesRestVerticle.class.getName());

        container.logger().info("IssuesStarterVerticle started");
    }
}
