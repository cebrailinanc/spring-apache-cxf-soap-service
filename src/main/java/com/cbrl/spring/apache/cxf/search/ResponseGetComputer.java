package com.cbrl.spring.apache.cxf.search;

import java.util.List;

public class ResponseGetComputer {
	private List<ComputerDTO> searchList;

	public List<ComputerDTO> getSearchList() {
		return searchList;
	}

	public void setSearchList(List<ComputerDTO> searchList) {
		this.searchList = searchList;
	}
}
