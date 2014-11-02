package com.inventage.issumy.issues;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * unit test.
 */
public class IssuesStarterVerticleTest {
    @Test
    public void defaultConstructor() throws Exception {
        assertThat(new IssuesStarterVerticle(), notNullValue());
    }
}