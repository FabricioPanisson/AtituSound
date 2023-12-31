package br.edu.atitus.poo.atitus.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.atitus.poo.atitus.dtos.ArtistDTO;
import br.edu.atitus.poo.atitus.entities.ArtistEntity;
import br.edu.atitus.poo.atitus.services.ArtistService;
import br.edu.atitus.poo.atitus.services.GenericService;

@RestController
@RequestMapping("/artists")
public class ArtistController extends GenericController<ArtistEntity, ArtistDTO> {
	
	private final ArtistService service;
	public ArtistController(ArtistService service) {
		super();
		this.service = service;
	}

	protected ArtistEntity convertDTO2Entity(ArtistDTO dto) {
		ArtistEntity entity = new ArtistEntity();
		entity.setName(dto.getName());
		entity.setImage(dto.getImage());
		return entity;
	}

	@Override
	protected GenericService<ArtistEntity> getService() {
		return service;
	}
	
	
	
	
}