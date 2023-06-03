package cl.uchile.dcc
package gwent.carta.cartaunidad.classesunidad

import gwent.carta.cartaunidad.AbstractCartaUnidad

import cl.uchile.dcc.gwent.jugador.Jugador

class CuerpoaCuerpo(name: String, description: String , strength: Int) extends AbstractCartaUnidad(name, description, strength){

  override def equals(obj: Any): Boolean = {
    if (obj.isInstanceOf[CuerpoaCuerpo]) {
      val other = obj.asInstanceOf[CuerpoaCuerpo]
      (this eq other) ||
        other.name == name &&
          other.description == description &&
          other.strength == strength
    } else {
      false
    }
  }
  
  override def play(j: Jugador): Unit = {
    j.playCuerpoaCuerpo(this)
  }

}
