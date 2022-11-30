package com.luafanti.debug.controller

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("logs")
class LoggingController {

    private val logger = LoggerFactory.getLogger(javaClass)

    @GetMapping("/info")
    fun info(): String {
        logger.info("Info log printing")
        return "Info log produced"
    }

    @GetMapping("/debug")
    fun debug(): String {
        logger.info("Debug log printing")
        return "Debug log produced"
    }

    @GetMapping("/exception")
    fun exception(): String {
        try {
            throw Exception("Err")
        } catch (e: Exception) {
            logger.error(e.stackTraceToString())
        }
        return "Exception stack strace produced"
    }
}
