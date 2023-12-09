package com.niri.client2;

import com.niri.client2.gen.GetCountryRequest;
import com.niri.client2.gen.GetCountryResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;


public class CountryClient extends WebServiceGatewaySupport {
    public GetCountryResponse getCountry(String country) {
        GetCountryRequest request = new GetCountryRequest();
        request.setName(country);
        GetCountryResponse response = (GetCountryResponse)
                getWebServiceTemplate()
                        .marshalSendAndReceive(request);
        return response; }
}