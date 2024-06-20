package Jpet_Scenarios.SC01_Achat.Actions
import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object AF_Choix_Item {

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
  val Choix_Item: ChainBuilder =
    group("150_Choix_Item"){
      http("/actions/Catalog.action?viewItem=&itemId=EST-1")
        .get("/actions/Catalog.action?viewItem=&itemId=EST-1")
        .headers(headers_17)
        .resources(
          http("request_22:GET_https://petstore.octoperf.com/images/fish1.gif")
            .get("/images/fish1.gif")
            .headers(headers_2)
        )
    }
}
