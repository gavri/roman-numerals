package com.example.gavri.romannumerals

case class Roman(s: String) {

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

  val allMapping = repeatingAdditionMapping ++ fivesMapping

  def value: Int = {
    s.map((c: Char) => allMapping(c)).sum
  }

  def valueOfSingleDigit(c: Char): Int = {
    allMapping(c)
  }
}
