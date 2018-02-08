package io.restassured.matcher;

import io.restassured.http.Cookie;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.hamcrest.core.CombinableMatcher;

import java.util.Date;

import static org.hamcrest.Matchers.equalTo;

/**
 * Fluent Hamcrest matcher for assertions related to {@link Cookie} instances.
 * Can be instantiated via {@link RestAssuredMatchers} factory method.
 */
public class DetailedCookieMatcher extends CombinableMatcher<Cookie> {

    DetailedCookieMatcher() {
        this(Matchers.notNullValue());
    }

    private DetailedCookieMatcher(Matcher<? super Cookie> m) {
        super(m);
    }

    /**
     * Verifies whether value of cookie is equal to specified argument.
     * @param expectedValue expected value of cookie
     * @return A {@link DetailedCookieMatcher} instance with and-composed value property assertion
     */
    public DetailedCookieMatcher value(String expectedValue) {
        return value(equalTo(expectedValue));
    }

    /**
     * Verifies whether value of cookie satisfies specified matcher.
     * @param valueMatcher value assertion
     * @return A {@link DetailedCookieMatcher} instance with and-composed value property assertion
     */
    public DetailedCookieMatcher value(Matcher<? extends String> valueMatcher) {
        return new DetailedCookieMatcher(and(Matchers.<Cookie>hasProperty("value", valueMatcher)));
    }

    /**
     * Verifies whether comment of cookie is equal to specified argument.
     * @param expectedComment expected comment of cookie
     * @return A {@link DetailedCookieMatcher} instance with and-composed comment property assertion
     */
    public DetailedCookieMatcher comment(String expectedComment) {
        return comment(equalTo(expectedComment));
    }
    /**
     * Verifies whether comment of cookie satisfies specified matcher.
     * @param commentMatcher comment assertion
     * @return A {@link DetailedCookieMatcher} instance with and-composed comment property assertion
     */
    public DetailedCookieMatcher comment(Matcher<? extends String> commentMatcher) {
        return new DetailedCookieMatcher(and(Matchers.<Cookie>hasProperty("comment", commentMatcher)));
    }

    /**
     * Verifies whether expiry date of cookie is equal to specified argument.
     * @param expectedExpiryDate expected expiry date of cookie
     * @return A {@link DetailedCookieMatcher} instance with and-composed expiry date property assertion
     */
    public DetailedCookieMatcher expiryDate(Date expectedExpiryDate) {
        return expiryDate(equalTo(expectedExpiryDate));
    }

    /**
     * Verifies whether expiry date of cookie satisfies specified matcher.
     * @param expiryDateMatcher expiry date assertion
     * @return A {@link DetailedCookieMatcher} instance with and-composed expiry date property assertion
     */
    public DetailedCookieMatcher expiryDate(Matcher<? extends Date> expiryDateMatcher) {
        return new DetailedCookieMatcher(and(Matchers.<Cookie>hasProperty("expiryDate", expiryDateMatcher)));
    }

    /**
     * Verifies whether domain of cookie is equal to specified argument.
     * @param expectedDomain expected domain of cookie
     * @return A {@link DetailedCookieMatcher} instance with and-composed domain property assertion
     */
    public DetailedCookieMatcher domain(String expectedDomain) {
        return domain(equalTo(expectedDomain));
    }

    /**
     * Verifies whether domain of cookie satisfies specified matcher.
     * @param domainMatcher assertion for domain property
     * @return A {@link DetailedCookieMatcher} instance with and-composed domain property assertion
     */
    public DetailedCookieMatcher domain(Matcher<? extends String> domainMatcher) {
        return new DetailedCookieMatcher(and(Matchers.<Cookie>hasProperty("domain", domainMatcher)));
    }
    
    /**
     * Verifies whether path of cookie is equal to specified argument.
     * @param expectedPath expected path of cookie
     * @return A {@link DetailedCookieMatcher} instance with and-composed path property assertion
     */
    public DetailedCookieMatcher path(String expectedPath) {
        return path(equalTo(expectedPath));
    }

    /**
     * Verifies whether path of cookie satisfies specified matcher.
     * @param pathMatcher assertion for path property
     * @return A {@link DetailedCookieMatcher} instance with and-composed path property assertion
     */
    public DetailedCookieMatcher path(Matcher<? extends String> pathMatcher) {
        return new DetailedCookieMatcher(and(Matchers.<Cookie>hasProperty("path", pathMatcher)));
    }

    /**
     * Verifies whether secured property of cookie is equal to specified argument.
     * @param expectedSecuredValue expected value of secured property
     * @return A {@link DetailedCookieMatcher} instance with and-composed secured property assertion
     */
    public DetailedCookieMatcher secured(boolean expectedSecuredValue) {
        return secured(equalTo(expectedSecuredValue));
    }

    /**
     * Verifies whether secured property of cookie satisfies specified matcher.
     * @param securedMatcher assertion for secured property
     * @return A {@link DetailedCookieMatcher} instance with and-composed secured property assertion
     */
    public DetailedCookieMatcher secured(Matcher<? extends Boolean> securedMatcher) {
        return new DetailedCookieMatcher(and(Matchers.<Cookie>hasProperty("secured", securedMatcher)));
    }

    /**
     * Verifies whether http-only property of cookie is equal to specified argument.
     * @param expectedHttpOnlyValue expected http-only property value
     * @return A {@link DetailedCookieMatcher} instance with and-composed http-only property assertion
     */
    public DetailedCookieMatcher httpOnly(boolean expectedHttpOnlyValue) {
        return httpOnly(equalTo(expectedHttpOnlyValue));
    }

    /**
     * Verifies whether http-only property of cookie satisfies specified matcher.
     * @param httpOnlyMatcher assertion for domain property
     * @return A {@link DetailedCookieMatcher} instance with and-composed http-only property assertion
     */
    public DetailedCookieMatcher httpOnly(Matcher<? extends Boolean> httpOnlyMatcher) {
        return new DetailedCookieMatcher(and(Matchers.<Cookie>hasProperty("httpOnly", httpOnlyMatcher)));
    }

    /**
     * Verifies whether version of cookie is equal to specified argument.
     * @param expectedVersionValue expected version of cookie
     * @return A {@link DetailedCookieMatcher} instance with and-composed version property assertion
     */
    public DetailedCookieMatcher version(int expectedVersionValue) {
        return version(equalTo(expectedVersionValue));
    }

    /**
     * Verifies whether version of cookie satisfies specified matcher.
     * @param versionMatcher assertion for version property
     * @return A {@link DetailedCookieMatcher} instance with and-composed version property assertion
     */
    public DetailedCookieMatcher version(Matcher<? extends Integer> versionMatcher) {
        return new DetailedCookieMatcher(and(Matchers.<Cookie>hasProperty("version", versionMatcher)));
    }

    /**
     * Verifies whether max age of cookie is equal to specified argument.
     * @param expectedMaxAgeValue expected max age of cookie
     * @return A {@link DetailedCookieMatcher} instance with and-composed max age property assertion
     */
    public DetailedCookieMatcher maxAge(int expectedMaxAgeValue) {
        return maxAge(equalTo(expectedMaxAgeValue));
    }

    /**
     * Verifies whether max age of cookie satisfies specified matcher.
     * @param maxAgeMatcher assertion for max age property
     * @return A {@link DetailedCookieMatcher} instance with and-composed max age property assertion
     */
    public DetailedCookieMatcher maxAge(Matcher<? extends Integer> maxAgeMatcher) {
        return new DetailedCookieMatcher(and(Matchers.<Cookie>hasProperty("maxAge", maxAgeMatcher)));
    }
}