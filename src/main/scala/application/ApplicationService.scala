package application

import play.api.libs.json.Json
import utils._

object ApplicationService {
  def process(): Unit = {
    val pokeID = 894
    val url = ApplicationConfiguration.base_url + ApplicationConfiguration.pokemon_url + pokeID
    val connection = new PokeApiReader[String]()
    val result = connection.read(url) // HA ok

    println(result)


    val playJson = Json.parse(result)

//    println(playJson("stats"))
//      //    println((playJson \ "types").validate[Array[Type]](readsType).map(_.toList))
//        val pokemon = new PokemonOut(
//          (playJson \ "id").toString.toInt,
//          (playJson \ "name").toString,
//          (playJson \ "weight").toString.toInt,
//          (playJson \ "height").toString.toInt,
//          (playJson \ "experience").toString.toInt,
//          new Type((playJson \ "types" \\ "slot").toString.toInt,
    //          new TypeValue((playJson \ "types" \\ "type" ).map(_ \\ "name").toString,
                  //          (playJson \ "types" \\ "type" ).map(_ \\ "url").toString),
//          new Stat((playJson \ "stats" \\ "base_stat").toString.toInt,
    //          (playJson \ "stats" \\ "effort").toString.toInt,
    //          new TypeValue((playJson \ "stats" \\ "stat").map(_ \\ "name").toString,
    //          (playJson \ "stats" \\ "stat").map(_ \\ "url").toString)),
//          new Move((playJson \ "Moves" \\ "name").toString,
    //          (playJson \ "Moves" \\ "url").toString), // Pas encore fait
//          (playJson \ "Abilities") // Pas encore fait
//        )
//    println(pokemon)


    val pokemonIn = converters.PokemonConverter.jsonToIn(result)
    val pokemon = converters.PokemonConverter.convert(pokemonIn)

    println(pokemonIn)
    println(pokemon)

  }
}
