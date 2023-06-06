package cl.uchile.dcc
package jugador

import gwent.carta.ICarta
import gwent.carta.cartaclima.classesclima.{ClimaDespejado, LluviaTorrencial}
import gwent.carta.cartaunidad.classesunidad.{ADistancia, Asedio, CuerpoaCuerpo}
import gwent.jugador.Jugador
import munit.FunSuite

class JugadorTest extends FunSuite {
  var cartadistancia: ADistancia = _
  var cartasedio: Asedio = _
  var cartacuerpoacuerpo: CuerpoaCuerpo = _
  var cartaclimadespejado: ClimaDespejado = _
  var cartalluviatorrencial: LluviaTorrencial = _
  val name = "Geralt"
  var handi: List[ICarta] = _
  var adistanciazonei: List[ADistancia] = _
  var asediozonei: List[Asedio] = _
  var caczonei: List[CuerpoaCuerpo] = _
  var decki: List[ICarta] = _
  var jugador: Jugador = _
  override def beforeEach(context: BeforeEach): Unit = {
    cartadistancia = new ADistancia("Arquero", "Unidad a distancia que posee 5 de strength", 5)
    cartasedio = new Asedio("Torre", "Unidad de asedio que posee 20 de strength", 20)
    cartacuerpoacuerpo = new CuerpoaCuerpo("Ghoul", "Unidad de combate cuerpo a cuerpo que posee 10 de strength", 10)
    cartaclimadespejado = new ClimaDespejado()
    cartalluviatorrencial = new LluviaTorrencial()
    handi = List()
    adistanciazonei = List()
    asediozonei = List()
    caczonei = List()
    decki = List(cartadistancia,cartacuerpoacuerpo,cartasedio,cartaclimadespejado,cartalluviatorrencial)
    jugador = new Jugador(name, decki)
  }

  test("Jugador can be created with a name, a deck, gems, a hand, a caczone, a adistanciazone, a asediozone") {
    assertEquals(jugador.name, name)
    assertEquals(jugador.deck, decki)
    assertEquals(jugador.gems, 2)
    assertEquals(jugador.hand, handi)
    assertEquals(jugador.adistanciazone, adistanciazonei)
    assertEquals(jugador.asediozone, asediozonei)
    assertEquals(jugador.caczone, caczonei)
  }

  test("Jugador is able to shuffle the deck") {
    assertEquals(jugador.deck, decki)
    jugador.shuffleDeck()
    assertNotEquals(jugador.deck, decki)
  }

  test("Jugador is able to draw a carta from the deck") {
    assertEquals(jugador.hand, handi)
    assertEquals(jugador.deck, decki)
    jugador.drawCarta()
    assertNotEquals(jugador.hand, handi)
    assertNotEquals(jugador.deck, decki)
  }

  test("A Jugador class can be compared") {
    val jugador1 = new Jugador(name, decki)
    assertEquals(jugador, jugador1)
  }

  test("Jugador is able to play") {
    assertEquals(jugador.adistanciazone, adistanciazonei)
    assertEquals(jugador.asediozone, asediozonei)
    assertEquals(jugador.caczone, caczonei)
    assertEquals(jugador.hand, handi)
    assertEquals(jugador.deck, decki)
    jugador.drawCarta()
    jugador.drawCarta()
    jugador.drawCarta()
    jugador.drawCarta()
    jugador.drawCarta()
    jugador.playADistancia(cartadistancia)
    jugador.playAsedio(cartasedio)
    jugador.playCuerpoaCuerpo(cartacuerpoacuerpo)
    assertNotEquals(jugador.adistanciazone, adistanciazonei)
    assertNotEquals(jugador.asediozone, asediozonei)
    assertNotEquals(jugador.caczone, caczonei)
    assertNotEquals(jugador.hand, handi)
    assertNotEquals(jugador.deck, decki)
  }

}
