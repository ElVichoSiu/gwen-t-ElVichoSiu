package cl.uchile.dcc
package carta.cartaunidad

import cl.uchile.dcc.gwent.carta.cartaunidad.classesunidad.CuerpoaCuerpo
import munit.FunSuite

class CuerpoaCuerpoTest extends FunSuite {
  test("CuerpoaCuerpo has a name and strength") {
    val cuerpoacuerpo = new CuerpoaCuerpo("Ghoul", 10)
    assertEquals(cuerpoacuerpo.name, "Ghoul")
    assertEquals(cuerpoacuerpo.strenght, 10)
  }

}
