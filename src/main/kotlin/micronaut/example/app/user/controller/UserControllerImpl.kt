package micronaut.example.app.user.controller

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import micronaut.example.app.user.entity.User
import micronaut.example.app.user.service.UserService

@Controller("/user")
class UserControllerImpl(private val userService: UserService) : UserController {

    @Get("/greet/{name}", produces = [MediaType.TEXT_PLAIN])
    override fun greetUser(name: String): String {
        return userService.greetUser(name)
    }

    @Get("/")
    override fun getUsers(): ArrayList<User> {
        return userService.getUsers()
    }
}