package com.example.gavri.romannumerals

import org.scalatest._

class RomanSpec extends FunSpec with Matchers {
  describe("Roman") {
    it("should understand the repeating rule") {
      Roman("I").value should equal (new Integer(1))
      Roman("II").value should equal (new Integer(2))
      Roman("III").value should equal (new Integer(3))
    }
  }
}

