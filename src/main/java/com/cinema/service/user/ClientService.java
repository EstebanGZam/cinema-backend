package com.cinema.service.user;

import com.cinema.dto.user.ClientDTO;
import com.cinema.mapper.user.ClientMapper;
import com.cinema.repository.user.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

	private final ClientRepository clientRepository;
	private final ClientMapper clientMapper;

	@Autowired
	public ClientService(ClientRepository clientRepository, ClientMapper clientMapper) {
		this.clientRepository = clientRepository;
		this.clientMapper = clientMapper;
	}

	public ClientDTO getClientById(Long id) {
		return clientRepository.findById(id)
				.map(clientMapper::clientToClientDTO)
				.orElse(null);
	}
}
