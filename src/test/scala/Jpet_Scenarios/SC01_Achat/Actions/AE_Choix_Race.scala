package Jpet_Scenarios.SC01_Achat.Actions
import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object AE_Choix_Race {
  private val headers_17 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8",
    "Sec-Fetch-Dest" -> "document",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "same-origin",
    "Sec-Fetch-User" -> "?1",
    "Upgrade-Insecure-Requests" -> "1"
  )
  val Choix_Race: ChainBuilder =
    group("140_Choix_Race"){
      http("/actions/Catalog.action?viewProduct=&productId=FI-SW-01")
        .get("/actions/Catalog.action?viewProduct=&productId=FI-SW-01")
        .headers(headers_17)
    }
}
