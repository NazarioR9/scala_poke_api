package application

import database.DBWriter
import play.api.libs.json.Json
import utils._

object ApplicationService {
  def process(): Unit = {
    val pokeID = 894
    val url = ApplicationConfiguration.base_url + ApplicationConfiguration.pokemon_url + pokeID
    val reader = new PokeApiReader[String]()
    val connection = new DBWriter()

    connection.init()

    val result = reader.read(url)

    val pokemonIn = converters.PokemonConverter.jsonToIn(result)
    val pokemon = converters.PokemonConverter.convert(pokemonIn)

    connection.write(pokemon)

  }
}
