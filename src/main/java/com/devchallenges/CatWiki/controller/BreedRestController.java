package com.devchallenges.CatWiki.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devchallenges.CatWiki.dto.Breed;
import com.devchallenges.CatWiki.dto.BreedId;
import com.devchallenges.CatWiki.dto.RestResponse;
import com.devchallenges.CatWiki.service.IBreedService;

@RestController
@RequestMapping("/api")
public class BreedRestController {

	@Autowired
	private IBreedService breedService;
	
	@GetMapping("/breeds")
	RestResponse getAllBreeds() {
		List<Breed> listBreeds = new ArrayList<>();
		
		try {
			listBreeds = breedService.getAllBreeds();
		} catch(Exception e) {
			return new RestResponse(listBreeds, true, "Error getting breeds. Detail: " + e.getMessage()); 
		}
		
		return new RestResponse(listBreeds, false, ""); 
	}
	
	@GetMapping("/breeds/ids")
	RestResponse getAllBreedsIds() {
		List<BreedId> listBreeds = new ArrayList<>();
		
		try {
			listBreeds = breedService.getBreedsIds();
		} catch(Exception e) {
			return new RestResponse(listBreeds, true, "Error getting breeds's ids. Detail: " + e.getMessage()); 
		}
		
		return new RestResponse(listBreeds, false, ""); 
	}
	
	@GetMapping("/breed/{id}")
	RestResponse getBreedById(@PathVariable("id") String id) {
		Breed breed = new Breed();
		
		try {
			breed = breedService.getBreedById(id);
		} catch(Exception e) {
			return new RestResponse(breed, true, "Error getting breed '" + id + "'. Detail: " + e.getMessage()); 
		}
		
		if(breed.getId() == null) {
			return new RestResponse(null, true, "Error. Breed doesn't exists"); 
		}
		
		return new RestResponse(breed, false, ""); 
	}
}
