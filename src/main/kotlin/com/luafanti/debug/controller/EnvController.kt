package com.luafanti.debug.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class EnvController {

    @GetMapping("/envs")
    fun envs(model: Model): String {
        model.addAttribute("envs", System.getenv())
        return "envs"
    }
}
