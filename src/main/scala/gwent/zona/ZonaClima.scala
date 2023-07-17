package cl.uchile.dcc
package gwent.zona

import gwent.carta.cartaclima.CartaClima

object ZonaClima {
  private var _cartaClima: Option[CartaClima] = None

  def setCartaClima(c: CartaClima): Unit = {
    _cartaClima = Some(c)
  }
  
  def cartaClima: Option[CartaClima] = _cartaClima

}
