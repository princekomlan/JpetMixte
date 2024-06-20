package Jpet_Scenarios.SC01_Achat.Actions
import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object AI_Continue {
  private val headers_18 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8",
    "Origin" -> "https://petstore.octoperf.com",
    "Sec-Fetch-Dest" -> "document",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "same-origin",
    "Sec-Fetch-User" -> "?1",
    "Upgrade-Insecure-Requests" -> "1"
  )
  val Continue: ChainBuilder =
    group("180_Continue"){
      http("/actions/Order.action")
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
        .formParam("_sourcePage", "Oxa1l8JDsGk9iB8652xtMYBJrSr4ksR8sTrm3pHVPgxcHtMTBkjdpWc_lz2bXy4Heux1z5PwILanfProCOjLd8HKP0pcRDdJRz3mE7pdKqM=")
        .formParam("__fp", "T6J7BLt47griT2GOq6mM5JMjN4fCBMQFxtPKLxuwlDgA-xFgcCNh52BX9ervnTigVtOeVdK9leqVinpyVMD0lb6Np6614EYyWYT4Qx2ctWliuID6jWqFJg==")
    }

}
