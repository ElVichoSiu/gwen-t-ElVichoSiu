package cl.uchile.dcc
package jugador

import cl.uchile.dcc.gwent.carta.ICarta
import cl.uchile.dcc.gwent.carta.cartaclima.classesclima.{ClimaDespejado, LluviaTorrencial}
import cl.uchile.dcc.gwent.carta.cartaunidad.classesunidad.{ADistancia, Asedio, CuerpoaCuerpo}
import cl.uchile.dcc.gwent.jugador.Jugador
import munit.FunSuite

class JugadorTest extends FunSuite {
  val name = "Geralt"
  val listvacia = List()
  var cartadistancia: ADistancia = _
  var cartacuerpoacuerpo: CuerpoaCuerpo = _
  var cartasedio: Asedio = _
  var cartaclimadespejado: ClimaDespejado = _
  var cartalluviatorrencial: LluviaTorrencial = _
  var deck: List[ICarta] = _
  var jugador: Jugador = _
  override def beforeEach(context: BeforeEach): Unit = {
    cartadistancia = new ADistancia("Arquero", "Unidad a distancia que posee 5 de strength", 5)
    cartacuerpoacuerpo = new CuerpoaCuerpo("Ghoul", "Unidad de combate cuerpo a cuerpo que posee 10 de strength", 10)
    cartasedio = new Asedio("Torre", "Unidad de asedio que posee 20 de strength", 20)
    cartaclimadespejado = new ClimaDespejado()
    cartalluviatorrencial = new LluviaTorrencial()
    deck = List(cartadistancia,cartacuerpoacuerpo,cartasedio,cartaclimadespejado,cartalluviatorrencial)
    jugador = new Jugador(name, deck)
  }
  test("Jugador can be created with a name, a deck, gems, a hand, a caczone, a adistanciazone, a asediozone") {
    assertEquals(jugador.name, name)
    assertEquals(jugador.deck, deck)
    assertEquals(jugador.gems, 2)
    assertEquals(jugador.hand, listvacia)
    assertEquals(jugador.caczone, listvacia)
    assertEquals(jugador.adistanciazone, listvacia)
    assertEquals(jugador.asediozone, listvacia)
  }

}
