package cl.uchile.dcc
package gwent.controlador.state

import gwent.controlador.GameController

class TurnoPC(context: GameController) extends GameState(context) {
  
  override def jugarCarta(c: GameController): Unit = {
    c.state = new TurnoJugador(c)
  }

  override def pasar(c: GameController): Unit = {
    c.state = new SoloTurnoJugador(c)
  }
}
