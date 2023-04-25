package cl.uchile.dcc
package carta.cartaunidad

import munit.FunSuite

class ADistanciaTest extends FunSuite {
  test("ADistancia has a name and strength") {
    val adistancia = new ADistancia("Arquero", 5)
    assertEquals(adistancia.name, "Arquero")
    assertEquals(adistancia.strenght, 5)
  }

}
