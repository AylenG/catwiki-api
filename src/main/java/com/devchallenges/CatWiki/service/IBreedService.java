package com.devchallenges.CatWiki.service;

import java.io.IOException;
import java.util.List;

import com.devchallenges.CatWiki.dto.Breed;
import com.devchallenges.CatWiki.dto.BreedId;

public interface IBreedService {
	
	public List<Breed> getAllBreeds() throws IOException;
	
	public List<BreedId> getBreedsIds() throws IOException;
	
	public Breed getBreedById(String id) throws IOException;
	
	
}
