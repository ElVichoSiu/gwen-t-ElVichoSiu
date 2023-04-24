package cl.uchile.dcc
package jugador

import cl.uchile.dcc.gwent.jugador.Jugador
import cl.uchile.dcc.gwent.carta.Carta
import munit.FunSuite

class JugadorTest extends FunSuite {
  val name = "Geralt"
  val deck = Array[Carta]
  var Jugador: Jugador = _
  override def beforeEach(context: BeforeEach): Unit = {
    Jugador = new Jugador(name, deck)
  }
  test("Jugador tiene nombre") {
    assertEquals(Jugador.name, name)
  }
  test("Jugador tiene mazo") {
    assertEquals(Jugador.deck, deck)
  }

}
