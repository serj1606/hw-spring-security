package org.hillel.hwspringsecurity.service;

import lombok.RequiredArgsConstructor;
import org.hillel.hwspringsecurity.repository.UserRepository;
import org.hillel.hwspringsecurity.security.SecurityUser;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

  private final UserRepository userRepository;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    var user = userRepository.findUsersByUsername(username);

    return user.map(SecurityUser::new)
        .orElseThrow(() -> new UsernameNotFoundException("Username not found" + username));
  }
}
