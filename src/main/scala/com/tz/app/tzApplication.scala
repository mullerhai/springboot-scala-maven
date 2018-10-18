package com.tz.app

import org.springframework.boot.{SpringApplication, SpringBootConfiguration}
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
@SpringBootConfiguration
class  tzApplication{

}

object tzApplication  {


     def main(args: Array[String]): Unit = {
        SpringApplication.run(classOf[AppConfig])
    }


}
