import io.gatling.core.Predef.Simulation
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef.http
import io.gatling.core.Predef._

import scala.concurrent.duration.DurationInt
import Jpet_Scenarios.SC01_Achat.P01_Achat
import Jpet_Scenarios.SC02_Recherche.P02_Recherche
class Mixte_10VU_10min extends Simulation {

  private val httpProtocol = http
    .baseUrl("https://petstore.octoperf.com")
    .inferHtmlResources()
    .acceptHeader("image/avif,image/webp,*/*")
    .acceptEncodingHeader("gzip, deflate, br")
    .acceptLanguageHeader("fr,fr-FR;q=0.8,en-US;q=0.5,en;q=0.3")
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:108.0) Gecko/20100101 Firefox/108.0")

     val SC01_Achat: ScenarioBuilder = scenario("SC01_Achat")
       .exec(P01_Achat.p01_Achat)
     val SC02_Recherche: ScenarioBuilder = scenario("SC02_Recherche")
       .exec(P02_Recherche.p02_Recherche)

     setUp(
           SC01_Achat.inject(
             rampConcurrentUsers(2).to(10).during(5.minutes),
             constantConcurrentUsers(10).during(10.minutes)
           ).protocols(httpProtocol),

           SC02_Recherche.inject(
             rampConcurrentUsers(2).to(10).during(5.minutes),
             constantConcurrentUsers(10).during(10.minutes)
           ).protocols(httpProtocol)

     ).maxDuration(15.minutes)

}
