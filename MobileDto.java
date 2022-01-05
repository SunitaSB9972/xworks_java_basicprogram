package com.xworkz.jdbc.practical;

public class MobileDto {
	
	private Integer mobile_id;
	private  String modelName;
	private Integer price;
	private String memory;
	private String brandName;
	private Integer noOfCamere;
	
	public MobileDto(Integer mobile_id, String modelName, Integer price, String memory, String brandName,
			Integer noOfCamere) {
		super();
		this.mobile_id = mobile_id;
		this.modelName = modelName;
		this.price = price;
		this.memory = memory;
		this.brandName = brandName;
		this.noOfCamere = noOfCamere;
	}

	public Integer getMobile_id() {
		return mobile_id;
	}

	public String getModelName() {
		return modelName;
	}

	public Integer getPrice() {
		return price;
	}

	public String getMemory() {
		return memory;
	}

	public String getBrandName() {
		return brandName;
	}

	public Integer getNoOfCamere() {
		return noOfCamere;
	}

	@Override
	public String toString() {
		return "MobileDto [mobile_id=" + mobile_id + ", modelName=" + modelName + ", price=" + price + ", memory="
				+ memory + ", brandName=" + brandName + ", noOfCamere=" + noOfCamere + "]";
	}
	
	

}
