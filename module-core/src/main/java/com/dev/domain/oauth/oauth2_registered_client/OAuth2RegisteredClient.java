package com.dev.domain.oauth.oauth2_registered_client;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Timestamp;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "oauth2_registered_client")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class OAuth2RegisteredClient {

  @Id
  @Column(length = 100)
  private String id;

  @Column(length = 100, nullable = false)
  private String clientId;

  @Column(nullable = false)
  private Timestamp clientIdIssuedAt = Timestamp.valueOf(java.time.LocalDateTime.now());

  @Column(length = 200)
  private String clientSecret;

  @Column
  private Timestamp clientSecretExpiresAt;

  @Column(length = 200, nullable = false)
  private String clientName;

  @Column(length = 1000, nullable = false)
  private String clientAuthenticationMethods;

  @Column(length = 1000, nullable = false)
  private String authorizationGrantTypes;

  @Column(length = 1000)
  private String redirectUris;

  @Column(length = 1000)
  private String postLogoutRedirectUris;

  @Column(length = 1000, nullable = false)
  private String scopes;

  @Column(length = 2000, nullable = false)
  private String clientSettings;

  @Column(length = 2000, nullable = false)
  private String tokenSettings;

  @Builder
  public OAuth2RegisteredClient(String id, String clientId, Timestamp clientIdIssuedAt,
      String clientSecret, Timestamp clientSecretExpiresAt, String clientName,
      String clientAuthenticationMethods, String authorizationGrantTypes, String redirectUris,
      String postLogoutRedirectUris, String scopes, String clientSettings, String tokenSettings) {
    this.id = id;
    this.clientId = clientId;
    this.clientIdIssuedAt = clientIdIssuedAt;
    this.clientSecret = clientSecret;
    this.clientSecretExpiresAt = clientSecretExpiresAt;
    this.clientName = clientName;
    this.clientAuthenticationMethods = clientAuthenticationMethods;
    this.authorizationGrantTypes = authorizationGrantTypes;
    this.redirectUris = redirectUris;
    this.postLogoutRedirectUris = postLogoutRedirectUris;
    this.scopes = scopes;
    this.clientSettings = clientSettings;
    this.tokenSettings = tokenSettings;
  }
}
