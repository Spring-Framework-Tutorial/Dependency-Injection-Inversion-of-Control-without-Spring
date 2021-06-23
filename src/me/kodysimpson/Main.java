package me.kodysimpson;

import me.kodysimpson.service.RestaurantService;
import me.kodysimpson.service.di.MessageService;
import me.kodysimpson.service.di.SpanishMessageServiceImpl;
import me.kodysimpson.service.di.TextingService;

public class Main {

    public static void main(String[] args) {

        //No dependency injection is used here, the FoodService is made within the RestaurantService
        RestaurantService restaurantService = new RestaurantService();
        restaurantService.processOrder();

        //Example of manual constructor dependency injection
        MessageService messageService = new SpanishMessageServiceImpl(); //we can choose any of the messageservice implementations
        TextingService textingService = new TextingService(messageService); //inject it in!

    }
}
