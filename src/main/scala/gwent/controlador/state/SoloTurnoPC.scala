package cl.uchile.dcc
package gwent.controlador.state

import gwent.controlador.GameController

class SoloTurnoPC(context: GameController) extends GameState(context) {

  override def jugarCarta(c: GameController): Unit = {
    c.state = new SoloTurnoPC(c)
  }

  override def pasar(c: GameController): Unit = {
    c.state = new GameStart(c)
  }
}