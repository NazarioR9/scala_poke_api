package utils.converters

import model.in.PokemonIn
import model.out.PokemonOut


object PokemonConverter extends Converter[PokemonIn, PokemonOut] {
  override def convert(input: PokemonIn): PokemonOut =
    PokemonOut(
      Id = input.id,
      Name = input.name,
      Weight = input.weight,
      Height = input.height,
      Experience = input.base_experience,
      Types = input.types,
      Stats = input.stats,
      Moves = input.moves,
      Abilities = input.abilities
    )
}
