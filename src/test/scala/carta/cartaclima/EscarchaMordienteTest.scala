package cl.uchile.dcc
package carta.cartaclima

import cl.uchile.dcc.gwent.carta.cartaclima.classesclima.EscarchaMordiente
import munit.FunSuite

class EscarchaMordienteTest extends FunSuite {
  test("EscarchaMordiente is named 'Escarcha mordiente'") {
    val escarchamordiente = new EscarchaMordiente()
    assertEquals(escarchamordiente.name, "Escarcha mordiente")
  }

}
