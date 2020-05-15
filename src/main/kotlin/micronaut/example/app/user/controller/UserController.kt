package micronaut.example.app.user.controller

import micronaut.example.app.user.entity.User

interface UserController {

    fun greetUser(name: String): String

    fun getUsers(): ArrayList<User>
}