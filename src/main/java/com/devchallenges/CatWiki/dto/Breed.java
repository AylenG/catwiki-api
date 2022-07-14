package com.devchallenges.CatWiki.dto;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Breed {
	
	@JsonProperty("id")
	private String id;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("description")
	private String description;
	
	@JsonProperty("temperament")
	private String temperament;
	
	@JsonProperty("life_span")
	private String lifeSpan;
	
	@JsonProperty("alt_names")
	private String altNames;
	
	@JsonProperty("wikipedia_url")
	private String wikipediaUrl;
	
	@JsonProperty("origin")
	private String origin;
	
	@JsonProperty("weight")
	private Weight weight;
	
	@JsonProperty("country_code")
	private String countryCode;
	
	@JsonProperty("experimental")
	private int experimental;
	
	@JsonProperty("hairless")
	private int hairless;
	
	@JsonProperty("natural")
	private int natural;
	
	@JsonProperty("rare")
	private int rare;
	
	@JsonProperty("rex")
	private int rex;
	
	@JsonProperty("suppress_tail")
	private int suppressTail;
	
	@JsonProperty("short_legs")
	private int shortLegs;
	
	@JsonProperty("hypoallergenic")
	private int hypoallergenic;
	
	@JsonProperty("adaptability")
	private short adaptability;
	
	@JsonProperty("affection_level")
	private short affectionLevel;
	
	@JsonProperty("child_friendly")
	private short childFriendly;
	
	@JsonProperty("dog_friendly")
	private short dogFriendly;
	
	@JsonProperty("energy_level")
	private short energyLevel;
	
	@JsonProperty("grooming")
	private short grooming;
	
	@JsonProperty("health_issues")
	private short healthIssues;
	
	@JsonProperty("intelligence")
	private short intelligence;
	
	@JsonProperty("shedding_level")
	private short sheddingLevel;
	
	@JsonProperty("social_needs")
	private short socialNeeds;
	
	@JsonProperty("stranger_friendly")
	private short strangerFriendly;
	
	@JsonProperty("vocalisation")
	private short vocalisation;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the temperament
	 */
	public String getTemperament() {
		return temperament;
	}

	/**
	 * @param temperament the temperament to set
	 */
	public void setTemperament(String temperament) {
		this.temperament = temperament;
	}

	/**
	 * @return the lifeSpan
	 */
	public String getLifeSpan() {
		return lifeSpan;
	}

	/**
	 * @param lifeSpan the lifeSpan to set
	 */
	public void setLifeSpan(String lifeSpan) {
		this.lifeSpan = lifeSpan;
	}

	/**
	 * @return the altNames
	 */
	public String getAltNames() {
		return altNames;
	}

	/**
	 * @param altNames the altNames to set
	 */
	public void setAltNames(String altNames) {
		this.altNames = altNames;
	}

	/**
	 * @return the wikipediaUrl
	 */
	public String getWikipediaUrl() {
		return wikipediaUrl;
	}

	/**
	 * @param wikipediaUrl the wikipediaUrl to set
	 */
	public void setWikipediaUrl(String wikipediaUrl) {
		this.wikipediaUrl = wikipediaUrl;
	}

	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * @return the weight
	 */
	public Weight getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(Weight weight) {
		this.weight = weight;
	}

	/**
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * @param countryCode the countryCode to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 * @return the experimental
	 */
	public int getExperimental() {
		return experimental;
	}

	/**
	 * @param experimental the experimental to set
	 */
	public void setExperimental(int experimental) {
		this.experimental = experimental;
	}

	/**
	 * @return the hairless
	 */
	public int getHairless() {
		return hairless;
	}

	/**
	 * @param hairless the hairless to set
	 */
	public void setHairless(int hairless) {
		this.hairless = hairless;
	}

	/**
	 * @return the natural
	 */
	public int getNatural() {
		return natural;
	}

	/**
	 * @param natural the natural to set
	 */
	public void setNatural(int natural) {
		this.natural = natural;
	}

	/**
	 * @return the rare
	 */
	public int getRare() {
		return rare;
	}

	/**
	 * @param rare the rare to set
	 */
	public void setRare(int rare) {
		this.rare = rare;
	}

	/**
	 * @return the rex
	 */
	public int getRex() {
		return rex;
	}

	/**
	 * @param rex the rex to set
	 */
	public void setRex(int rex) {
		this.rex = rex;
	}

	/**
	 * @return the suppressTail
	 */
	public int getSuppressTail() {
		return suppressTail;
	}

	/**
	 * @param suppressTail the suppressTail to set
	 */
	public void setSuppressTail(int suppressTail) {
		this.suppressTail = suppressTail;
	}

	/**
	 * @return the shortLegs
	 */
	public int getShortLegs() {
		return shortLegs;
	}

	/**
	 * @param shortLegs the shortLegs to set
	 */
	public void setShortLegs(int shortLegs) {
		this.shortLegs = shortLegs;
	}

	/**
	 * @return the hypoallergenic
	 */
	public int getHypoallergenic() {
		return hypoallergenic;
	}

	/**
	 * @param hypoallergenic the hypoallergenic to set
	 */
	public void setHypoallergenic(int hypoallergenic) {
		this.hypoallergenic = hypoallergenic;
	}

	/**
	 * @return the adaptability
	 */
	public short getAdaptability() {
		return adaptability;
	}

	/**
	 * @param adaptability the adaptability to set
	 */
	public void setAdaptability(short adaptability) {
		this.adaptability = adaptability;
	}

	/**
	 * @return the affectionLevel
	 */
	public short getAffectionLevel() {
		return affectionLevel;
	}

	/**
	 * @param affectionLevel the affectionLevel to set
	 */
	public void setAffectionLevel(short affectionLevel) {
		this.affectionLevel = affectionLevel;
	}

	/**
	 * @return the childFriendly
	 */
	public short getChildFriendly() {
		return childFriendly;
	}

	/**
	 * @param childFriendly the childFriendly to set
	 */
	public void setChildFriendly(short childFriendly) {
		this.childFriendly = childFriendly;
	}

	/**
	 * @return the dogFriendly
	 */
	public short getDogFriendly() {
		return dogFriendly;
	}

	/**
	 * @param dogFriendly the dogFriendly to set
	 */
	public void setDogFriendly(short dogFriendly) {
		this.dogFriendly = dogFriendly;
	}

	/**
	 * @return the energyLevel
	 */
	public short getEnergyLevel() {
		return energyLevel;
	}

	/**
	 * @param energyLevel the energyLevel to set
	 */
	public void setEnergyLevel(short energyLevel) {
		this.energyLevel = energyLevel;
	}

	/**
	 * @return the grooming
	 */
	public short getGrooming() {
		return grooming;
	}

	/**
	 * @param grooming the grooming to set
	 */
	public void setGrooming(short grooming) {
		this.grooming = grooming;
	}

	/**
	 * @return the healthIssues
	 */
	public short getHealthIssues() {
		return healthIssues;
	}

	/**
	 * @param healthIssues the healthIssues to set
	 */
	public void setHealthIssues(short healthIssues) {
		this.healthIssues = healthIssues;
	}

	/**
	 * @return the intelligence
	 */
	public short getIntelligence() {
		return intelligence;
	}

	/**
	 * @param intelligence the intelligence to set
	 */
	public void setIntelligence(short intelligence) {
		this.intelligence = intelligence;
	}

	/**
	 * @return the sheddingLevel
	 */
	public short getSheddingLevel() {
		return sheddingLevel;
	}

	/**
	 * @param sheddingLevel the sheddingLevel to set
	 */
	public void setSheddingLevel(short sheddingLevel) {
		this.sheddingLevel = sheddingLevel;
	}

	/**
	 * @return the socialNeeds
	 */
	public short getSocialNeeds() {
		return socialNeeds;
	}

	/**
	 * @param socialNeeds the socialNeeds to set
	 */
	public void setSocialNeeds(short socialNeeds) {
		this.socialNeeds = socialNeeds;
	}

	/**
	 * @return the strangerFriendly
	 */
	public short getStrangerFriendly() {
		return strangerFriendly;
	}

	/**
	 * @param strangerFriendly the strangerFriendly to set
	 */
	public void setStrangerFriendly(short strangerFriendly) {
		this.strangerFriendly = strangerFriendly;
	}

	/**
	 * @return the vocalisation
	 */
	public short getVocalisation() {
		return vocalisation;
	}

	/**
	 * @param vocalisation the vocalisation to set
	 */
	public void setVocalisation(short vocalisation) {
		this.vocalisation = vocalisation;
	}

	@Override
	public String toString() {
		return "Breed [id=" + id + ", name=" + name + ", description=" + description + ", temperament=" + temperament
				+ ", lifeSpan=" + lifeSpan + ", altNames=" + altNames + ", wikipediaUrl=" + wikipediaUrl + ", origin="
				+ origin + ", weight=" + weight + ", countryCode=" + countryCode + ", experimental=" + experimental
				+ ", hairless=" + hairless + ", natural=" + natural + ", rare=" + rare + ", rex=" + rex
				+ ", suppressTail=" + suppressTail + ", shortLegs=" + shortLegs + ", hypoallergenic=" + hypoallergenic
				+ ", adaptability=" + adaptability + ", affectionLevel=" + affectionLevel + ", childFriendly="
				+ childFriendly + ", dogFriendly=" + dogFriendly + ", energyLevel=" + energyLevel + ", grooming="
				+ grooming + ", healthIssues=" + healthIssues + ", intelligence=" + intelligence + ", sheddingLevel="
				+ sheddingLevel + ", socialNeeds=" + socialNeeds + ", strangerFriendly=" + strangerFriendly
				+ ", vocalisation=" + vocalisation + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(adaptability, affectionLevel, altNames, childFriendly, countryCode, description,
				dogFriendly, energyLevel, experimental, grooming, hairless, healthIssues, hypoallergenic, id,
				intelligence, lifeSpan, name, natural, origin, rare, rex, sheddingLevel, shortLegs, socialNeeds,
				strangerFriendly, suppressTail, temperament, vocalisation, weight, wikipediaUrl);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Breed other = (Breed) obj;
		return adaptability == other.adaptability && affectionLevel == other.affectionLevel
				&& Objects.equals(altNames, other.altNames) && childFriendly == other.childFriendly
				&& Objects.equals(countryCode, other.countryCode) && Objects.equals(description, other.description)
				&& dogFriendly == other.dogFriendly && energyLevel == other.energyLevel
				&& experimental == other.experimental && grooming == other.grooming && hairless == other.hairless
				&& healthIssues == other.healthIssues && hypoallergenic == other.hypoallergenic
				&& Objects.equals(id, other.id) && intelligence == other.intelligence
				&& Objects.equals(lifeSpan, other.lifeSpan) && Objects.equals(name, other.name)
				&& natural == other.natural && Objects.equals(origin, other.origin) && rare == other.rare
				&& rex == other.rex && sheddingLevel == other.sheddingLevel && shortLegs == other.shortLegs
				&& socialNeeds == other.socialNeeds && strangerFriendly == other.strangerFriendly
				&& suppressTail == other.suppressTail && Objects.equals(temperament, other.temperament)
				&& vocalisation == other.vocalisation && Objects.equals(weight, other.weight)
				&& Objects.equals(wikipediaUrl, other.wikipediaUrl);
	}
	
}
