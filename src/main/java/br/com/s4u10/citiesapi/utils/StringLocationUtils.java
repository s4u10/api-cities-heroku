package br.com.s4u10.citiesapi.utils;
/**
 *
 * @author s4u1o
 */
public class StringLocationUtils {
    public static Double[] transform(String geolocation) {
        String result = geolocation.replace("(", "").replace(")", "");
        String[] strings = result.trim().split(",");
        return new Double[] {Double.valueOf(strings[0]), Double.valueOf(strings[1])};
    }
}