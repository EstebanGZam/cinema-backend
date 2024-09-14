package com.cinema.repository.user;

import com.cinema.model.user.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
	// Encontrar un cliente por su número de identificación
	Client findByIdNumber(String idNumber);
}
