package com.tz.app

import org.springframework.boot.{Banner, SpringApplication, SpringBootConfiguration, WebApplicationType}
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder

@SpringBootApplication
@SpringBootConfiguration
class  tzApplication{

}

object tzApplication  {


    def main(args:Array[String]): Unit = {
        (new SpringApplicationBuilder)
                .bannerMode(Banner.Mode.CONSOLE)
                .sources(classOf[tzApplication])
                .web(WebApplicationType.SERVLET)
                .headless(true)
                .run(args:_*)
    }

//     def main(args: Array[String]): Unit = {
//        SpringApplication.run(classOf[AppConfig])
//    }


}
