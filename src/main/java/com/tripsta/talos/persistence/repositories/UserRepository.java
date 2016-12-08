package com.tripsta.talos.persistence.repositories;

import com.tripsta.talos.persistence.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

    UserEntity findById(Long id);
    UserEntity findByEmail(String email);

}

