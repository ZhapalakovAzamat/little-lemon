package com.example.littlelemon

data class Dish(
    val name:String
    , val price:String
    , val description:String
    , val image:Int
)

val Dishes = listOf<Dish>(
    Dish("Greek Salad", "$10.00", "The famous greek salad of crispy lettuce, peppers, olives, our Chicago.", R.drawable.greeksalad)
    , Dish("Lemon Dessert", "$10.00", "Traditional homemade Italian Lemon Ricotta Cake.", R.drawable.lemondessert)
    , Dish("Grilled Fish", "$10.00", "Our Bruschetta is made from grilled bread that has been smeared with garlic and seasoned with salt and olive oil.", R.drawable.grilledfish)
    , Dish("Pasta", "$10.00", "Penne with fried aubergines, cherry tomatoes, tomato sauce, fresh chili, garlic, basil & salted ricotta cheese.", R.drawable.lemondessert)
    , Dish("Bruschetta", "$10.00", "Oven-baked bruschetta stuffed with tomatoes and herbs.", R.drawable.bruschetta)
)
