package application

import model.out.PokeOut
import model.templates._

import java.net.URL
import scala.io.Source
import play.api.libs.json._
import play.api.libs.functional.syntax._
import play.api.libs.json.Json.fromJson

object ApplicationService {
  def process(): Unit = {
    val pokeID = 894
    val request = ApplicationConfiguration.base_url + ApplicationConfiguration.pokemon_url + pokeID
    val connection = new URL(request).openConnection

    val result = Source.fromInputStream(connection.getInputStream).getLines.mkString("\n")

    val playJson = Json.parse(result)

    println(playJson("id"))
//    println((playJson \ "types").validate[Array[Type]](readsType).map(_.toList))
//    val pokemon = new PokeOut(playJson("id").toString.toInt,
//      playJson("name").toString,
//      playJson("weight").toString.toInt,
//      playJson("height").toString.toInt,
//      playJson("experience").toString.toInt,
//      playJson("types"), // Pas encore fait
//      playJson("stats"), // Pas encore fait
//      playJson("Moves"), // Pas encore fait
//      playJson("Abilities") // Pas encore fait
//      )
  }
}
