package br.edu.atitus.poo.atitus.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import br.edu.atitus.poo.atitus.entities.PlaylistEntity;
import br.edu.atitus.poo.atitus.entities.UserEntity;

@Repository
public interface PlaylistRepository extends GenericRepository<PlaylistEntity>{

	Page<List<PlaylistEntity>>  findByNameContainingIgnoreCaseAndUserOrPublicshare(String name, UserEntity user,boolean publicShare,Pageable pageable);
}
