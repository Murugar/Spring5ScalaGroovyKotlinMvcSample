package com.iqmsoft.app.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class KotlinController {
    @RequestMapping(value = "/kotlin")
    fun home() : String {
        return "one"
    }
}