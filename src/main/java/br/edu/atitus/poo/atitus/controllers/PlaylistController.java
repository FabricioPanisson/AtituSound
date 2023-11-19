package br.edu.atitus.poo.atitus.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.atitus.poo.atitus.dtos.PlaylistDTO;
import br.edu.atitus.poo.atitus.entities.PlaylistEntity;
import br.edu.atitus.poo.atitus.services.GenericService;
import br.edu.atitus.poo.atitus.services.PlaylistService;

@RestController
@RequestMapping("playlists")
public class PlaylistController extends GenericController<PlaylistEntity, PlaylistDTO>{

	private final PlaylistService service;
	public PlaylistController(PlaylistService service) {
		super();
		this.service = service;
	}

	@Override
	protected GenericService<PlaylistEntity> getService() {
		return service;
	}

	@Override
	protected PlaylistEntity convertDTO2Entity(PlaylistDTO dto) {
		PlaylistEntity playlist = new PlaylistEntity();
		playlist.setName(dto.getName());
		playlist.setPublic_share(dto.getPublic_share());
		return playlist;
	}

}