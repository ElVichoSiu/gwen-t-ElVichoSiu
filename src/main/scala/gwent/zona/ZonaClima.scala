package cl.uchile.dcc
package gwent.zona

import gwent.carta.cartaclima.CartaClima

object ZonaClima {
  private var cartaClima: Option[CartaClima] = None

  def setCartaClima(c: CartaClima): Unit = {
    cartaClima = Some(c)
  }

}
