package com.example.welcome

data class Product(val name: String)

fun getProducts() : List<String>{
    var list = mutableListOf<String>()
    for(i in 1..100){
        list.add("Product $i")
    }

    return list
}
