package Validation
import io.gatling.core.Predef.Simulation
import io.gatling.http.Predef.http
import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder


class SC01_Achat extends Simulation {

    private val httpProtocol = http
      .baseUrl("https://petstore.octoperf.com")
      .inferHtmlResources()
      .acceptHeader("image/avif,image/webp,*/*")
      .acceptEncodingHeader("gzip, deflate, br")
      .acceptLanguageHeader("fr,fr-FR;q=0.8,en-US;q=0.5,en;q=0.3")
      .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:108.0) Gecko/20100101 Firefox/108.0")


  object Test {
    val SC01_Achat: ScenarioBuilder = scenario("SC01_Achat")
        .exec(Jpet_Scenarios.SC01_Achat.P01_Achat.p01_Achat)
  }
setUp(Test.SC01_Achat.inject(atOnceUsers(1))).protocols(httpProtocol)
}
