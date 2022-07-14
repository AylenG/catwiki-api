package com.devchallenges.CatWiki.service.impl;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.devchallenges.CatWiki.dto.Breed;
import com.devchallenges.CatWiki.dto.BreedId;
import com.devchallenges.CatWiki.service.IBreedService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

@Service
public class BreedServiceImpl implements IBreedService {

	@Value("${app.catwiki.url}")
	private String apiUrl;
	
	@Value("${app.catwiki.apikey}")
	private String apiKey;

	@Override
	public List<Breed> getAllBreeds() throws IOException {
		
		OkHttpClient client = new OkHttpClient().newBuilder()
				  .build();
		Request request = new Request.Builder()
				  .url(apiUrl + "/breeds")
				  .addHeader("x-api-key", apiKey)
				  .addHeader("Content-Type", "application/json")
				  .build();
		Response response = null;
		String arrayBreed = "";
		
		try {
			response = client.newCall(request).execute();
			arrayBreed = response.body().string();
		} catch (IOException e) {
			throw new IOException("Error calling catWiki api. Message: " + e.getMessage());
		} 
		
		return new Gson().fromJson(arrayBreed, new TypeToken<List<Breed>>(){}.getType());
	}

	@Override
	public Breed getBreedById(String id) throws IOException {
		OkHttpClient client = new OkHttpClient().newBuilder()
				  .build();
		Request request = new Request.Builder()
				  .url(apiUrl + "/breeds/" + id)
				  .addHeader("x-api-key", apiKey)
				  .addHeader("Content-Type", "application/json")
				  .build();
		Response response = null;
		String arrayBreed = "";
		
		try {
			response = client.newCall(request).execute();
			arrayBreed = response.body().string();
		} catch (IOException e) {
			throw new IOException("Error calling catWiki api. Message: " + e.getMessage());
		} 
		
		return new Gson().fromJson(arrayBreed, Breed.class);
	}

	@Override
	public List<BreedId> getBreedsIds() throws IOException {
		OkHttpClient client = new OkHttpClient().newBuilder()
				  .build();
		Request request = new Request.Builder()
				  .url(apiUrl + "/breeds")
				  .addHeader("x-api-key", apiKey)
				  .addHeader("Content-Type", "application/json")
				  .build();
		Response response = null;
		String arrayBreed = "";
		
		try {
			response = client.newCall(request).execute();
			arrayBreed = response.body().string();
		} catch (IOException e) {
			throw new IOException("Error calling catWiki api. Message: " + e.getMessage());
		} 
		
		return new Gson().fromJson(arrayBreed, new TypeToken<List<BreedId>>(){}.getType());
	}
	
}
