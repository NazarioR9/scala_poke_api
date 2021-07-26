package database

import application.ApplicationConfiguration._
import model.out.PokemonOut

import java.sql.{Connection, DriverManager, SQLException}

class DBWriter {
  private var connection: Connection = null;

  def init() {
    try {
      // make the connection
//      Class.forName(db_driver)
      this.connection = DriverManager.getConnection(db_url, db_username, db_password)

      this.create_table()
    } catch {
      case e: SQLException => e.printStackTrace()
    }
  }

  def create_table() {
    try {
      val statement = this.connection.createStatement()

      val sql = "CREATE TABLE IF NOT EXISTS Pokemon " +
        "(id INTEGER not NULL, " +
        " name VARCHAR(255), " +
        " weight INTEGER, " +
        " height INTEGER, " +
        " exp INTEGER, " +
        " PRIMARY KEY ( id ))";
      statement.executeUpdate(sql)
    }
  }


  def write(pokemon: PokemonOut) {
    val statement = this.connection.createStatement()

    val command = "INSERT INTO Pokemon VALUES " +
      "(" + pokemon.Id + ", '" + pokemon.Name + "' ," +
      pokemon.Weight + ", " + pokemon.Height + ", " + pokemon.Experience + ")"

    val resultSet = statement.executeUpdate(command)

    println(resultSet)

    this.connection.close()
  }

}