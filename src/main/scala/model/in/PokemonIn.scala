package model.in

import model.templates.{Ability, Form, GameIndice, Item, Move, Specie, Sprite, Stat, Type}

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
//                past_types: Array[PastType],
                species: Specie,
                sprites: Sprite,
                stats: Array[Stat],
                types: Array[Type],
                weight: Int
                )
