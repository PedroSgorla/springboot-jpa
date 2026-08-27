package com.personal.learning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personal.learning.entities.User;
/**
 * Repositório de acesso a dados da entidade {@link User}
 * <p>
 * Ao estender {@link JpaResository} essa interface herda os métodos da interface pai, mas é necessário passar o Generic<Class, ID>.
 * O Spring Data JPA gera a implementação em tempo de execução.
 */
public interface UserRepository extends JpaRepository<User, Long>{
	
}
