package Jpet_Scenarios.SC01_Achat
import Actions.{AA_Acceuil, AB_Sigin, AC_Login, AD_Choix_Animal, AE_Choix_Race, AF_Choix_Item, AG_Add_Cart, AH_Checkout, AI_Continue, AJ_Confirm}
import io.gatling.core.structure.ChainBuilder
import io.gatling.core.Predef._

object P01_Achat {
  var p01_Achat: ChainBuilder = {
    exec(session => session)
      .exec(AA_Acceuil.Acceuil)
      .pause(1)
      .exec(AB_Sigin.Sigin)
       .pause(1)
      .exec(AC_Login.Login)
      .pause(1)
      .exec(AD_Choix_Animal.Choix_Animal)
      .pause(1)
      .exec(AE_Choix_Race.Choix_Race)
      .pause(1)
      .exec(AF_Choix_Item.Choix_Item)
      .pause(1)
      .exec(AG_Add_Cart.Add_Cart)
      .pause(1)
      .exec(AH_Checkout.Checkout)
      .pause(1)
      .exec(AI_Continue.Continue)
      .pause(1)
      .exec(AJ_Confirm.Confirm)
      .pause(1)
  }
}
