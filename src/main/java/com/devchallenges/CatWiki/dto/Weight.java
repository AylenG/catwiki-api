package com.devchallenges.CatWiki.dto;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Weight {

	@JsonProperty("imperial")
	private String imperial;
	
	@JsonProperty("metric")
	private String metric;

	/**
	 * @return the imperial
	 */
	public String getImperial() {
		return imperial;
	}

	/**
	 * @param imperial the imperial to set
	 */
	public void setImperial(String imperial) {
		this.imperial = imperial;
	}

	/**
	 * @return the metric
	 */
	public String getMetric() {
		return metric;
	}

	/**
	 * @param metric the metric to set
	 */
	public void setMetric(String metric) {
		this.metric = metric;
	}

	@Override
	public String toString() {
		return "Weight [imperial=" + imperial + ", metric=" + metric + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(imperial, metric);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Weight other = (Weight) obj;
		return Objects.equals(imperial, other.imperial) && Objects.equals(metric, other.metric);
	}
	
	
}
