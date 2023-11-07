package com.misicode._01POO.Exercises.P110;

import com.misicode._01POO.Exercises.P110.entities.OrderArrays;
import com.misicode._01POO.Exercises.P110.services.OrderArraysService;

public class Main {
    public static void main(String[] args) {
        OrderArraysService orderArraysService = new OrderArraysService();
        OrderArrays orderArrays = orderArraysService.createOrderArrays();

        System.out.println(orderArrays);
    }
}
