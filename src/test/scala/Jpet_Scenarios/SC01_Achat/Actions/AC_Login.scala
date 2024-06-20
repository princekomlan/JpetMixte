package Jpet_Scenarios.SC01_Achat.Actions
import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef.http

object AC_Login {
  private val headers_18 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8",
    "Origin" -> "https://petstore.octoperf.com",
    "Sec-Fetch-Dest" -> "document",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "same-origin",
    "Sec-Fetch-User" -> "?1",
    "Upgrade-Insecure-Requests" -> "1"
  )
  val Login: ChainBuilder =
    group("120_Login"){
      http("/actions/Account.action")
        .post("/actions/Account.action")
        .headers(headers_18)
        .formParam("username", "Test1")
        .formParam("password", "Test1")
        .formParam("signon", "Login")
        .formParam("_sourcePage", "sLUQxaMf3IuNS_6QjE9HghFvXUrb8o4QCA29Zsu3gjyH_z3qDUo7ZA7cu2jxBCOcpKMI8o12yO4cKsK-zv9xVbFanqYwNeMfv7wEDCg8mIY=")
        .formParam("__fp", "6cpR8Axe0mGXE2XfsTigWkMv4KBagmqMPsLBPoIwp6r18-tcp_uHolK2-SdgBLIh")
    }
}
