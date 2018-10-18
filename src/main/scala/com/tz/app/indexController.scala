package com.tz.app

import org.springframework.web.bind.annotation.{GetMapping, RestController}

@RestController
class indexController {

    @GetMapping(value=Array("/index"))
    def index():String={
        return "helm maven  is better "
    }

    @GetMapping(value=Array("/find"))
    def find():String={
        return "is better "
    }
}
