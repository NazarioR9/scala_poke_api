package model.templates

case class TypeValue(name: String, url: String)
case class Type(slot: Int, types: TypeValue)

case class Stat(base_stat: Int, effort: Int, stat: TypeValue)

case class LearnMethod(name: String, url: String)
case class MoveLearn(level: Int, method: LearnMethod, versions: Version)
case class Move(name: String, url: String, version_group_details: Array[MoveLearn])

case class AbilityInfo(name: String, url: String)
case class Ability(is_hidden: Boolean, slot: Int, abilityInfo: AbilityInfo)

case class EmptyObject()
case class Generation(
                      red_blue: Option[EmptyObject],
                      yellow: Option[EmptyObject],
                      crystal: Option[EmptyObject],
                      gold: Option[EmptyObject],
                      silver: Option[EmptyObject],
                      emerald: Option[EmptyObject],
                      firered_leafgreen: Option[EmptyObject],
                      ruby_sapphire: Option[EmptyObject],
                      diamond_pearl: Option[EmptyObject],
                      heartgold_soulsilver: Option[EmptyObject],
                      platinum: Option[EmptyObject],
                      black_white: Option[EmptyObject],
                      omegaruby_alphasapphire: Option[EmptyObject],
                      x_y: Option[EmptyObject],
                      icons: Option[EmptyObject],
                      ultra_sun_ultra_moon: Option[EmptyObject],
                     )
case class Other(dream_world: EmptyObject, official_artwork: EmptyObject)
case class Version(
                    generation_i: Generation,
                    generation_ii: Generation,
                    generation_iii: Generation,
                    generation_iv: Generation,
                    generation_v: Generation,
                    generation_vi: Generation,
                    generation_vii: Generation,
                    generation_viii: Generation
                  )
case class Sprite(
                   back_female: String,
                   back_shiny_female: String,
                   back_default: String,
                   front_female: String,
                   front_shiny_female: String,
                   back_shiny: String,
                   front_default: String,
                   front_shiny: String,
                   other: Other,
                   versions: Version
                 )
case class Form(name: String, url: String)
case class Item(name: String, url: String)
case class Specie(name: String, url: String)
case class GameIndice(game_index: Int)