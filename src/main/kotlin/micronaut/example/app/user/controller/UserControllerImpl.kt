package micronaut.example.app.user.controller

import micronaut.example.app.user.entity.User
import micronaut.example.app.user.service.UserService

class UserControllerImpl(private val userService: UserService) : UserController {

    override fun greetUser(name: String): String {
        return userService.greetUser(name)
    }

    override fun getUsers(): ArrayList<User> {
        return userService.getUsers()
    }
}