package roon.oop.objects.ch2.infra;

import roon.oop.objects.ch2.domain.Customer;
import roon.oop.objects.ch2.domain.Movie;
import roon.oop.objects.ch2.domain.Screening;

import java.util.HashMap;
import java.util.Map;

// 간단한 예제니까 따로 DB 안 쓰고 이렇게 함..
public class Storage {
    private static Map<String, Customer> customers = new HashMap<>();
    private static Map<String, Movie> movies = new HashMap();
    private static Map<String, Screening> screenings = new HashMap<>();

    public static Customer getCustomer(String id) {
        return customers.getOrDefault(id, null);
    }

    public static Movie getMovie(String id) {
        return movies.getOrDefault(id, null);
    }

    public static Screening getScreening(String id) {
        return screenings.getOrDefault(id, null);
    }

    public static void putCustomer(String id, Customer customer) {
        customers.put(id, customer);
    }

    public static void putMovie(String id, Movie movie) {
        movies.put(id, movie);
    }

    public static void putScreening(String id, Screening screening) {
        screenings.put(id, screening);
    }
}
