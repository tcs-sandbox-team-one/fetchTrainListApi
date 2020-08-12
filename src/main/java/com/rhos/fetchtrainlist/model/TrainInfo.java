package com.rhos.fetchtrainlist.model;

public class TrainInfo {

	  
	   private String source;
	   private String destination;
	   private String type;
	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}
	/**
	 * @param source the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}
	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}
	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "TrainInfo [source=" + source + ", destination=" + destination + ", type=" + type + "]";
	}
	public TrainInfo(String source, String destination, String type) {
		super();
		this.source = source;
		this.destination = destination;
		this.type = type;
	}
	public TrainInfo() {
		super();
	}
	
	   
	   
}
