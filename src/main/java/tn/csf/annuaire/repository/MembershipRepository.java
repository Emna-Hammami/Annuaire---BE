package tn.csf.annuaire.repository;

import org.springframework.data.repository.CrudRepository;
//repository that extends CrudRepository  

import tn.csf.annuaire.models.Membership;

public interface MembershipRepository extends CrudRepository<Membership, Integer>{

}
