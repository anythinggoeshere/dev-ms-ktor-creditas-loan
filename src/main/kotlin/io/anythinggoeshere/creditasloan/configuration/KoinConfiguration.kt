package io.anythinggoeshere.creditasloan.configuration

import io.ktor.application.Application
import io.ktor.application.install
import org.koin.dsl.module
import org.koin.ktor.ext.Koin

fun Application.koinConfiguration() {

    install(Koin) {
        modules(
            module {

            }
        )
    }
}
