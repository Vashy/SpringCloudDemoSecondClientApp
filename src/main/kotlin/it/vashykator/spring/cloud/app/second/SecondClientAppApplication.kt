package it.vashykator.spring.cloud.app.second

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import javax.ws.rs.GET

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
class SecondClientAppApplication

fun main(args: Array<String>) {
	runApplication<SecondClientAppApplication>(*args)
}

@RestController
class Caller(private val firstAppClient: FirstAppClient) {
	@GetMapping("/example")
	fun example() = firstAppClient.myEndpoint()
}

@FeignClient("first-client-app")
interface FirstAppClient {
	@GetMapping("/my-endpoint")
	fun myEndpoint(): Par
}

data class Par(val first: String, val second: String)