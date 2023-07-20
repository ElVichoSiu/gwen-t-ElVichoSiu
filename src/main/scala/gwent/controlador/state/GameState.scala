package cl.uchile.dcc
package gwent.controlador.state

import gwent.controlador.GameController

class GameState(private var context: GameController) {
  context.state = this
  
  def empieza(c: GameController): Unit = {
    
  }
  
  def jugarCarta(c: GameController): Unit = {
    
  }
  
  def pasar(c: GameController): Unit = {
    
  }

}
