package com.cbrl.spring.apache.cxf.search;

public class ComputerDTO {
	private String name;
	private ComputerBrands brands;
	private String screenSize;
	private String RAM;
	private String processor;
	private String maxScreenResolution;

	public ComputerDTO() {

	}

	public ComputerDTO(String name, ComputerBrands brands, String screenSize, String processor) {
		setName(name);
		setBrands(brands);
		setScreenSize(screenSize);
		setProcessor(processor);
	}

	public ComputerBrands getBrands() {
		return brands;
	}

	public void setBrands(ComputerBrands brands) {
		this.brands = brands;
	}

	public String getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}

	public String getRAM() {
		return RAM;
	}

	public void setRAM(String rAM) {
		RAM = rAM;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getMaxScreenResolution() {
		return maxScreenResolution;
	}

	public void setMaxScreenResolution(String maxScreenResolution) {
		this.maxScreenResolution = maxScreenResolution;
	}

	public void summary() {
		System.out.println(name);
		System.out.println(getMaxScreenResolution());
		System.out.println(getProcessor());
		System.out.println(getRAM());
		System.out.println(getBrands());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
