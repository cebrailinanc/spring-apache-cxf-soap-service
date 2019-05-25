package com.cbrl.spring.apache.cxf.search;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.jws.WebService;

@WebService(endpointInterface = "com.cbrl.spring.apache.cxf.search.ISearchComputer")
public class SearchComputerImpl implements ISearchComputer {

	@Override
	public ResponseGetComputer getComputer(RequestGetComputer request) {
		List<ComputerDTO> list = new ArrayList<ComputerDTO>();
		list.add(new ComputerDTO("2018 Newest Lenovo Ideapad 15.6", ComputerBrands.Lenovo, "15.6",
				"AMD Quad-core A12-9720P processor 2.7GHz"));
		list.add(new ComputerDTO("Acer Aspire E 15 Laptop", ComputerBrands.Acer, "15.6",
				"8th Gen Intel Core i5-8250U, "));
		list.add(new ComputerDTO("ASUS Chromebook", ComputerBrands.ASUS, "11.6", "Intel Celeron N3060 Processor"));
		list.add(new ComputerDTO("Lenovo N42-20 14in ", ComputerBrands.Lenovo, "14.6",
				" Celeron N3060 Dual-core 1.6GHz"));
		list.add(new ComputerDTO("2018 Acer 14' FHD IPS Display ", ComputerBrands.Acer, "15.6",
				"Quad-Core Processor Up to 2.24Ghz"));
		list.add(new ComputerDTO("ASUS TUF 17.3\" FHD LED", ComputerBrands.ASUS, "15.6", "Intel Core i7-8750H "));
		ResponseGetComputer response = new ResponseGetComputer();
		response.setSearchList(list.stream().filter(item -> item.getBrands().equals(request.getBrands()))
				.collect(Collectors.toList()));
		return response;
	}

}
