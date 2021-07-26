package utils.converters

import io.circe.Error

trait Converter[In, Out] {
  def convert(input: In): Out

  def jsonToIn(input: String): In
}
