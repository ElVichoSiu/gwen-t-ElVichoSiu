package cl.uchile.dcc
package carta

import cl.uchile.dcc.gwent.carta.Carta
import munit.FunSuite

class CartaTest extends FunSuite {
  val name = "Ghoul"
  var Carta: Carta = _
  override def beforeEach(context: BeforeEach): Unit = {
    Carta = new Carta(name)
  }
  test("Carta tiene nombre"){
    assertEquals(Carta.name, name)
  }

}
