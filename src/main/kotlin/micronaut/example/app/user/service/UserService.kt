package micronaut.example.app.user.service

import micronaut.example.app.user.entity.User

interface UserService {

    fun greetUser(name: String): String

    fun getUsers(): ArrayList<User>
}