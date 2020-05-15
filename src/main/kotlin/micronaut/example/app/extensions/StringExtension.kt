package micronaut.example.app.extensions

fun String.getGreetingMessage(): String {
    return "Hello $this"
}