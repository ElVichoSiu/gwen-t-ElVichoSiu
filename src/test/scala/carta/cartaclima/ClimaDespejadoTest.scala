package cl.uchile.dcc
package carta.cartaclima

import munit.FunSuite

class ClimaDespejadoTest extends FunSuite {
  test("ClimaDespejado is named 'Clima despejado'") {
    val climadespejado = new ClimaDespejado()
    assertEquals(climadespejado.name, "Clima despejado")
  }
  
}
