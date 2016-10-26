package com.disney.ipbt.tddkatas;

public enum DateStatus {
	
	NULL(null),
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
