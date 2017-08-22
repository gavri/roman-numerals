package com.example.gavri.romannumerals

case class Roman(representation: String) {

  val repeatingAdditionMapping = Map(
    'I' -> 1,
    'X' -> 10,
    'C' -> 100,
    'M' -> 1000
  )

  val fivesMapping = Map(
    'V' -> 5,
    'L' -> 50,
    'D' -> 500
    )

  val subtractionMapping = Map(
    "IV" -> 4,
    "IX" -> 9,
    "XL" -> 40,
    "XC" -> 90,
    "CD" -> 400,
    "CM" -> 900
    )

  val allMapping = repeatingAdditionMapping ++ fivesMapping

  def value: Int = {
    valueRecur(representation)
  }

  def valueRecur(s: String): Int = {
    if (s.isEmpty)
      0
    else if (subtractionMapping contains s.take(2))
      subtractionMapping(s.take(2)) + valueRecur(s.drop(2))
    else
      allMapping(s.take(1)(0)) + valueRecur(s.drop(1))
  }

  def valueOfSingleDigit(c: Char): Int = {
    allMapping(c)
  }
}
