package br.edu.atitus.poo.atitus.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import br.edu.atitus.poo.atitus.entities.UserEntity;

public interface UserService extends GenericService<UserEntity>, UserDetailsService{

}
