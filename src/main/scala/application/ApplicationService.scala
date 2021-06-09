package application

import java.net.URL
import scala.io.Source


object ApplicationService {
  def process(): Unit = {
    val pokeID = 894
    val request = ApplicationConfiguration.base_url + ApplicationConfiguration.pokemon_url + pokeID
    val connection = new URL(request).openConnection

    val result = Source.fromInputStream(connection.getInputStream).getLines.mkString("\n")

    print(result)
  }
}
