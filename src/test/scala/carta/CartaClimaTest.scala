package cl.uchile.dcc
package carta

import cl.uchile.dcc.gwent.carta.CartaClima
import munit.FunSuite

class CartaClimaTest extends FunSuite {
  test("The CartaClima has a name") {
    val cartaclima = new CartaClima("Escarcha Mordiente")
    assertEquals(cartaclima.name, "Escarcha Mordiente")
  }

}
