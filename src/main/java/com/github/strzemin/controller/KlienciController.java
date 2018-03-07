package com.github.strzemin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.strzemin.constants.Constants;
import com.github.strzemin.db.entity.Klienci;
import com.github.strzemin.db.repository.KlienciRepository;

/**
 * Praca inzynierska
 */


/**
 * @author Maciej Strzeminski
 *
 * 2018
 */

@Controller
@RequestMapping(Constants.KLIENCI)
public class KlienciController {

	
	@Autowired
	private KlienciRepository klienciRepository;
	private CrudRepository<Klienci, Long> kienciRepository;

	// http://localhost:8080/rooms/find?id=2
	@GetMapping(path = Constants.FIND_KLIENCI)
	public @ResponseBody  Klienci findKlienci(@RequestParam Long id) {
		kienciRepository = null;
		return kienciRepository.findOne(id);
	}

	@GetMapping(path = Constants.GET_ALL_KLIENCI)
	public @ResponseBody Iterable<Klienci> getAllKlienci() {
		try {
			return klienciRepository.findAll();
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

}

	

