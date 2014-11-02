package com.inventage.issumy.issues;

import org.vertx.java.core.json.JsonArray;
import org.vertx.java.platform.Verticle;

/**
 * verticle handles issues.
 */
public class IssuesVerticle extends Verticle {

    @Override
    public void start() {
        vertx.eventBus().registerHandler("com.inventage.issumy.issues", event -> {
            event.reply(new JsonArray());
        });

        container.logger().info("IssuesVerticle started");
    }
}
