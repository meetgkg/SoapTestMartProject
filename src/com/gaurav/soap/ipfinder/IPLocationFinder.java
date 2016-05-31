package com.gaurav.soap.ipfinder;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;

public class IPLocationFinder {
	
	GeoIPService ipService;

	public static void main(String[] args) {
		
		if(args.length != 1){
			System.out.println("Pass one param, which is IP Address");
			return;
		}
		
		String ipAddress = args[0];		
		GeoIPService ipService = new GeoIPService();		
		GeoIP geoIP = ipService.getGeoIPServiceSoap().getGeoIP(ipAddress);		
		System.out.println(geoIP.getCountryName());
		
	}

}
