/**
 * Praca inzynierska
 */
package com.github.strzemin.db.repository;

import org.springframework.data.repository.CrudRepository;

import com.github.strzemin.db.entity.Room;

/**
 * @author Maciej Strzeminski
 *
 * 2018
 */
//This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
//CRUD refers Create, Read, Update, Delete
public interface RoomRepository extends CrudRepository<Room, Long>  {

}

