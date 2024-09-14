package com.cinema.service.user;

import com.cinema.dto.user.ClientDTO;
import com.cinema.exception.ClientAlreadyExistsException;
import com.cinema.mapper.user.ClientMapper;
import com.cinema.model.user.Client;
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

	public ClientDTO saveClient(ClientDTO clientDTO) {
		// Verificar si el cliente ya existe por el número de identificación
		Client existingClient = clientRepository.findByIdNumber(clientDTO.getIdNumber());
		if (existingClient != null)
			// Lanzar una excepción si el cliente ya existe
			throw new ClientAlreadyExistsException("Client with id number " + clientDTO.getIdNumber() + " already exists.");

		// Convertir el DTO a entidad y guardar el nuevo cliente
		Client client = clientMapper.clientDTOToClient(clientDTO);
		Client savedClient = clientRepository.save(client);
		return clientMapper.clientToClientDTO(savedClient);
	}
}
