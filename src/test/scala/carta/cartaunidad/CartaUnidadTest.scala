package cl.uchile.dcc
package carta.cartaunidad

import cl.uchile.dcc.gwent.carta.cartaunidad.CartaUnidad
import munit.FunSuite

class CartaUnidadTest extends FunSuite {
  test("The CartaUnidad has a name and strength") {
    val cartaunidad = new CartaUnidad("Ghoul", 10)
    assertEquals(cartaunidad.name, "Ghoul")
    assertEquals(cartaunidad.strenght, 10)
  }

}
