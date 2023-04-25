package cl.uchile.dcc
package carta

import cl.uchile.dcc.gwent.carta.CartaUnidad
import munit.FunSuite

class CartaUnidadTest extends FunSuite {
  test("The CartaUnidad has a name and strength") {
    val cartaunidad = new CartaUnidad("Ghoul", 10)
    assertEquals(cartaunidad.name, "Ghoul")
    assertEquals(cartaunidad.strenght, 10)
  }

}
