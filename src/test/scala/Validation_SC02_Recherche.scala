package Validation
import io.gatling.core.Predef.Simulation
import io.gatling.http.Predef.http
import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder


class SC02_Recherche extends Simulation {

  private val httpProtocol = http
    .baseUrl("https://petstore.octoperf.com")
    .inferHtmlResources()
    .acceptHeader("image/avif,image/webp,*/*")
    .acceptEncodingHeader("gzip, deflate, br")
    .acceptLanguageHeader("fr,fr-FR;q=0.8,en-US;q=0.5,en;q=0.3")
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:108.0) Gecko/20100101 Firefox/108.0")


  object Test {
    val SC02_Recherche: ScenarioBuilder = scenario("SC02_Recherche")
      .exec(Jpet_Scenarios.SC02_Recherche.P02_Recherche.p02_Recherche)
  }
  setUp(Test.SC02_Recherche.inject(atOnceUsers(1))).protocols(httpProtocol)
}