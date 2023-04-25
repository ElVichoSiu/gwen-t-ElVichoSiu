package cl.uchile.dcc
package carta.cartaclima

import cl.uchile.dcc.gwent.carta.cartaclima.classesclima.NieblaImpenetrable
import munit.FunSuite

class NieblaImpenetrableTest extends FunSuite {
  test("NieblaImpenetrable is named 'Niebla impenetrable'") {
    val nieblaimpenetrable = NieblaImpenetrable()
    assertEquals(nieblaimpenetrable.name, "Niebla impenetrable")
  }

}
