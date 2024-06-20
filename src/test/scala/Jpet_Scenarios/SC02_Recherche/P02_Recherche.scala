package Jpet_Scenarios.SC02_Recherche
import Actions.{BA_Acceuil, BB_Sigin, BC_Login, BD_Recherche}
import io.gatling.core.structure.ChainBuilder
import io.gatling.core.Predef._

object P02_Recherche {
val p02_Recherche: ChainBuilder =
  exec(session => session)
    .exec(BA_Acceuil.Acceuil)
    .pause(1)
    .exec(BB_Sigin.Sigin)
    .pause(1)
    .exec(BC_Login.Login)
    .pause(1)
    .exec(BD_Recherche.Recherche)
    .pause(1)
}
