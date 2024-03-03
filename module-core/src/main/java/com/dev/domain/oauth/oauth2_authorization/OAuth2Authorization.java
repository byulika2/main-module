package com.dev.domain.oauth.oauth2_authorization;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import java.sql.Timestamp;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "oauth2_authorization")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class OAuth2Authorization {

  @Id
  private String id;

  @Column(name = "registered_client_id", nullable = false, length = 100)
  private String registeredClientId;

  @Column(name = "principal_name", nullable = false, length = 200)
  private String principalName;

  @Column(name = "authorization_grant_type", nullable = false, length = 100)
  private String authorizationGrantType;

  @Column(name = "authorized_scopes", length = 1000)
  private String authorizedScopes;

  @Lob
  @Column(name = "attributes")
  private String attributes;

  @Column(name = "state", length = 500)
  private String state;

  @Lob
  @Column(name = "authorization_code_value")
  private String authorizationCodeValue;

  @Column(name = "authorization_code_issued_at")
  private Timestamp authorizationCodeIssuedAt;

  @Column(name = "authorization_code_expires_at")
  private Timestamp authorizationCodeExpiresAt;

  @Lob
  @Column(name = "authorization_code_metadata")
  private String authorizationCodeMetadata;

  @Lob
  @Column(name = "access_token_value")
  private String accessTokenValue;

  @Column(name = "access_token_issued_at")
  private Timestamp accessTokenIssuedAt;

  @Column(name = "access_token_expires_at")
  private Timestamp accessTokenExpiresAt;

  @Lob
  @Column(name = "access_token_metadata")
  private String accessTokenMetadata;

  @Column(name = "access_token_type", length = 100)
  private String accessTokenType;

  @Column(name = "access_token_scopes", length = 1000)
  private String accessTokenScopes;

  @Lob
  @Column(name = "oidc_id_token_value")
  private String oidcIdTokenValue;

  @Column(name = "oidc_id_token_issued_at")
  private Timestamp oidcIdTokenIssuedAt;

  @Column(name = "oidc_id_token_expires_at")
  private Timestamp oidcIdTokenExpiresAt;

  @Lob
  @Column(name = "oidc_id_token_metadata")
  private String oidcIdTokenMetadata;

  @Lob
  @Column(name = "refresh_token_value")
  private String refreshTokenValue;

  @Column(name = "refresh_token_issued_at")
  private Timestamp refreshTokenIssuedAt;

  @Column(name = "refresh_token_expires_at")
  private Timestamp refreshTokenExpiresAt;

  @Lob
  @Column(name = "refresh_token_metadata")
  private String refreshTokenMetadata;

  @Lob
  @Column(name = "user_code_value")
  private String userCodeValue;

  @Column(name = "user_code_issued_at")
  private Timestamp userCodeIssuedAt;

  @Column(name = "user_code_expires_at")
  private Timestamp userCodeExpiresAt;

  @Lob
  @Column(name = "user_code_metadata")
  private String userCodeMetadata;

  @Lob
  @Column(name = "device_code_value")
  private String deviceCodeValue;

  @Column(name = "device_code_issued_at")
  private Timestamp deviceCodeIssuedAt;

  @Column(name = "device_code_expires_at")
  private Timestamp deviceCodeExpiresAt;

  @Lob
  @Column(name = "device_code_metadata")
  private String deviceCodeMetadata;

  @Builder
  public OAuth2Authorization(String id, String registeredClientId, String principalName,
      String authorizationGrantType, String authorizedScopes, String attributes, String state,
      String authorizationCodeValue, Timestamp authorizationCodeIssuedAt,
      Timestamp authorizationCodeExpiresAt, String authorizationCodeMetadata,
      String accessTokenValue,
      Timestamp accessTokenIssuedAt, Timestamp accessTokenExpiresAt, String accessTokenMetadata,
      String accessTokenType, String accessTokenScopes, String oidcIdTokenValue,
      Timestamp oidcIdTokenIssuedAt, Timestamp oidcIdTokenExpiresAt, String oidcIdTokenMetadata,
      String refreshTokenValue, Timestamp refreshTokenIssuedAt, Timestamp refreshTokenExpiresAt,
      String refreshTokenMetadata, String userCodeValue, Timestamp userCodeIssuedAt,
      Timestamp userCodeExpiresAt, String userCodeMetadata, String deviceCodeValue,
      Timestamp deviceCodeIssuedAt, Timestamp deviceCodeExpiresAt, String deviceCodeMetadata) {
    this.id = id;
    this.registeredClientId = registeredClientId;
    this.principalName = principalName;
    this.authorizationGrantType = authorizationGrantType;
    this.authorizedScopes = authorizedScopes;
    this.attributes = attributes;
    this.state = state;
    this.authorizationCodeValue = authorizationCodeValue;
    this.authorizationCodeIssuedAt = authorizationCodeIssuedAt;
    this.authorizationCodeExpiresAt = authorizationCodeExpiresAt;
    this.authorizationCodeMetadata = authorizationCodeMetadata;
    this.accessTokenValue = accessTokenValue;
    this.accessTokenIssuedAt = accessTokenIssuedAt;
    this.accessTokenExpiresAt = accessTokenExpiresAt;
    this.accessTokenMetadata = accessTokenMetadata;
    this.accessTokenType = accessTokenType;
    this.accessTokenScopes = accessTokenScopes;
    this.oidcIdTokenValue = oidcIdTokenValue;
    this.oidcIdTokenIssuedAt = oidcIdTokenIssuedAt;
    this.oidcIdTokenExpiresAt = oidcIdTokenExpiresAt;
    this.oidcIdTokenMetadata = oidcIdTokenMetadata;
    this.refreshTokenValue = refreshTokenValue;
    this.refreshTokenIssuedAt = refreshTokenIssuedAt;
    this.refreshTokenExpiresAt = refreshTokenExpiresAt;
    this.refreshTokenMetadata = refreshTokenMetadata;
    this.userCodeValue = userCodeValue;
    this.userCodeIssuedAt = userCodeIssuedAt;
    this.userCodeExpiresAt = userCodeExpiresAt;
    this.userCodeMetadata = userCodeMetadata;
    this.deviceCodeValue = deviceCodeValue;
    this.deviceCodeIssuedAt = deviceCodeIssuedAt;
    this.deviceCodeExpiresAt = deviceCodeExpiresAt;
    this.deviceCodeMetadata = deviceCodeMetadata;
  }
}
