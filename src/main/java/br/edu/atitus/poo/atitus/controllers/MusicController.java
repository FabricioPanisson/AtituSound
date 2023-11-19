package br.edu.atitus.poo.atitus.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.atitus.poo.atitus.dtos.MusicDTO;
import br.edu.atitus.poo.atitus.entities.ArtistEntity;
import br.edu.atitus.poo.atitus.entities.MusicEntity;
import br.edu.atitus.poo.atitus.services.GenericService;
import br.edu.atitus.poo.atitus.services.MusicService;

@RestController
@RequestMapping("/musics")
public class MusicController extends GenericController<MusicEntity, MusicDTO> {

	private final MusicService service;
	
	public MusicController(MusicService service) {
		super();
		this.service = service;
	}

	@Override
	protected GenericService<MusicEntity> getService() {
		return service;
	}

	@Override
	protected MusicEntity convertDTO2Entity(MusicDTO dto) {
		MusicEntity entidade = new MusicEntity();
		entidade.setName(dto.getName());
		entidade.setDuration(dto.getDuration());
		entidade.setUrl(dto.getUrl());
		
		ArtistEntity entidadeArtista = new ArtistEntity();
		entidadeArtista.setUuid(dto.getArtist().getUuid());
		entidade.setArtist(entidadeArtista);
		
		return entidade;
	}

}
