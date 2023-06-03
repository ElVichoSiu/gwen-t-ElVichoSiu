package cl.uchile.dcc
package carta.cartaunidad

import cl.uchile.dcc.gwent.carta.ICarta
import cl.uchile.dcc.gwent.carta.cartaunidad.classesunidad.{ADistancia, Asedio, CuerpoaCuerpo}
import cl.uchile.dcc.gwent.jugador.Jugador
import munit.FunSuite

class AsedioTest extends FunSuite {
  var cartadistancia: ADistancia = _
  var cartasedio: Asedio = _
  var cartacuerpoacuerpo: CuerpoaCuerpo = _
  val name = "Geralt"
  var handi: List[ICarta] = _
  var asediozonei: List[Asedio] = _
  var decki: List[ICarta] = _
  var jugador: Jugador = _

  override def beforeEach(context: BeforeEach): Unit = {
    cartadistancia = new ADistancia("Arquero", "Unidad a distancia que posee 5 de strength", 5)
    cartasedio = new Asedio("Torre", "Unidad de asedio que posee 20 de strength", 20)
    cartacuerpoacuerpo = new CuerpoaCuerpo("Ghoul", "Unidad de combate cuerpo a cuerpo que posee 10 de strength", 10)
    handi = List()
    asediozonei = List()
    decki = List(cartadistancia, cartacuerpoacuerpo, cartasedio)
    jugador = new Jugador(name, decki)
  }
}
