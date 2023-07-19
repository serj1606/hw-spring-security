package org.hillel.hwspringsecurity.security;

import lombok.AllArgsConstructor;
import org.hillel.hwspringsecurity.model.Role;
import org.springframework.security.core.GrantedAuthority;

@AllArgsConstructor
public class SecurityRole implements GrantedAuthority {
  private final Role role;
  @Override
  public String getAuthority() {
    return role.getName();
  }
}
