package client;

import com.epamacademy.webservice.service.*;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private static Forecast createForecast() {
        Forecast forecast = new Forecast();
        forecast.setCity("Moscow");
        forecast.setDegreesCelsius(25);
        forecast.setDegreesFarenheit(-11);
        forecast.setId(1111);
        forecast.setRainChance(50);
        forecast.setZipCode("22222");
        return forecast;
    }

    public static void main(String[] args) throws DBAccessException_Exception, CannotAddDataException_Exception {
        WeatherApiServiceService weatherApiServiceService = new WeatherApiServiceService();
        WeatherApiService weatherApiService = weatherApiServiceService.getWeatherApiServicePort();
        List<Forecast> list;
        Forecast forecast;
        //test
        System.out.println(weatherApiService.test());
        System.out.println();
        //count
        System.out.println(weatherApiService.count());
        System.out.println();

        //listAll
//        list = weatherApiService.listAll();
//        for (Forecast f: list) {
//            System.out.println(f);
//        }
//        System.out.println();
        //listNonRainy
        list = weatherApiService.listNonRainy();
        for (Forecast f: list) {
            System.out.println(f);
        }
        System.out.println();

        //listRainy
        list = weatherApiService.listRainy();
        System.out.println();
        for (Forecast f: list) {
            System.out.println(f);
        }
        System.out.println();

        //getForecastById
        System.out.println(weatherApiService.getForecastById(998));
        System.out.println();
        //getForecastByCity
        System.out.println(weatherApiService.getForecastByCity("york"));
        System.out.println(weatherApiService.getForecastByCity("new york"));
        System.out.println();
        //getForecastByZipCode
        System.out.println(weatherApiService.getForecastByZipCode("222"));
        System.out.println(weatherApiService.getForecastByZipCode("10008"));
        System.out.println();

        //add
        forecast = Client.createForecast();
        System.out.println(weatherApiService.add(forecast));
        System.out.println(weatherApiService.getForecastByCity("moscow"));
        System.out.println();

        //deleteByCity
        System.out.println( weatherApiService.deleteByCity("moscow"));
        System.out.println();

//        //deleteById
        forecast = Client.createForecast();
        System.out.println(weatherApiService.add(forecast));
        System.out.println( weatherApiService.getForecastByCity("moscow"));
        System.out.println( weatherApiService.deleteById(1111));
        System.out.println( weatherApiService.deleteById(1002));
        System.out.println();

//        //deleteByZipCode
        forecast = Client.createForecast();
        System.out.println(weatherApiService.add(forecast));
        System.out.println( weatherApiService.getForecastByCity("moscow"));
        System.out.println( weatherApiService.deleteByZipCode("22222"));
        System.out.println();


        //getHottest
        System.out.println(weatherApiService.getHottest());
        System.out.println();

        //addAll
        list = new ArrayList<Forecast>();
        list.add(Client.createForecast());
        list.add(Client.createForecast());
        list.add(Client.createForecast());
        weatherApiService.addAll(list);

//        list = weatherApiService.listAll();
//        for (Forecast f: list) {
//            System.out.println(f);
//        }
    }
}
