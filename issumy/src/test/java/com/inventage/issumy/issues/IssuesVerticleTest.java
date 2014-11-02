package com.inventage.issumy.issues;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

/**
 * unit test.
 */
public class IssuesVerticleTest {
    @Test
    public void defaultConstructor() throws Exception {
        assertThat(new IssuesVerticle(), notNullValue());
    }
}