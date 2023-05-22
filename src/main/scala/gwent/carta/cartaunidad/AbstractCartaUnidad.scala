package cl.uchile.dcc
package gwent.carta.cartaunidad

import gwent.carta.ICarta

abstract class AbstractCartaUnidad(val name: String, val description: String, var strength: Int) extends ICarta {

  var currentStrength: Int = strength
  
}
