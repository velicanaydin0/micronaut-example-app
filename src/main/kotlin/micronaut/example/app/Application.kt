package micronaut.example.app

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("micronaut.example.app")
                .mainClass(Application.javaClass)
                .start()
    }
}