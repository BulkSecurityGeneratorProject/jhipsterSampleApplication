package com.github.xkenmon.jhipster_test.repository;

import com.github.xkenmon.jhipster_test.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
