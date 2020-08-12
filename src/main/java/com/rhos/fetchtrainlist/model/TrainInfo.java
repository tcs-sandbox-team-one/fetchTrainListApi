package com.rhos.fetchtrainlist.model;

public class TrainInfo {

	   private String trainName;
	   private String source;
	   private String destination;
	/**
	 * @return the trainName
	 */
	public String getTrainName() {
		return trainName;
	}
	/**
	 * @param trainName the trainName to set
	 */
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
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
	public TrainInfo(String trainName, String source, String destination) {
		super();
		this.trainName = trainName;
		this.source = source;
		this.destination = destination;
	}
	public TrainInfo() {
		super();
	}
	@Override
	public String toString() {
		return "TrainInfo [trainName=" + trainName + ", source=" + source + ", destination=" + destination + "]";
	}
	   
	   
}
