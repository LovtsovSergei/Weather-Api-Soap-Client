
package com.epamacademy.webservice.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WeatherApiServiceService", targetNamespace = "http://service.webservice.epamacademy.com/", wsdlLocation = "http://localhost:8081/soap?wsdl")
public class WeatherApiServiceService
    extends Service
{

    private final static URL WEATHERAPISERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException WEATHERAPISERVICESERVICE_EXCEPTION;
    private final static QName WEATHERAPISERVICESERVICE_QNAME = new QName("http://service.webservice.epamacademy.com/", "WeatherApiServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/soap?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEATHERAPISERVICESERVICE_WSDL_LOCATION = url;
        WEATHERAPISERVICESERVICE_EXCEPTION = e;
    }

    public WeatherApiServiceService() {
        super(__getWsdlLocation(), WEATHERAPISERVICESERVICE_QNAME);
    }

    public WeatherApiServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEATHERAPISERVICESERVICE_QNAME, features);
    }

    public WeatherApiServiceService(URL wsdlLocation) {
        super(wsdlLocation, WEATHERAPISERVICESERVICE_QNAME);
    }

    public WeatherApiServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEATHERAPISERVICESERVICE_QNAME, features);
    }

    public WeatherApiServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WeatherApiServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WeatherApiService
     */
    @WebEndpoint(name = "WeatherApiServicePort")
    public WeatherApiService getWeatherApiServicePort() {
        return super.getPort(new QName("http://service.webservice.epamacademy.com/", "WeatherApiServicePort"), WeatherApiService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WeatherApiService
     */
    @WebEndpoint(name = "WeatherApiServicePort")
    public WeatherApiService getWeatherApiServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.webservice.epamacademy.com/", "WeatherApiServicePort"), WeatherApiService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEATHERAPISERVICESERVICE_EXCEPTION!= null) {
            throw WEATHERAPISERVICESERVICE_EXCEPTION;
        }
        return WEATHERAPISERVICESERVICE_WSDL_LOCATION;
    }

}