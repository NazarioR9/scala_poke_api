package utils.converters

import model.in.CatIn
import model.out.Out


object CatConverter extends Converter[CatIn, Out] {
  override def convert(input: CatIn): Out =
    Out(
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
