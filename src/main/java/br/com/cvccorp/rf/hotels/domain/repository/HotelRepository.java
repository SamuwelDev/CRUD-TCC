package br.com.cvccorp.rf.hotels.domain.repository;


import br.com.cvccorp.rf.hotels.domain.entities.Hotel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends CrudRepository<Hotel, Long> {
}

