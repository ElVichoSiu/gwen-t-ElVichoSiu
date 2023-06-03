package cl.uchile.dcc
package carta.cartaunidad

import cl.uchile.dcc.gwent.carta.ICarta
import cl.uchile.dcc.gwent.carta.cartaunidad.classesunidad.{ADistancia, Asedio, CuerpoaCuerpo}
import cl.uchile.dcc.gwent.jugador.Jugador
import munit.FunSuite

class ADistanciaTest extends FunSuite {
  var cartadistancia: ADistancia = _
  var cartasedio: Asedio = _
  var cartacuerpoacuerpo: CuerpoaCuerpo = _
  val name = "Geralt"
  var handi: List[ICarta] = _
  var adistanciazonei: List[ADistancia] = _
  var decki: List[ICarta] = _
  var jugador: Jugador = _

  override def beforeEach(context: BeforeEach): Unit = {
    cartadistancia = new ADistancia("Arquero", "Unidad a distancia que posee 5 de strength", 5)
    cartasedio = new Asedio("Torre", "Unidad de asedio que posee 20 de strength", 20)
    cartacuerpoacuerpo = new CuerpoaCuerpo("Ghoul", "Unidad de combate cuerpo a cuerpo que posee 10 de strength", 10)
    handi = List()
    adistanciazonei = List()
    decki = List(cartadistancia, cartacuerpoacuerpo, cartasedio)
    jugador = new Jugador(name, decki)
  }

  test("ADistancia can be created with a name, a description and strength") {
    assertEquals(cartadistancia.name, "Arquero")
    assertEquals(cartadistancia.description, "Unidad a distancia que posee 5 de strength")
    assertEquals(cartadistancia.strength, 5)
  }

  test("A ADistancia can be compared") {
    val cartadistancia1 = new ADistancia("Arquero", "Unidad a distancia que posee 5 de strength", 5)
    val cartadistancia2 = new ADistancia("Ballestero", "Unidad a distancia que posee 10 de strength", 10)
    assertEquals(cartadistancia, cartadistancia1)
    assertNotEquals(cartadistancia, cartadistancia2)
  }

  test("ADistancia can be played") {
    assertEquals(jugador.deck, decki)
    assertEquals(jugador.hand, handi)
    assertEquals(jugador.adistanciazone, adistanciazonei)
    jugador.drawCarta()
    jugador.drawCarta()
    jugador.drawCarta()
    cartadistancia.play(jugador)
    assertNotEquals(jugador.deck, decki)
    assertNotEquals(jugador.hand, handi)
    assertNotEquals(jugador.adistanciazone, adistanciazonei)
  }

}
