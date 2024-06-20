package Jpet_Scenarios.SC02_Recherche.Actions
import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef.http

object BB_Sigin {
  private val headers_18 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8",
    "Sec-Fetch-Dest" -> "document",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "same-origin",
    "Sec-Fetch-User" -> "?1",
    "Upgrade-Insecure-Requests" -> "1"
  )
  val Sigin: ChainBuilder =
    group("210_Sigin"){
      http("/actions/Account.action_jsessionid=CBEA3AE779C630EC9CD2A4F05E1F8CA0?signonForm=")
        .get("/actions/Account.action;jsessionid=CBEA3AE779C630EC9CD2A4F05E1F8CA0?signonForm=")
        .headers(headers_18)
    }
}
