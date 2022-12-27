package com.luafanti.debug.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("delays")
class DelayController {

    @GetMapping("/1")
    fun oneSecondDelay(): String {
        Thread.sleep(1000)
        return "1 second delay"
    }

    @GetMapping("/3")
    fun threeSecondDelay(): String {
        Thread.sleep(3000)
        return "3 seconds delay"
    }

    @GetMapping("/5")
    fun fiveSecondDelay(): String {
        Thread.sleep(5000)
        return "5 seconds delay"
    }

    @GetMapping("/custom")
    fun fiveSecondDelay(@RequestParam seconds: Long): String {
        Thread.sleep(seconds * 1000)
        return "$seconds seconds delay"
    }
}
