/**
 * Praca inzynierska
 */
package com.github.strzemin.db.repository;

import org.springframework.data.repository.CrudRepository;

import com.github.strzemin.db.entity.Parking;

/**
 * @author Maciej Strzeminski
 *
 * 2018
 */
public interface ParkingRepository extends CrudRepository<Parking, Long> {

}
