package Jpet_Scenarios.SC01_Achat.Actions
import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object AD_Choix_Animal {
  private val headers_17 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8",
    "Sec-Fetch-Dest" -> "document",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "same-origin",
    "Sec-Fetch-User" -> "?1",
    "Upgrade-Insecure-Requests" -> "1"
  )

  val Choix_Animal: ChainBuilder =
    group("130_Choix_Animal"){
      http("/actions/Catalog.action?viewCategory=&categoryId=FISH")
        .get("/actions/Catalog.action?viewCategory=&categoryId=FISH")
        .headers(headers_17)
    }
}
