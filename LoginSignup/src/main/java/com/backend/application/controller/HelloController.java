package com.backend.application.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
@CrossOrigin(origins = "*", maxAge = 3600)
public class HelloController {
	@GetMapping("/all")
	  public String allAccess() {
	    return "Hello from GreenStitch";
	  }

	  @GetMapping("/user")
	  @PreAuthorize("hasRole('USER') or hasRole('DEVELOPER') or hasRole('ADMIN')")
	  public String userAccess() {
	    return "Hello from GreenStitch";
	  }

	  @GetMapping("/dev")
	  @PreAuthorize("hasRole('DEVELOPER')")
	  public String developerAccess() {
	    return "Hello from GreenStitch";
	  }

	  @GetMapping("/admin")
	  @PreAuthorize("hasRole('ADMIN')")
	  public String adminAccess() {
	    return "Hello from GreenStitch";
	  }

}
