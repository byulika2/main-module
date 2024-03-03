package com.dev.domain.oauth.oauth2_authorization_consent.repository;

import com.dev.domain.oauth.oauth2_authorization_consent.OAuth2AuthorizationConsent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OAuth2AuthorizationConsentRepository extends
    JpaRepository<OAuth2AuthorizationConsent, Long> {

}
