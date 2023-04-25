package cl.uchile.dcc
package carta.cartaclima

import cl.uchile.dcc.gwent.carta.cartaclima.classesclima.LluviaTorrencial
import munit.FunSuite

class LluviaTorrencialTest extends FunSuite {
  test("LluviaTorrencial is named 'Lluvia torrencial'") {
    val lluviatorrencial = new LluviaTorrencial()
    assertEquals(lluviatorrencial.name, "Lluvia torrencial")
  }

}
