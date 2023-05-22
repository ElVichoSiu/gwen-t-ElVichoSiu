package cl.uchile.dcc
package carta.cartaunidad

import cl.uchile.dcc.gwent.carta.cartaunidad.classesunidad.ADistancia
import munit.FunSuite

class ADistanciaTest extends FunSuite {
  test("ADistancia has a name and strength") {
    val adistancia = new ADistancia("Arquero", "Unidad a distancia que posee 5 de strength", 5)
    assertEquals(adistancia.name, "Arquero")
    assertEquals(adistancia.strength, 5)
  }

}
