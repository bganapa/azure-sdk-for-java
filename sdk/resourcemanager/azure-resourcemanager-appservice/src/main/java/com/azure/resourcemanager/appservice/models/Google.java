// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.fluent.models.GoogleProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The configuration settings of the Google provider. */
@Fluent
public final class Google extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Google.class);

    /*
     * Google resource specific properties
     */
    @JsonProperty(value = "properties")
    private GoogleProperties innerProperties;

    /**
     * Get the innerProperties property: Google resource specific properties.
     *
     * @return the innerProperties value.
     */
    private GoogleProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public Google withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the enabled property: &lt;code&gt;false&lt;/code&gt; if the Google provider should not be enabled despite the
     * set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.innerProperties() == null ? null : this.innerProperties().enabled();
    }

    /**
     * Set the enabled property: &lt;code&gt;false&lt;/code&gt; if the Google provider should not be enabled despite the
     * set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
     *
     * @param enabled the enabled value to set.
     * @return the Google object itself.
     */
    public Google withEnabled(Boolean enabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GoogleProperties();
        }
        this.innerProperties().withEnabled(enabled);
        return this;
    }

    /**
     * Get the registration property: The configuration settings of the app registration for the Google provider.
     *
     * @return the registration value.
     */
    public ClientRegistration registration() {
        return this.innerProperties() == null ? null : this.innerProperties().registration();
    }

    /**
     * Set the registration property: The configuration settings of the app registration for the Google provider.
     *
     * @param registration the registration value to set.
     * @return the Google object itself.
     */
    public Google withRegistration(ClientRegistration registration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GoogleProperties();
        }
        this.innerProperties().withRegistration(registration);
        return this;
    }

    /**
     * Get the login property: The configuration settings of the login flow.
     *
     * @return the login value.
     */
    public LoginScopes login() {
        return this.innerProperties() == null ? null : this.innerProperties().login();
    }

    /**
     * Set the login property: The configuration settings of the login flow.
     *
     * @param login the login value to set.
     * @return the Google object itself.
     */
    public Google withLogin(LoginScopes login) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GoogleProperties();
        }
        this.innerProperties().withLogin(login);
        return this;
    }

    /**
     * Get the validation property: The configuration settings of the Azure Active Directory token validation flow.
     *
     * @return the validation value.
     */
    public AllowedAudiencesValidation validation() {
        return this.innerProperties() == null ? null : this.innerProperties().validation();
    }

    /**
     * Set the validation property: The configuration settings of the Azure Active Directory token validation flow.
     *
     * @param validation the validation value to set.
     * @return the Google object itself.
     */
    public Google withValidation(AllowedAudiencesValidation validation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GoogleProperties();
        }
        this.innerProperties().withValidation(validation);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
