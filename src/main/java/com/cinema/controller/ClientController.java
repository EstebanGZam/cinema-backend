package com.cinema.controller;

import com.cinema.dto.user.ClientDTO;
import com.cinema.exception.ClientAlreadyExistsException;
import com.cinema.service.user.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
public class ClientController {

	private final ClientService clientService;

	@Autowired
	public ClientController(ClientService clientService) {
		this.clientService = clientService;
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getClientById(@PathVariable Long id) {
		ClientDTO clientDTO = clientService.getClientById(id);
		return (clientDTO != null) ?
				ResponseEntity.ok(clientDTO) :
				ResponseEntity.status(HttpStatus.NOT_FOUND).body("Client not found");
	}

	@PostMapping
	public ResponseEntity<?> saveClient(@RequestBody ClientDTO clientDTO) {
		try {
			ClientDTO savedClientDTO = clientService.saveClient(clientDTO);
			return ResponseEntity.status(HttpStatus.CREATED).body(savedClientDTO);
		} catch (ClientAlreadyExistsException e) {
			return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
		}
	}
}
