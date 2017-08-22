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

    it("should understand decreasing rule") {
      assertRomanValue("VI", 6)
      assertRomanValue("VII", 7)
      assertRomanValue("VIII", 8)
      assertRomanValue("XI", 11)
      assertRomanValue("XII", 12)
      assertRomanValue("XVI", 16)
      assertRomanValue("LI", 51)
      assertRomanValue("LII", 52)
      assertRomanValue("LV", 55)
      assertRomanValue("LVI", 56)
      assertRomanValue("LVII", 57)
      assertRomanValue("LIII", 53)
      assertRomanValue("DI", 501)
      assertRomanValue("DII", 502)
      assertRomanValue("DIII", 503)
    }
  }
}

