package Jpet_Scenarios.SC02_Recherche.Actions
import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object BA_Acceuil {

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
  val Acceuil: ChainBuilder =
    group("200_Acceuil"){
      http("/actions/Catalog.action")
        .get("/actions/Catalog.action")
        .headers(headers_1)
        .resources(
          http("/css/jpetstore.css")
            .get("/css/jpetstore.css")
            .headers(headers_2),
          http("/images/sm_dogs.gif")
            .get("/images/sm_dogs.gif")
            .headers(headers_3),
          http("/images/splash.gif")
            .get("/images/splash.gif")
            .headers(headers_3),
          http("/images/sm_reptiles.gif")
            .get("/images/sm_reptiles.gif")
            .headers(headers_3),
          http("/images/cart.gif")
            .get("/images/cart.gif")
            .headers(headers_3),
          http("/images/separator.gif")
            .get("/images/separator.gif")
            .headers(headers_3),
          http("/images/sm_fish.gif")
            .get("/images/sm_fish.gif")
            .headers(headers_3),
          http("/images/sm_cats.gif")
            .get("/images/sm_cats.gif")
            .headers(headers_3),
          http("/images/logo-topbar.svg")
            .get("/images/logo-topbar.svg")
            .headers(headers_3),
          http("/images/sm_birds.gif")
            .get("/images/sm_birds.gif")
            .headers(headers_3),
          http("/images/dogs_icon.gif")
            .get("/images/dogs_icon.gif")
            .headers(headers_3),
          http("/images/cats_icon.gif")
            .get("/images/cats_icon.gif")
            .headers(headers_3),
          http("/images/fish_icon.gif")
            .get("/images/fish_icon.gif")
            .headers(headers_3),
          http("/images/reptiles_icon.gif")
            .get("/images/reptiles_icon.gif")
            .headers(headers_3),
          http("/images/birds_icon.gif")
            .get("/images/birds_icon.gif")
            .headers(headers_3),
          http("/favicon.ico")
            .get("/favicon.ico")
            .headers(headers_3)
            .check(status.is(404))
        )
    }


}
