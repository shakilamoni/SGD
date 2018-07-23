package com.zcw.passionproject.sgd.com.zcw.passionproject.sgd.repository;

import com.zcw.passionproject.sgd.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = false)
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    void deleteByEmail(String email);
    Boolean existsByEmail(String email);
}
