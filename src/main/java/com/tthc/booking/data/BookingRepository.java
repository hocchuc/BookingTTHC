package com.tthc.booking.data;

import com.tthc.booking.model.Booking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "booking", path = "booking")
@CrossOrigin("https://tthc.vercel.app/")
public interface BookingRepository extends PagingAndSortingRepository<Booking, Long> {

    List<Booking> findByFullName(@Param("fullName") String fullName);

    Booking findById(long id);

    List<Booking> findByIdentityCard(@Param("identityCard") String identityCard);

    @Override
    <S extends Booking> S save(S entity);
}
