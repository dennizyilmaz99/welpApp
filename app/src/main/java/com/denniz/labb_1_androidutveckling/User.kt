package com.denniz.labb_1_androidutveckling

class User (
    var username: String = "",
    var password: String = "",
        ){
    override fun toString(): String {
        return "Users(username='$username', password='$password'"
    }
}