package tn.csf.annuaire.repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import tn.csf.annuaire.models.*;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByUsername(String username);

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);

	@Query
	List<User> findBySpeciality(@Param("idspeciality") int idspeciality);

	@Query
	List<User> findBySpecialityAndEmail(@Param("idspeciality") int idspeciality, @Param("email") String email);
}

