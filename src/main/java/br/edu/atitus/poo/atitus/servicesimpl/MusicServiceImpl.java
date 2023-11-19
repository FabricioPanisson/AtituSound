package br.edu.atitus.poo.atitus.servicesimpl;

import org.springframework.stereotype.Service;

import br.edu.atitus.poo.atitus.entities.MusicEntity;
import br.edu.atitus.poo.atitus.repositories.GenericRepository;
import br.edu.atitus.poo.atitus.repositories.MusicRepository;
import br.edu.atitus.poo.atitus.services.MusicService;

@Service
public class MusicServiceImpl implements MusicService{

	private final MusicRepository repository;
	
	public MusicServiceImpl(MusicRepository repository) {
		super();
		this.repository = repository;
	}
	
	@Override
	public GenericRepository<MusicEntity> getRepository() {
		return repository;
	}

}
