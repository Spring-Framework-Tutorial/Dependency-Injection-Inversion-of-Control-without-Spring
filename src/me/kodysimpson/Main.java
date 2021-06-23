package me.kodysimpson;

import me.kodysimpson.service.RestaurantService;

public class Main {

    public static void main(String[] args) {

        RestaurantService restaurantService = new RestaurantService();
        restaurantService.processOrder();

    }
}
