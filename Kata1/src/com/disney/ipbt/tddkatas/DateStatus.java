package com.disney.ipbt.tddkatas;

public enum DateStatus {
	
	NOT_SET(0),
	FIRM(1),
	TBD(2);
	
	
	private Integer index;
	
	DateStatus(Integer index){
		this.index = index;
	}
	
	public Integer getIndex(){
		return this.index;
	}
	
	

}
