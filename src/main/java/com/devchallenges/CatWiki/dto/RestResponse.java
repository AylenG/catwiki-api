package com.devchallenges.CatWiki.dto;

public class RestResponse {

	private Object response;
	private boolean error;
	private String message;

	
	public RestResponse() {
		super();
	}

	public RestResponse(Object response, boolean error, String message) {
		super();
		this.response = response;
		this.error = error;
		this.message = message;
	}
	
	/**
	 * @return the response
	 */
	public Object getResponse() {
		return response;
	}
	/**
	 * @param response the response to set
	 */
	public void setResponse(Object response) {
		this.response = response;
	}
	/**
	 * @return the error
	 */
	public boolean isError() {
		return error;
	}
	/**
	 * @param error the error to set
	 */
	public void setError(boolean error) {
		this.error = error;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
}
