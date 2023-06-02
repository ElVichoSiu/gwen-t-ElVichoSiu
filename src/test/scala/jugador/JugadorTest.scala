package cl.uchile.dcc
package jugador

import cl.uchile.dcc.gwent.carta.ICarta
import cl.uchile.dcc.gwent.carta.cartaclima.classesclima.{ClimaDespejado, LluviaTorrencial}
import cl.uchile.dcc.gwent.carta.cartaunidad.classesunidad.{ADistancia, Asedio, CuerpoaCuerpo}
import cl.uchile.dcc.gwent.jugador.Jugador
import munit.FunSuite

class JugadorTest extends FunSuite {
  var cartadistancia: ADistancia = _
  var cartacuerpoacuerpo: CuerpoaCuerpo = _
  var cartasedio: Asedio = _
  var cartaclimadespejado: ClimaDespejado = _
  var cartalluviatorrencial: LluviaTorrencial = _
  val name = "Geralt"
  var handi: List[ICarta] = _
  var adistanciazonei: List[ADistancia] = _
  var asediozonei: List[Asedio] = _
  var caczonei: List[CuerpoaCuerpo] = _
  var deck: List[ICarta] = _
  var jugador: Jugador = _
  override def beforeEach(context: BeforeEach): Unit = {
    cartadistancia = new ADistancia("Arquero", "Unidad a distancia que posee 5 de strength", 5)
    cartacuerpoacuerpo = new CuerpoaCuerpo("Ghoul", "Unidad de combate cuerpo a cuerpo que posee 10 de strength", 10)
    cartasedio = new Asedio("Torre", "Unidad de asedio que posee 20 de strength", 20)
    cartaclimadespejado = new ClimaDespejado()
    cartalluviatorrencial = new LluviaTorrencial()
    handi = List()
    adistanciazonei = List()
    asediozonei = List()
    caczonei = List()
    deck = List(cartadistancia,cartacuerpoacuerpo,cartasedio,cartaclimadespejado,cartalluviatorrencial)
    jugador = new Jugador(name, deck)
  }

  test("Jugador can be created with a name, a deck, gems, a hand, a caczone, a adistanciazone, a asediozone") {
    assertEquals(jugador.name, name)
    assertEquals(jugador.deck, deck)
    assertEquals(jugador.gems, 2)
    assertEquals(jugador.hand, handi)
    assertEquals(jugador.adistanciazone, adistanciazonei)
    assertEquals(jugador.asediozone, asediozonei)
    assertEquals(jugador.caczone, caczonei)
  }

  test("Jugador is able to shuffle the deck") {
    assertEquals(jugador.deck, deck)
    jugador.shuffleDeck()
    assertNotEquals(jugador.deck, deck)
  }

  test("Jugador is able to draw a carta from the deck") {
    assertEquals(jugador.hand, handi)
    assertEquals(jugador.deck, deck)
    jugador.drawCarta()
    assertNotEquals (jugador.hand, handi)
    assertNotEquals(jugador.deck, deck)
  }

  test("Jugador is able to play") {

  }

}
