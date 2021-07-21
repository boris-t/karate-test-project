package org.borist.karatetests;

import com.intuit.karate.junit5.Karate;

class ExamplesRunner {

    @Karate.Test
    Karate testGet() {
        return Karate.run("classpath:GetTests.feature");
    }

    @Karate.Test
    Karate testPost() {
        return Karate.run("classpath:PostTests.feature");
    }
}

