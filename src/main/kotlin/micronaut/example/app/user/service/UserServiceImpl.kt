package micronaut.example.app.user.service

import micronaut.example.app.extensions.getGreetingMessage
import micronaut.example.app.user.entity.User
import javax.inject.Singleton

@Singleton
class UserServiceImpl : UserService {

    override fun getUsers(): ArrayList<User> {
        return arrayListOf(
                User("Veli", 22, "Software Engineer"),
                User("Ali", 19, "Student")
        )
    }

    override fun greetUser(name: String): String {
        return name.getGreetingMessage()
    }

}