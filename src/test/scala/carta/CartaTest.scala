package cl.uchile.dcc
package carta

import munit.FunSuite
class CartaTest extends FunSuite {
  test("The card has a name") {
    val carta = new Carta("Ghoul")
    assertEquals(carta.name, "Ghoul")

  }

}
