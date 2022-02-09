package com.knoldus.locationwebproject.repos;

import com.knoldus.locationwebproject.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location,Integer> {

}
