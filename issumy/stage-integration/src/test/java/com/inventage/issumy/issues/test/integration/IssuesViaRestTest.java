package com.inventage.issumy.issues.test.integration;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;
import org.vertx.java.core.http.HttpClient;
import org.vertx.testtools.TestVerticle;
import org.vertx.testtools.VertxAssert;

/**
 * integration test.
 */
public class IssuesViaRestTest extends TestVerticle {

    private final String EMPTY_JSON_ARRAY = "[]";

    @Test
    public void shouldReturnEmptyListOfIssues() throws Exception {
        // when
        HttpClient client = vertx.createHttpClient()
            .setHost("localhost")
            .setPort(8071);

        client.getNow("/issues", event -> event.bodyHandler(bodyEvent -> {
            String result = bodyEvent.toString();
            VertxAssert.assertThat(result, is(EMPTY_JSON_ARRAY));
            VertxAssert.testComplete();
        }));
    }

    @Override
    public void start() {
        initialize();
        startTests();
    }
}
