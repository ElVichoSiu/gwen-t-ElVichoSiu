package cl.uchile.dcc
package gwent.controlador

import gwent.controlador.state.{GameStart, GameState}
import gwent.jugador.Jugador

import cl.uchile.dcc.gwent.carta.ICarta

class GameController {
  private var playerCharacters = List.empty[Jugador]
  private var enemyCharacters = List.empty[Jugador]

  private var state: GameState = new GameStart(this)

  def addPlayerCharacter(name: String, deck: List[ICarta]): Unit = {
    playerCharacters = playerCharacters :+ new Jugador(name, deck)
  }

  def addEnemyCharacter(name: String, deck: List[ICarta]): Unit = {
    enemyCharacters = enemyCharacters :+ new Jugador(name, deck)
  }

  def empieza(): Unit = state.empieza(this)

  def jugarCarta(): Unit = state.jugarCarta(this)

  def pasar(): Unit = state.pasar(this)

}
