package cl.uchile.dcc
package gwent.carta.cartaunidad.classesunidad

import gwent.carta.cartaunidad.AbstractCartaUnidad

import cl.uchile.dcc.gwent.jugador.Jugador

class Asedio(name: String, description: String, strength: Int) extends AbstractCartaUnidad(name, description, strength) {

  override def play(j: Jugador): Unit = {
    j.playAsedio(this)
  }

}
