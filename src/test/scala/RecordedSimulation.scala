package io.gatling.demo

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation extends Simulation {

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


  private val scn = scenario("RecordedSimulation")
    .exec(
      // Acceuil,
      http("request_0")
        .get("/actions/Catalog.action")
        .headers(headers_0)
        .check(bodyBytes.is(RawFileBody("io/gatling/demo/recordedsimulation/0000_response.html")))
        .resources(
          http("request_1")
            .get("/css/jpetstore.css")
            .headers(headers_1)
            .check(bodyBytes.is(RawFileBody("io/gatling/demo/recordedsimulation/0001_response.css"))),
          http("request_2")
            .get("/images/sm_reptiles.gif")
            .headers(headers_2)
            .check(bodyBytes.is(RawFileBody("io/gatling/demo/recordedsimulation/0002_response.gif"))),
          http("request_3")
            .get("/images/reptiles_icon.gif")
            .headers(headers_2)
            .check(bodyBytes.is(RawFileBody("io/gatling/demo/recordedsimulation/0003_response.gif"))),
          http("request_4")
            .get("/images/cart.gif")
            .headers(headers_2)
            .check(bodyBytes.is(RawFileBody("io/gatling/demo/recordedsimulation/0004_response.gif"))),
          http("request_5")
            .get("/images/sm_dogs.gif")
            .headers(headers_2)
            .check(bodyBytes.is(RawFileBody("io/gatling/demo/recordedsimulation/0005_response.gif"))),
          http("request_6")
            .get("/images/birds_icon.gif")
            .headers(headers_2)
            .check(bodyBytes.is(RawFileBody("io/gatling/demo/recordedsimulation/0006_response.gif"))),
          http("request_7")
            .get("/images/logo-topbar.svg")
            .headers(headers_2)
            .check(bodyBytes.is(RawFileBody("io/gatling/demo/recordedsimulation/0007_response.svg"))),
          http("request_8")
            .get("/images/sm_cats.gif")
            .headers(headers_2)
            .check(bodyBytes.is(RawFileBody("io/gatling/demo/recordedsimulation/0008_response.gif"))),
          http("request_9")
            .get("/images/splash.gif")
            .headers(headers_2)
            .check(bodyBytes.is(RawFileBody("io/gatling/demo/recordedsimulation/0009_response.gif"))),
          http("request_10")
            .get("/images/sm_birds.gif")
            .headers(headers_2)
            .check(bodyBytes.is(RawFileBody("io/gatling/demo/recordedsimulation/0010_response.gif"))),
          http("request_11")
            .get("/images/fish_icon.gif")
            .headers(headers_2)
            .check(bodyBytes.is(RawFileBody("io/gatling/demo/recordedsimulation/0011_response.gif"))),
          http("request_12")
            .get("/images/separator.gif")
            .headers(headers_2)
            .check(bodyBytes.is(RawFileBody("io/gatling/demo/recordedsimulation/0012_response.gif"))),
          http("request_13")
            .get("/images/dogs_icon.gif")
            .headers(headers_2)
            .check(bodyBytes.is(RawFileBody("io/gatling/demo/recordedsimulation/0013_response.gif"))),
          http("request_14")
            .get("/images/sm_fish.gif")
            .headers(headers_2)
            .check(bodyBytes.is(RawFileBody("io/gatling/demo/recordedsimulation/0014_response.gif"))),
          http("request_15")
            .get("/images/cats_icon.gif")
            .headers(headers_2)
            .check(bodyBytes.is(RawFileBody("io/gatling/demo/recordedsimulation/0015_response.gif"))),
          http("request_16")
            .get("/favicon.ico")
            .headers(headers_2)
            .check(status.is(404))
            .check(bodyBytes.is(RawFileBody("io/gatling/demo/recordedsimulation/0016_response.html")))
        ),
      pause(21),
      // Sigin In,
      http("request_17")
        .get("/actions/Account.action;jsessionid=5F75BF9D3D111D1E711BFFF0C5B07D23?signonForm=")
        .headers(headers_17)
        .check(bodyBytes.is(RawFileBody("io/gatling/demo/recordedsimulation/0017_response.html"))),
      pause(21),
      // Login,
      http("request_18")
        .post("/actions/Account.action")
        .headers(headers_18)
        .formParam("username", "Test1")
        .formParam("password", "Test1")
        .formParam("signon", "Login")
        .formParam("_sourcePage", "_aMULwcD1R7UEfOyWAxNm5i1bjlCm89y2qQgrhSI0mFkiaimgaFj214nNFmNcmowdwmNmM9O8vQUN1AtseaBLnJBBbCPO2PnFKjHRjG8p7E=")
        .formParam("__fp", "MTO1qI6RPjmY4lcHD7F2yrHsqoaAHaLJKBlMEtlr68Baih3phkMmgx5BEzTxhJmz"),
      pause(19),
      // Choix_Animaux,
      http("request_19")
        .get("/actions/Catalog.action?viewCategory=&categoryId=FISH")
        .headers(headers_17)
        .check(bodyBytes.is(RawFileBody("io/gatling/demo/recordedsimulation/0019_response.html"))),
      pause(15),
      // Choix_Produit,
      http("request_20")
        .get("/actions/Catalog.action?viewProduct=&productId=FI-SW-01")
        .headers(headers_17)
        .check(bodyBytes.is(RawFileBody("io/gatling/demo/recordedsimulation/0020_response.html"))),
      pause(15),
      // Choix_Item,
      http("request_21")
        .get("/actions/Catalog.action?viewItem=&itemId=EST-1")
        .headers(headers_17)
        .check(bodyBytes.is(RawFileBody("io/gatling/demo/recordedsimulation/0021_response.html")))
        .resources(
          http("request_22")
            .get("/images/fish1.gif")
            .headers(headers_2)
            .check(bodyBytes.is(RawFileBody("io/gatling/demo/recordedsimulation/0022_response.gif")))
        ),
      pause(12),
      // Add_Cart,
      http("request_23")
        .get("/actions/Cart.action?addItemToCart=&workingItemId=EST-1")
        .headers(headers_17)
        .check(bodyBytes.is(RawFileBody("io/gatling/demo/recordedsimulation/0023_response.html"))),
      pause(21),
      // Checkout,
      http("request_24")
        .get("/actions/Order.action?newOrderForm=")
        .headers(headers_17)
        .check(bodyBytes.is(RawFileBody("io/gatling/demo/recordedsimulation/0024_response.html"))),
      pause(11),
      // Continue,
      http("request_25")
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
        .formParam("_sourcePage", "6QdcYZiKctVdVqNofHk2o__eDpDRYMRgSoBqbrmxLmxKnOJiu1M41E-TdHF5reX5q64eFuiOwgoIB5hwIIcCR7s2KMM-S2GtyD9qRjXlnDA=")
        .formParam("__fp", "fdaYO-8_mFHmLOxTp4LfCjlv-XQvKzStM6sZQAxTaHx-CNG0Q6Aga5bZpc06tY6Z7i2c7WES_EQ1Okculx3h7ZJ_CeQw2FFxOCliKUhyhCLiZaZ-AR6m9g==")
        .check(bodyBytes.is(RawFileBody("io/gatling/demo/recordedsimulation/0025_response.html"))),
      pause(9),
      // Confirm,
      http("request_26")
        .get("/actions/Order.action?newOrder=&confirmed=true")
        .headers(headers_17)
        .check(bodyBytes.is(RawFileBody("io/gatling/demo/recordedsimulation/0026_response.html"))),
      pause(11),
      // ReturnMenu,
      http("request_27")
        .get("/actions/Catalog.action")
        .headers(headers_17)
        .check(bodyBytes.is(RawFileBody("io/gatling/demo/recordedsimulation/0027_response.html")))
    )

	//setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
