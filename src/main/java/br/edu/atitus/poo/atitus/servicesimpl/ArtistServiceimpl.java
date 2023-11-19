package br.edu.atitus.poo.atitus.servicesimpl;

import org.springframework.stereotype.Service;

import br.edu.atitus.poo.atitus.entities.ArtistEntity;
import br.edu.atitus.poo.atitus.repositories.ArtistRepository;
import br.edu.atitus.poo.atitus.repositories.GenericRepository;
import br.edu.atitus.poo.atitus.services.ArtistService;


@Service
public class ArtistServiceimpl implements ArtistService{
	
	private final ArtistRepository repository;
	public ArtistServiceimpl(ArtistRepository repository) {
		super();
		this.repository = repository;
	}
	@Override
	public GenericRepository<ArtistEntity> getRepository() {
		return repository;
	}

	
		
	}


