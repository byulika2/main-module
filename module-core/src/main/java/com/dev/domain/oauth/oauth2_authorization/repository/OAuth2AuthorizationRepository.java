package com.dev.domain.oauth.oauth2_authorization.repository;

import com.dev.domain.oauth.oauth2_authorization.OAuth2Authorization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OAuth2AuthorizationRepository extends JpaRepository<OAuth2Authorization, Long> {

}
