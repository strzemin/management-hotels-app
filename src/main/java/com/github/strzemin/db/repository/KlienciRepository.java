/**
 * Praca inzynierska
 */
package com.github.strzemin.db.repository;

import org.springframework.data.repository.CrudRepository;

import com.github.strzemin.db.entity.Klienci;

/**
 * @author Maciej Strzeminski
 *
 * 2018
 */
public interface KlienciRepository extends CrudRepository<Klienci, Long> {

}
