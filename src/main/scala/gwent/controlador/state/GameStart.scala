package cl.uchile.dcc
package gwent.controlador.state

import gwent.controlador.GameController

class GameStart(context: GameController) extends GameState(context) {
  
  override def empieza(c: GameController): Unit = {
    c.state = new TurnoJugador(c)
  }
}
