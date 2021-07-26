package utils

import java.net.URL
import scala.io.Source

trait IOReader[T] {
  def read(url: String): String
}

trait IOApiReader[T] extends IOReader[T]{
  override def read(url: String): String = {
    val connection = new URL(url).openConnection
    Source.fromInputStream(connection.getInputStream).getLines.mkString("\n")
      .replace("l-a", "l_a")
      .replace("n-i", "n_i")
      .replace("\"type\"", "\"types\"")
  }
}

class PokeApiReader[T] extends IOApiReader[T]
{
}