package cl.uchile.dcc
package carta.cartaunidad

import cl.uchile.dcc.gwent.carta.cartaunidad.classesunidad.Asedio
import munit.FunSuite

class AsedioTest extends FunSuite {
  test("Asedio has a name and strength") {
    val asedio = new Asedio("Torre", 20)
    assertEquals(asedio.name, "Torre")
    assertEquals(asedio.strenght, 20)
  }

}
