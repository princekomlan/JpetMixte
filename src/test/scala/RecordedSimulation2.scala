package io.gatling.demo

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation2 extends Simulation {

  private val httpProtocol = http
    .baseUrl("https://petstore.octoperf.com")
    .inferHtmlResources()
    .acceptHeader("image/avif,image/webp,*/*")
    .acceptEncodingHeader("gzip, deflate, br")
    .acceptLanguageHeader("fr,fr-FR;q=0.8,en-US;q=0.5,en;q=0.3")
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:108.0) Gecko/20100101 Firefox/108.0")
  
  private val headers_0 = Map(
  		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8",
  		"Sec-Fetch-Dest" -> "document",
  		"Sec-Fetch-Mode" -> "navigate",
  		"Sec-Fetch-Site" -> "none",
  		"Sec-Fetch-User" -> "?1",
  		"Upgrade-Insecure-Requests" -> "1"
  )
  
  private val headers_1 = Map(
  		"Accept" -> "text/css,*/*;q=0.1",
  		"Sec-Fetch-Dest" -> "style",
  		"Sec-Fetch-Mode" -> "no-cors",
  		"Sec-Fetch-Site" -> "same-origin"
  )
  
  private val headers_2 = Map(
  		"Sec-Fetch-Dest" -> "image",
  		"Sec-Fetch-Mode" -> "no-cors",
  		"Sec-Fetch-Site" -> "same-origin"
  )
  
  private val headers_17 = Map(
  		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8",
  		"Sec-Fetch-Dest" -> "document",
  		"Sec-Fetch-Mode" -> "navigate",
  		"Sec-Fetch-Site" -> "same-origin",
  		"Sec-Fetch-User" -> "?1",
  		"Upgrade-Insecure-Requests" -> "1"
  )
  
  private val headers_18 = Map(
  		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8",
  		"Origin" -> "https://petstore.octoperf.com",
  		"Sec-Fetch-Dest" -> "document",
  		"Sec-Fetch-Mode" -> "navigate",
  		"Sec-Fetch-Site" -> "same-origin",
  		"Sec-Fetch-User" -> "?1",
  		"Upgrade-Insecure-Requests" -> "1"
  )


  private val scn = scenario("RecordedSimulation2")
    .exec(
      // Acceuil,
      http("request_0:GET_https://petstore.octoperf.com/actions/Catalog.action")
        .get("/actions/Catalog.action")
        .headers(headers_0)
        .resources(
          http("request_1:GET_https://petstore.octoperf.com/css/jpetstore.css")
            .get("/css/jpetstore.css")
            .headers(headers_1),
          http("request_2:GET_https://petstore.octoperf.com/images/sm_reptiles.gif")
            .get("/images/sm_reptiles.gif")
            .headers(headers_2),
          http("request_3:GET_https://petstore.octoperf.com/images/splash.gif")
            .get("/images/splash.gif")
            .headers(headers_2),
          http("request_4:GET_https://petstore.octoperf.com/images/sm_fish.gif")
            .get("/images/sm_fish.gif")
            .headers(headers_2),
          http("request_5:GET_https://petstore.octoperf.com/images/sm_dogs.gif")
            .get("/images/sm_dogs.gif")
            .headers(headers_2),
          http("request_6:GET_https://petstore.octoperf.com/images/cart.gif")
            .get("/images/cart.gif")
            .headers(headers_2),
          http("request_7:GET_https://petstore.octoperf.com/images/separator.gif")
            .get("/images/separator.gif")
            .headers(headers_2),
          http("request_8:GET_https://petstore.octoperf.com/images/logo-topbar.svg")
            .get("/images/logo-topbar.svg")
            .headers(headers_2),
          http("request_9:GET_https://petstore.octoperf.com/images/sm_cats.gif")
            .get("/images/sm_cats.gif")
            .headers(headers_2),
          http("request_10:GET_https://petstore.octoperf.com/images/sm_birds.gif")
            .get("/images/sm_birds.gif")
            .headers(headers_2),
          http("request_11:GET_https://petstore.octoperf.com/images/fish_icon.gif")
            .get("/images/fish_icon.gif")
            .headers(headers_2),
          http("request_12:GET_https://petstore.octoperf.com/images/cats_icon.gif")
            .get("/images/cats_icon.gif")
            .headers(headers_2),
          http("request_13:GET_https://petstore.octoperf.com/images/dogs_icon.gif")
            .get("/images/dogs_icon.gif")
            .headers(headers_2),
          http("request_14:GET_https://petstore.octoperf.com/images/reptiles_icon.gif")
            .get("/images/reptiles_icon.gif")
            .headers(headers_2),
          http("request_15:GET_https://petstore.octoperf.com/images/birds_icon.gif")
            .get("/images/birds_icon.gif")
            .headers(headers_2),
          http("request_16:GET_https://petstore.octoperf.com/favicon.ico")
            .get("/favicon.ico")
            .headers(headers_2)
            .check(status.is(404))
        ),
      pause(11),
      // Sigin,
      http("request_17:GET_https://petstore.octoperf.com/actions/Account.action_jsessionid=D26BC82189EE2A97159FD798F798AA1A?signonForm=")
        .get("/actions/Account.action;jsessionid=D26BC82189EE2A97159FD798F798AA1A?signonForm=")
        .headers(headers_17),
      pause(25),
      // Login,
      http("request_18:POST_https://petstore.octoperf.com/actions/Account.action")
        .post("/actions/Account.action")
        .headers(headers_18)
        .formParam("username", "Test1")
        .formParam("password", "Test1")
        .formParam("signon", "Login")
        .formParam("_sourcePage", "sLUQxaMf3IuNS_6QjE9HghFvXUrb8o4QCA29Zsu3gjyH_z3qDUo7ZA7cu2jxBCOcpKMI8o12yO4cKsK-zv9xVbFanqYwNeMfv7wEDCg8mIY=")
        .formParam("__fp", "6cpR8Axe0mGXE2XfsTigWkMv4KBagmqMPsLBPoIwp6r18-tcp_uHolK2-SdgBLIh"),
      pause(17),
      // Choix_Animal,
      http("request_19:GET_https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=FISH")
        .get("/actions/Catalog.action?viewCategory=&categoryId=FISH")
        .headers(headers_17),
      pause(10),
      // Choix_Race,
      http("request_20:GET_https://petstore.octoperf.com/actions/Catalog.action?viewProduct=&productId=FI-SW-01")
        .get("/actions/Catalog.action?viewProduct=&productId=FI-SW-01")
        .headers(headers_17),
      pause(10),
      // Choix_Item,
      http("request_21:GET_https://petstore.octoperf.com/actions/Catalog.action?viewItem=&itemId=EST-1")
        .get("/actions/Catalog.action?viewItem=&itemId=EST-1")
        .headers(headers_17)
        .resources(
          http("request_22:GET_https://petstore.octoperf.com/images/fish1.gif")
            .get("/images/fish1.gif")
            .headers(headers_2)
        ),
      pause(8),
      // Add_Cart,
      http("request_23:GET_https://petstore.octoperf.com/actions/Cart.action?addItemToCart=&workingItemId=EST-1")
        .get("/actions/Cart.action?addItemToCart=&workingItemId=EST-1")
        .headers(headers_17),
      pause(9),
      // Checkout,
      http("request_24:GET_https://petstore.octoperf.com/actions/Order.action?newOrderForm=")
        .get("/actions/Order.action?newOrderForm=")
        .headers(headers_17),
      pause(7),
      // Continue,
      http("request_25:POST_https://petstore.octoperf.com/actions/Order.action")
        .post("/actions/Order.action")
        .headers(headers_18)
        .formParam("order.cardType", "Visa")
        .formParam("order.creditCard", "999 9999 9999 9999")
        .formParam("order.expiryDate", "12/03")
        .formParam("order.billToFirstName", "Test1")
        .formParam("order.billToLastName", "Test1")
        .formParam("order.billAddress1", "Test1")
        .formParam("order.billAddress2", "Test1")
        .formParam("order.billCity", "Test1")
        .formParam("order.billState", "Test1")
        .formParam("order.billZip", "1")
        .formParam("order.billCountry", "Test1")
        .formParam("newOrder", "Continue")
        .formParam("_sourcePage", "Oxa1l8JDsGk9iB8652xtMYBJrSr4ksR8sTrm3pHVPgxcHtMTBkjdpWc_lz2bXy4Heux1z5PwILanfProCOjLd8HKP0pcRDdJRz3mE7pdKqM=")
        .formParam("__fp", "T6J7BLt47griT2GOq6mM5JMjN4fCBMQFxtPKLxuwlDgA-xFgcCNh52BX9ervnTigVtOeVdK9leqVinpyVMD0lb6Np6614EYyWYT4Qx2ctWliuID6jWqFJg=="),
      pause(7),
      // Confirm,
      http("request_26:GET_https://petstore.octoperf.com/actions/Order.action?newOrder=&confirmed=true")
        .get("/actions/Order.action?newOrder=&confirmed=true")
        .headers(headers_17),
      pause(8),
      // ReturnMenu,
      http("request_27:GET_https://petstore.octoperf.com/actions/Catalog.action")
        .get("/actions/Catalog.action")
        .headers(headers_17)
    )

	//setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
