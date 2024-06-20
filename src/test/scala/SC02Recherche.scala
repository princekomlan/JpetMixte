package io.gatling.demo

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class SC02Recherche extends Simulation {

  private val httpProtocol = http
    .baseUrl("https://petstore.octoperf.com")
    .inferHtmlResources()
    .acceptHeader("image/avif,image/webp,*/*")
    .acceptEncodingHeader("gzip, deflate, br")
    .acceptLanguageHeader("fr,fr-FR;q=0.8,en-US;q=0.5,en;q=0.3")
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:108.0) Gecko/20100101 Firefox/108.0")
  
  private val headers_0 = Map(
  		"Accept" -> "*/*",
  		"Accept-Encoding" -> "gzip, deflate",
  		"Cache-Control" -> "no-cache",
  		"Content-Type" -> "application/ocsp-request",
  		"Pragma" -> "no-cache"
  )
  
  private val headers_1 = Map(
  		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8",
  		"Sec-Fetch-Dest" -> "document",
  		"Sec-Fetch-Mode" -> "navigate",
  		"Sec-Fetch-Site" -> "none",
  		"Sec-Fetch-User" -> "?1",
  		"Upgrade-Insecure-Requests" -> "1"
  )
  
  private val headers_2 = Map(
  		"Accept" -> "text/css,*/*;q=0.1",
  		"Sec-Fetch-Dest" -> "style",
  		"Sec-Fetch-Mode" -> "no-cors",
  		"Sec-Fetch-Site" -> "same-origin"
  )
  
  private val headers_3 = Map(
  		"Sec-Fetch-Dest" -> "image",
  		"Sec-Fetch-Mode" -> "no-cors",
  		"Sec-Fetch-Site" -> "same-origin"
  )
  
  private val headers_18 = Map(
  		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8",
  		"Sec-Fetch-Dest" -> "document",
  		"Sec-Fetch-Mode" -> "navigate",
  		"Sec-Fetch-Site" -> "same-origin",
  		"Sec-Fetch-User" -> "?1",
  		"Upgrade-Insecure-Requests" -> "1"
  )
  
  private val headers_19 = Map(
  		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8",
  		"Origin" -> "https://petstore.octoperf.com",
  		"Sec-Fetch-Dest" -> "document",
  		"Sec-Fetch-Mode" -> "navigate",
  		"Sec-Fetch-Site" -> "same-origin",
  		"Sec-Fetch-User" -> "?1",
  		"Upgrade-Insecure-Requests" -> "1"
  )
  


  private val scn = scenario("SC02Recherche")
    .exec(
      http("request_0:POST_http://r10.o.lencr.org/")
        .post("/")
        .headers(headers_0)
        .body(RawFileBody("io/gatling/demo/sc02recherche/0000_request.dat")),
      pause(11),
      // Acceuil,
      http("request_1:GET_https://petstore.octoperf.com/actions/Catalog.action")
        .get("/actions/Catalog.action")
        .headers(headers_1)
        .resources(
          http("request_2:GET_https://petstore.octoperf.com/css/jpetstore.css")
            .get("/css/jpetstore.css")
            .headers(headers_2),
          http("request_3:GET_https://petstore.octoperf.com/images/sm_dogs.gif")
            .get("/images/sm_dogs.gif")
            .headers(headers_3),
          http("request_4:GET_https://petstore.octoperf.com/images/splash.gif")
            .get("/images/splash.gif")
            .headers(headers_3),
          http("request_5:GET_https://petstore.octoperf.com/images/sm_reptiles.gif")
            .get("/images/sm_reptiles.gif")
            .headers(headers_3),
          http("request_6:GET_https://petstore.octoperf.com/images/cart.gif")
            .get("/images/cart.gif")
            .headers(headers_3),
          http("request_7:GET_https://petstore.octoperf.com/images/separator.gif")
            .get("/images/separator.gif")
            .headers(headers_3),
          http("request_8:GET_https://petstore.octoperf.com/images/sm_fish.gif")
            .get("/images/sm_fish.gif")
            .headers(headers_3),
          http("request_9:GET_https://petstore.octoperf.com/images/sm_cats.gif")
            .get("/images/sm_cats.gif")
            .headers(headers_3),
          http("request_10:GET_https://petstore.octoperf.com/images/logo-topbar.svg")
            .get("/images/logo-topbar.svg")
            .headers(headers_3),
          http("request_11:GET_https://petstore.octoperf.com/images/sm_birds.gif")
            .get("/images/sm_birds.gif")
            .headers(headers_3),
          http("request_12:GET_https://petstore.octoperf.com/images/dogs_icon.gif")
            .get("/images/dogs_icon.gif")
            .headers(headers_3),
          http("request_13:GET_https://petstore.octoperf.com/images/cats_icon.gif")
            .get("/images/cats_icon.gif")
            .headers(headers_3),
          http("request_14:GET_https://petstore.octoperf.com/images/fish_icon.gif")
            .get("/images/fish_icon.gif")
            .headers(headers_3),
          http("request_15:GET_https://petstore.octoperf.com/images/reptiles_icon.gif")
            .get("/images/reptiles_icon.gif")
            .headers(headers_3),
          http("request_16:GET_https://petstore.octoperf.com/images/birds_icon.gif")
            .get("/images/birds_icon.gif")
            .headers(headers_3),
          http("request_17:GET_https://petstore.octoperf.com/favicon.ico")
            .get("/favicon.ico")
            .headers(headers_3)
            .check(status.is(404))
        ),
      pause(9),
      // Sigin,
      http("request_18:GET_https://petstore.octoperf.com/actions/Account.action_jsessionid=CBEA3AE779C630EC9CD2A4F05E1F8CA0?signonForm=")
        .get("/actions/Account.action;jsessionid=CBEA3AE779C630EC9CD2A4F05E1F8CA0?signonForm=")
        .headers(headers_18),
      pause(25),
      // Login,
      http("request_19:POST_https://petstore.octoperf.com/actions/Account.action")
        .post("/actions/Account.action")
        .headers(headers_19)
        .formParam("username", "Test1")
        .formParam("password", "Test1")
        .formParam("signon", "Login")
        .formParam("_sourcePage", "pP4u_AI6j2bZTUAG1TbgfDEaAjbZqY3J95WRDD3aRN8chdJchdrlcpoa8bl-vsjXLQeIL72IA4q8cvWQmn6A78XlTmIqyLMP9U95Ah6t6Fk=")
        .formParam("__fp", "5xBWFSoAuH5zpg--AH0-Z-FIkEoYW7CKHP-P8T9IgZG3hstvYQbdTBuG5LMuOfgU"),
      pause(31),
      // Recherche_Dogs,
      http("request_20:POST_https://petstore.octoperf.com/actions/Catalog.action")
        .post("/actions/Catalog.action")
        .headers(headers_19)
        .formParam("keyword", "Dogs")
        .formParam("searchProducts", "Search")
        .formParam("_sourcePage", "cAIInbf2c_dZvSPS0_nsbv0dVT3a9zL4A4PUvPqZZJ6mBpx_JXSLXMCNTVJCOnUVDD0cXNov6CjiRW31OZm2PZCv-rCkbs7x")
        .formParam("__fp", "1v9GBKZjw9LRS6EdsXFW4x1oemLog50bptpG4vc6kBfTMQid7xIFand5AG1kGk3X"),
      pause(66),
      // Recherche_Cats,
      http("request_21:POST_https://petstore.octoperf.com/actions/Catalog.action")
        .post("/actions/Catalog.action")
        .headers(headers_19)
        .formParam("keyword", "Cats")
        .formParam("searchProducts", "Search")
        .formParam("_sourcePage", "_9DYDr3LUcYgGO1b4am-ngNcuK-DGPcwINz6OAcSMtMdsq2M2aOXI7tPc6AN1hhBWbAKXFC33F7TtAv7Jg36n0-UmHT58Gy7nzI_PDnVqiM=")
        .formParam("__fp", "PJxYxd2JT50mFI5mVodBcyr3fNVq30NnH0a7PUyAwgvzsccDmEwFOXRP2lQWZgjq"),
      pause(15),
      http("request_22:GET_https://petstore.octoperf.com/actions/Catalog.action")
        .get("/actions/Catalog.action")
        .headers(headers_18)
    )

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
