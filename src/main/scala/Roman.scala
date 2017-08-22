package com.example.gavri.romannumerals

case class Roman(s: String) {

  val repeatingAdditionMapping = Map(
    'I' -> 1,
    'X' -> 10,
    'C' -> 100,
    'M' -> 1000
  )

  def value: Int = {
    s.map((c: Char) => repeatingAdditionMapping(c)).sum
  }
}
