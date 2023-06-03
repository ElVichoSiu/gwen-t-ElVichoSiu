package cl.uchile.dcc
package carta.cartaunidad

import cl.uchile.dcc.gwent.carta.ICarta
import cl.uchile.dcc.gwent.carta.cartaunidad.classesunidad.{ADistancia, Asedio, CuerpoaCuerpo}
import cl.uchile.dcc.gwent.jugador.Jugador
import munit.FunSuite

class CuerpoaCuerpoTest extends FunSuite {
  var cartadistancia: ADistancia = _
  var cartasedio: Asedio = _
  var cartacuerpoacuerpo: CuerpoaCuerpo = _
  val name = "Geralt"
  var handi: List[ICarta] = _
  var caczonei: List[CuerpoaCuerpo] = _
  var decki: List[ICarta] = _
  var jugador: Jugador = _

  override def beforeEach(context: BeforeEach): Unit = {
    cartadistancia = new ADistancia("Arquero", "Unidad a distancia que posee 5 de strength", 5)
    cartasedio = new Asedio("Torre", "Unidad de asedio que posee 20 de strength", 20)
    cartacuerpoacuerpo = new CuerpoaCuerpo("Ghoul", "Unidad de combate cuerpo a cuerpo que posee 10 de strength", 10)
    handi = List()
    caczonei = List()
    decki = List(cartadistancia, cartacuerpoacuerpo, cartasedio)
    jugador = new Jugador(name, decki)
  }

  test("CuerpoaCuerpo can be created with a name, a description and strength") {
    assertEquals(cartacuerpoacuerpo.name, "Ghoul")
    assertEquals(cartacuerpoacuerpo.description, "Unidad de combate cuerpo a cuerpo que posee 10 de strength")
    assertEquals(cartacuerpoacuerpo.strength, 10)
  }

  test("A CuerpoaCuerpo can be compared") {
    val cartacuerpoacuerpo1 = new CuerpoaCuerpo("Ghoul", "Unidad de combate cuerpo a cuerpo que posee 10 de strength", 10)
    val cartacuerpoacuerpo2 = new CuerpoaCuerpo("Goblin", "Unidad de combate cuerpo a cuerpo que posee 3 de strength", 5)
    assertEquals(cartacuerpoacuerpo, cartacuerpoacuerpo1)
    assertNotEquals(cartacuerpoacuerpo, cartacuerpoacuerpo2)
  }

  test("CuerpoaCuerpo can be played") {
    assertEquals(jugador.deck, decki)
    assertEquals(jugador.hand, handi)
    assertEquals(jugador.caczone, caczonei)
    jugador.drawCarta()
    jugador.drawCarta()
    jugador.drawCarta()
    cartacuerpoacuerpo.play(jugador)
    assertNotEquals(jugador.deck, decki)
    assertNotEquals(jugador.hand, handi)
    assertNotEquals(jugador.caczone, caczonei)
  }

}
