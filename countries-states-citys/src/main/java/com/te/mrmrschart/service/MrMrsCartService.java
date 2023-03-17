package com.te.mrmrschart.service;

import java.util.List;

import com.te.mrmrschart.dto.CityDto;
import com.te.mrmrschart.dto.CountryDto;
import com.te.mrmrschart.dto.StateDto;

public interface MrMrsCartService {

	List<CountryDto> getAllCountries();

	List<StateDto> getListOfStates(String countryName);

	List<CityDto> getListOfCities(String country, String state);

}
