package com.samaddico.springboot.ldap.repository;

import com.samaddico.springboot.ldap.model.UserModel;
import org.springframework.data.ldap.repository.LdapRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApacheDSRepository extends LdapRepository<UserModel> {

}
