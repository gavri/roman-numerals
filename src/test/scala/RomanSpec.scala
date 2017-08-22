package com.example.gavri.romannumerals

import org.scalatest._

class RomanSpec extends FunSpec with Matchers {
  describe("Roman") {
    it("should understand the repeating/additon rule") {
      Roman("I").value should equal (new Integer(1))
      Roman("II").value should equal (new Integer(2))
      Roman("III").value should equal (new Integer(3))
      Roman("X").value should equal (new Integer(10))
      Roman("XX").value should equal (new Integer(20))
      Roman("XXX").value should equal (new Integer(30))
      Roman("C").value should equal (new Integer(100))
      Roman("CC").value should equal (new Integer(200))
      Roman("CCC").value should equal (new Integer(300))
      Roman("M").value should equal (new Integer(1000))
      Roman("MM").value should equal (new Integer(2000))
      Roman("MMM").value should equal (new Integer(3000))
    }
  }
}

