package model.out

import model.templates.Stat
import model.templates.Move
import model.templates.Ability
import model.templates.Type

case class PokeOut(
              Id: Int,
              Name: String = null,
              Weight: Int,
              Height: Int,
              Experience: Int,
              Types: Array[Type],
              Stats: Array[Stat],
              Moves: Array[Move],
              Abilities: Array[Ability]
              )
