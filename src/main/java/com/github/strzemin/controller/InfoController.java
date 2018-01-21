/**
 * Praca inzynierska
 */
package com.github.strzemin.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.strzemin.constants.Constants;

/**
 * @author Maciej Strzeminski
 *
 * 2018
 */

@Controller
@RequestMapping(Constants.INFO_ENDPOINT)
public class InfoController {
	
    private final AtomicLong counter = new AtomicLong();

    @CrossOrigin(origins = "*")
    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody InfoDto pingGet() {  	
        return new InfoDto(counter.incrementAndGet(), "Strzeminski Maciej");
    }
    
    @CrossOrigin(origins = "*")
    @RequestMapping(method=RequestMethod.POST)
    public @ResponseBody InfoDto pingPost() {
        return new InfoDto(counter.incrementAndGet(), "POST");
    }
    
  
}
