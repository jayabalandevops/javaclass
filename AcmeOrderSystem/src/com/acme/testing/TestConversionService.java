package com.acme.testing;

import com.acme.utils.ConversionService;

public class TestConversionService {

	public static void main(String[] args) {
		// conversion service main entry
		System.out.println(ConversionService.fluidOunces(1.1f));
		System.out.println(ConversionService.gallons(2.2f));
		System.out.println(ConversionService.grams(30));
		System.out.println(ConversionService.milliliters(40));
		System.out.println(ConversionService.ounces(50));
		System.out.println(ConversionService.pints(6.6f));
		System.out.println(ConversionService.pounds(7.7));
	}

}
