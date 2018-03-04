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
import com.github.strzemin.db.entity.Room;
import com.github.strzemin.db.repository.RoomRepository;

/**
 * @author Maciej Strzeminski
 *
 * 2018
 */
@Controller
@RequestMapping(Constants.ROOMS)
public class RoomController {

	@Autowired 
	private RoomRepository roomRepository;
	
	//http://localhost:8080/rooms/find?id=2
	@GetMapping(path=Constants.FIND_ROOMS)
	public @ResponseBody Room findRoom (@RequestParam Long id) {
		return roomRepository.findOne(id);
	}
	
	@GetMapping(path=Constants.GET_ALL_ROOMS)
	public @ResponseBody Iterable<Room> getAllRooms() {
		return roomRepository.findAll();
	}
}
