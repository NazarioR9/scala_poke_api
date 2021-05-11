package utils.converters

import model.in.PokeIn
import model.out.PokeOut


object PokeConverter extends Converter[PokeIn, PokeOut] {
  override def convert(input: PokeIn): PokeOut =
    PokeOut(
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
