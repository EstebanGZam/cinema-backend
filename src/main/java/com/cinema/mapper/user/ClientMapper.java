package com.cinema.mapper.user;

import com.cinema.dto.user.ClientDTO;
import com.cinema.model.user.Client; // Asegúrate de tener la entidad Client
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientMapper {

	ClientDTO clientToClientDTO(Client client);

	// Client clientDTOToClient(ClientDTO clientDTO);
}
