/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samaddico.springboot.ldap.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 *
 * @author addic
 */
@Configuration
public class LDAPSecurityConfig extends WebSecurityConfigurerAdapter {

    //@Value("${ldap.urls}")
    //private String ldapUrls;

    //@Value("${ldap.base.dn}")
    //private String ldapBaseDn;

    //@Value("${ldap.username}")
    //private String ldapSecurityPrincipal;

    //@Value("${ldap.password}")
    //private String ldapPrincipalPassword;

    //@Value("${ldap.user.dn.pattern}")
    //private String ldapUserDnPattern;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/login**").anonymous()
                .antMatchers("/resources/**").permitAll()
                .antMatchers("/users/**").permitAll()
                .antMatchers("/assets/**").permitAll()
                .antMatchers("/").authenticated()
                .antMatchers("/home").authenticated()
                .and()
                .httpBasic()
                //.formLogin()
                //.loginPage("/login")
                //.permitAll()
                //.and()
                //.logout()
                //.permitAll()
                .and()
                .csrf()
                .disable();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
            auth
                    .ldapAuthentication()
                    .contextSource()
                    //.url("ldap://localhost:389/" + "cn=employees,ou=users,dc=xl,dc=com")
                    .url("ldap://localhost:389/")// + "dc=xl,dc=com")
                    .and()
                    .userSearchBase("dc=xl,dc=com")
                    .userSearchFilter("objectClass={0}");
                    //.managerDn("pperez")
                    //.managerPassword("soporte")
                    //.and()
                    //.userDnPatterns("cn={0}");
                    //.userSearchBase("dc=xl,dc=com");
    }

}
