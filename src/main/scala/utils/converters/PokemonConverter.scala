package utils.converters

import io.circe.generic.semiauto.{deriveDecoder, deriveEncoder}
import io.circe.parser.decode
import io.circe.{Decoder, Encoder, Json}
import model.in.PokemonIn
import model.out.PokemonOut
import model.templates._

object PokemonConverter extends Converter[PokemonIn, PokemonOut] {
  def nullToEmptyString(value: Json): Json = if (value.isNull) Json.fromString("") else value

  override def convert(input: PokemonIn): PokemonOut = {
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

  override def jsonToIn(input: String): PokemonIn = {
    implicit val abilityInfoEncoder: Encoder[AbilityInfo] = deriveEncoder
    implicit val abilityInfoDecoder: Decoder[AbilityInfo] = deriveDecoder
    implicit val typeValueEncoder: Encoder[TypeValue] = deriveEncoder
    implicit val typeValueDecoder: Decoder[TypeValue] = deriveDecoder
    implicit val learnMethodEncoder: Encoder[LearnMethod] = deriveEncoder
    implicit val learnMethodDecoder: Decoder[LearnMethod] = deriveDecoder
    implicit val EmptyObjectEncoder: Encoder[EmptyObject] = deriveEncoder
    implicit val EmptyObjectDecoder: Decoder[EmptyObject] = deriveDecoder
    implicit val FormEncoder: Encoder[Form] = deriveEncoder
    implicit val FormDecoder: Decoder[Form] = deriveDecoder
    implicit val ItemEncoder: Encoder[Item] = deriveEncoder
    implicit val ItemDecoder: Decoder[Item] = deriveDecoder
    implicit val SpecieEncoder: Encoder[Specie] = deriveEncoder
    implicit val SpecieDecoder: Decoder[Specie] = deriveDecoder
    implicit val GameIndiceEncoder: Encoder[GameIndice] = deriveEncoder
    implicit val GameIndiceDecoder: Decoder[GameIndice] = deriveDecoder
    implicit val frontEncoder: Encoder[Front] = deriveEncoder
    implicit val frontDecoder: Decoder[Front] = deriveDecoder

    implicit val abilityEncoder: Encoder[Ability] = deriveEncoder
    implicit val abilityDecoder: Decoder[Ability] = deriveDecoder
    implicit val generationEncoder: Encoder[Generation] = deriveEncoder
    implicit val generationDecoder: Decoder[Generation] = deriveDecoder
    implicit val versionEncoder: Encoder[Version] = deriveEncoder
    implicit val versionDecoder: Decoder[Version] = deriveDecoder
    implicit val moveLearnEncoder: Encoder[MoveLearn] = deriveEncoder
    implicit val moveLearnDecoder: Decoder[MoveLearn] = deriveDecoder
    implicit val moveEncoder: Encoder[Move] = deriveEncoder
    implicit val moveDecoder: Decoder[Move] = deriveDecoder
    implicit val otherEncoder: Encoder[Other] = deriveEncoder
    implicit val otherDecoder: Decoder[Other] = deriveDecoder
    implicit val spriteEncoder: Encoder[Sprite] = deriveEncoder
    implicit val spriteDecoder: Decoder[Sprite] = deriveDecoder
    implicit val statEncoder: Encoder[Stat] = deriveEncoder
    implicit val statDecoder: Decoder[Stat] = deriveDecoder
    implicit val typeEncoder: Encoder[Type] = deriveEncoder
    implicit val typeDecoder: Decoder[Type] = deriveDecoder

    implicit val encoder: Encoder[PokemonIn] = deriveEncoder
    implicit val decoder: Decoder[PokemonIn] = deriveDecoder

    val pokemon = (decode[PokemonIn](input) match {
      case Left(value) => value
      case Right(value) => value
    }).asInstanceOf[PokemonIn]

    pokemon
  }
}
