package cl.uchile.dcc
package gwent.jugador

import cl.uchile.dcc.gwent.carta.Mazo

/**
 *
 * @param name El nombre del Jugador
 *
 * @constructor Crea un Jugador con un nombre
 *
 */

class Jugador (val name: String, val deck: Mazo(25)) {
  private var Gemas: Int = 2

}
