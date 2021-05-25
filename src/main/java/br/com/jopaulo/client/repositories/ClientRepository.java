package br.com.jopaulo.client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jopaulo.client.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
