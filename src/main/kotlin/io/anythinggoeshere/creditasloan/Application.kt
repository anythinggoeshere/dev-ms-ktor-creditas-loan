package io.anythinggoeshere.creditasloan

import io.ktor.application.Application
import io.anythinggoeshere.creditasloan.configuration.koinConfiguration
import io.anythinggoeshere.creditasloan.configuration.ktorConfiguration
import io.anythinggoeshere.creditasloan.infrastructure.monitoring.configureMonitoring
import io.anythinggoeshere.creditasloan.presentation.configureRouting

fun main(args: Array<String>): Unit =
    io.ktor.server.cio.EngineMain.main(args)

@Suppress("unused")
fun Application.module() {
    ktorConfiguration()
    koinConfiguration()
    configureMonitoring()
    configureRouting()
}
