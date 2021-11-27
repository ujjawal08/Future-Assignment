package edu.knoldus


import org.scalatest.flatspec.AnyFlatSpec

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future


class ContentTest extends AnyFlatSpec{
   val result = new Content()
  result.contentInDir("./src")
  "Content" should "give" in{
  assert(result.contentInDir("./src") == Future(List("/home/knoldus/Desktop/Introduction to Futures/./src/test, /home/knoldus/Desktop/Introduction to Futures/./src/main")))
  }




}