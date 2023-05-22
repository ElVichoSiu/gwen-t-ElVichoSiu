package cl.uchile.dcc
package jugador

import cl.uchile.dcc.gwent.carta.ICarta
import cl.uchile.dcc.gwent.carta.cartaunidad.classesunidad.ADistancia
import cl.uchile.dcc.gwent.jugador.Jugador
import munit.FunSuite

class JugadorTest extends FunSuite {
  test("Jugador has a name, a deck and gems") {
    val cartadistancia = new ADistancia(name = "Arquero", description = "Unidad a distancia que posee 5 de strength", strength = 5)
    val jugador = Jugador("Geralt", List(cartadistancia), 2)
    assertEquals(jugador.name, "Geralt")
    assertEquals(jugador.deck, List(cartadistancia))
    assertEquals(jugador.gems, 2)
  }

}
