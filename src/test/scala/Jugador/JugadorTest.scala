package cl.uchile.dcc
package Jugador

import munit.FunSuite

class JugadorTest extends FunSuite {
  val name = "Geralt"
  var Jugador: Jugador = _
  override def beforeEach(context: BeforeEach): Unit = {
    Jugador = new Jugador(name)
  }
  test("Jugador tiene nombre") {
    assertEquals(Jugador.name, name)
  }

}
