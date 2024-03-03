package com.dev.domain.oauth.oauth2_registered_client.repository;

import com.dev.domain.oauth.oauth2_registered_client.OAuth2RegisteredClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OAuth2RegisteredClientRepository extends
    JpaRepository<OAuth2RegisteredClient, Long> {

}
