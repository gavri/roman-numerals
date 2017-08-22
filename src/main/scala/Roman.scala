package com.example.gavri.romannumerals

case class Roman(s: String) {
  def value: Int = {
    s.length
  }
}
