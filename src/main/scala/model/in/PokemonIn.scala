package model.in

import model.templates.Stat
import model.templates.Move
import model.templates.Ability
import model.templates.Type
import model.templates.Sprite
import model.templates.Form
import model.templates.Item
import model.templates.Specie

case class PokemonIn(
                abilities: Array[Ability],
                base_experience: Int,
                forms: Array[Form],
                game_indices: Array[GameIndice],
                height: Int,
                held_items: Option[Array[Item]],
                id: Int,
                is_default: Boolean,
                location_area_encounters: String,
                moves: Array[Move],
                name: String,
                order: Int,
                past_types: Array[PastType],
                specie: Array[Specie],
                sprites: Array[Sprite],
                stats: Array[Stat],
                types: Array[Type],
                weight: Int
                )
