package Jpet_Scenarios.SC02_Recherche.Actions
import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef.http

object BD_Recherche {
  private val headers_19 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8",
    "Origin" -> "https://petstore.octoperf.com",
    "Sec-Fetch-Dest" -> "document",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "same-origin",
    "Sec-Fetch-User" -> "?1",
    "Upgrade-Insecure-Requests" -> "1"
  )
  val Recherche: ChainBuilder =
    group("230_Recherche"){
      http("request_20:POST_https://petstore.octoperf.com/actions/Catalog.action")
        .post("/actions/Catalog.action")
        .headers(headers_19)
        .formParam("keyword", "Dogs")
        .formParam("searchProducts", "Search")
        .formParam("_sourcePage", "cAIInbf2c_dZvSPS0_nsbv0dVT3a9zL4A4PUvPqZZJ6mBpx_JXSLXMCNTVJCOnUVDD0cXNov6CjiRW31OZm2PZCv-rCkbs7x")
        .formParam("__fp", "1v9GBKZjw9LRS6EdsXFW4x1oemLog50bptpG4vc6kBfTMQid7xIFand5AG1kGk3X")
    }

}
