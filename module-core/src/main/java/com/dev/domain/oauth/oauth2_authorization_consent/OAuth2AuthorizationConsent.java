package com.dev.domain.oauth.oauth2_authorization_consent;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "oauth2_authorization_consent", uniqueConstraints = {
    @UniqueConstraint(
        columnNames = {"registered_client_id", "principal_name"}
    )})
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class OAuth2AuthorizationConsent {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "registered_client_id", nullable = false)
  private String registeredClientId;

  @Column(name = "principal_name", nullable = false)
  private String principalName;

  @Column(name = "authorities", nullable = false)
  private String authorities;


  @Builder
  public OAuth2AuthorizationConsent(String registeredClientId, String principalName,
      String authorities) {
    this.registeredClientId = registeredClientId;
    this.principalName = principalName;
    this.authorities = authorities;
  }
}

