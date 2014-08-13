package org.openmhealth.shim;


import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Abstraction for handling access parameters
 */
public class AccessParameters {

    @Id
    private String id;

    private String username;

    private String shimKey;

    private String clientId;

    private String clientSecret;

    private String accessToken;

    private String tokenSecret;

    private String stateKey;

    private DateTime dateCreated = new DateTime();

    private byte[] serializedToken; //Required only by spring oauth2

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShimKey() {
        return shimKey;
    }

    public void setShimKey(String shimKey) {
        this.shimKey = shimKey;
    }

    public DateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(DateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getStateKey() {
        return stateKey;
    }

    public void setStateKey(String stateKey) {
        this.stateKey = stateKey;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private Map<String, Object> additionalParameters = new LinkedHashMap<String, Object>();

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenSecret() {
        return tokenSecret;
    }

    public void setTokenSecret(String tokenSecret) {
        this.tokenSecret = tokenSecret;
    }

    public Map<String, Object> getAdditionalParameters() {
        return additionalParameters;
    }

    public void setAdditionalParameters(Map<String, Object> additionalParameters) {
        this.additionalParameters = additionalParameters;
    }

    public byte[] getSerializedToken() {
        return serializedToken;
    }

    public void setSerializedToken(byte[] serializedToken) {
        this.serializedToken = serializedToken;
    }
}