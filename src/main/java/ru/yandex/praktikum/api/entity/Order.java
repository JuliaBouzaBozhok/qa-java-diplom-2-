package ru.yandex.praktikum.api.entity;

import java.util.List;
import java.util.ArrayList;
import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class Order {

    private List<String> ingredients;

    public List<String> getIngredients() {
        return ingredients;
    }

    public Order() {
        ingredients = new ArrayList<>();
    }
}