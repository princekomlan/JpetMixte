package Jpet_Scenarios.SC01_Achat.Actions
import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object AB_Sigin {
  private val headers_17 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8",
    "Sec-Fetch-Dest" -> "document",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "same-origin",
    "Sec-Fetch-User" -> "?1",
    "Upgrade-Insecure-Requests" -> "1"
  )
  val Sigin: ChainBuilder =
    group("110_Sigin") {
      http("/actions/Account.action_jsessionid=D26BC82189EE2A97159FD798F798AA1A?signonForm=")
        .get("/actions/Account.action;jsessionid=D26BC82189EE2A97159FD798F798AA1A?signonForm=")
        .headers(headers_17)
    }
}
