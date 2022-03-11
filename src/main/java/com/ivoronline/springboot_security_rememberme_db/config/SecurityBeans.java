package com.ivoronline.springboot_security_rememberme_db.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
import javax.sql.DataSource;

@Configuration
public class SecurityBeans {

  //=================================================================
  // PERSISTENT TOKEN REPOSITORY
  //=================================================================
  @Bean
  public PersistentTokenRepository persistentTokenRepository(DataSource dataSource) {
    JdbcTokenRepositoryImpl tokenRepository = new JdbcTokenRepositoryImpl();
                            tokenRepository.setDataSource(dataSource);
    return tokenRepository;

  }

}



