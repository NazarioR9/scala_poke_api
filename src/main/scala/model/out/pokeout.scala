package model.out

import model.templates.Stat
import model.templates.Move
import model.templates.Ability
import model.templates.Type

case class Out(
              Id: Int = null,
              Name: String = null,
              Weight: Int = null,
              Height: Int = null,
              Experience: Int = null,
              Types: Array[Type],
              Stats: Array[Stat],
              Moves: Array[Move],
              Abilities: Array[Ability]
              )
