/**
 * Praca inzynierska
 */
package com.github.strzemin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.strzemin.constants.Constants;
import com.github.strzemin.db.entity.Parking;
import com.github.strzemin.db.repository.ParkingRepository;

/**
 * @author Maciej Strzeminski
 *
 *         2018
 */

@Controller
@RequestMapping(Constants.PARKING)
public class ParkingController {

	@Autowired
	private ParkingRepository parkingRepository;

	// http://localhost:8080/rooms/find?id=2
	@GetMapping(path = Constants.FIND_PARKING)
	public @ResponseBody Parking findParking(@RequestParam Long id) {
		return parkingRepository.findOne(id);
	}

	@GetMapping(path = Constants.GET_ALL_PARKING)
	public @ResponseBody Iterable<Parking> getAllParking() {
		try {
			return parkingRepository.findAll();
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

}
