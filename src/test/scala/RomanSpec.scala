package com.example.gavri.romannumerals

import org.scalatest._

class RomanSpec extends FunSpec with Matchers {

  def assertRomanValue(s: String, value: Int): Assertion = {
    Roman(s).value should equal (new Integer(value))
  }


  describe("Roman") {
    it("should understand the repeating/additon rule") {
      assertRomanValue("I", 1)
      assertRomanValue("II", 2)
      assertRomanValue("III", 3)
      assertRomanValue("X", 10)
      assertRomanValue("XX", 20)
      assertRomanValue("XXX", 30)
      assertRomanValue("C", 100)
      assertRomanValue("CC", 200)
      assertRomanValue("CCC", 300)
      assertRomanValue("M", 1000)
      assertRomanValue("MM", 2000)
      assertRomanValue("MMM", 3000)
    }

    it("should understand fives") {
      assertRomanValue("V", 5)
      assertRomanValue("L", 50)
      assertRomanValue("D", 500)
    }
  }
}

