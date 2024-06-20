package Jpet_Scenarios.SC01_Achat.Actions
import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef.http

object AJ_Confirm {
  private val headers_17 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8",
    "Sec-Fetch-Dest" -> "document",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "same-origin",
    "Sec-Fetch-User" -> "?1",
    "Upgrade-Insecure-Requests" -> "1"
  )
  val Confirm: ChainBuilder =
    group("190_Confirm"){
      http("/actions/Order.action?newOrder=&confirmed=true")
        .get("/actions/Order.action?newOrder=&confirmed=true")
        .headers(headers_17)
    }
}
