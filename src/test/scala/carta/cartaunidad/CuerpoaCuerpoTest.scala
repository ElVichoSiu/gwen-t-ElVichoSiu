package cl.uchile.dcc
package carta.cartaunidad

import cl.uchile.dcc.gwent.carta.cartaunidad.classesunidad.CuerpoaCuerpo
import munit.FunSuite

class CuerpoaCuerpoTest extends FunSuite {
  test("CuerpoaCuerpo has a name and strength") {
    val cuerpoacuerpo = new CuerpoaCuerpo("Ghoul", "Unidad de combate cuerpo a cuerpo que posee 10 de strength", 10)
    assertEquals(cuerpoacuerpo.name, "Ghoul")
    assertEquals(cuerpoacuerpo.strength, 10)
  }

}
