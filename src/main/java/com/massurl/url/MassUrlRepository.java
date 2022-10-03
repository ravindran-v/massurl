package com.massurl.url;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface MassUrlRepository extends CrudRepository<MassUrl, String> {

	Optional<MassUrl> findByMassUrlId(long massUrlID);

}
