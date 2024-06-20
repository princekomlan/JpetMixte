package Jpet_Scenarios.SC02_Recherche.Actions
import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef.http

object BC_Login {
  private val headers_19 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8",
    "Origin" -> "https://petstore.octoperf.com",
    "Sec-Fetch-Dest" -> "document",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "same-origin",
    "Sec-Fetch-User" -> "?1",
    "Upgrade-Insecure-Requests" -> "1"
  )
  val Login: ChainBuilder =
    group("220_Login"){
      http("request_19:POST_https://petstore.octoperf.com/actions/Account.action")
        .post("/actions/Account.action")
        .headers(headers_19)
        .formParam("username", "Test1")
        .formParam("password", "Test1")
        .formParam("signon", "Login")
        .formParam("_sourcePage", "pP4u_AI6j2bZTUAG1TbgfDEaAjbZqY3J95WRDD3aRN8chdJchdrlcpoa8bl-vsjXLQeIL72IA4q8cvWQmn6A78XlTmIqyLMP9U95Ah6t6Fk=")
        .formParam("__fp", "5xBWFSoAuH5zpg--AH0-Z-FIkEoYW7CKHP-P8T9IgZG3hstvYQbdTBuG5LMuOfgU")
    }

}
