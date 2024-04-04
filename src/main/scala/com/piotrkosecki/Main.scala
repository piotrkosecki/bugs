package com.piotrkosecki

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object Main extends App {

  val a = "aaa"

  def bug1(str: String) = str match {
    case "b" => println("Correct!")
    case a => println("Not correct")
    case _ => println("whatever")
  }

  def fut1(): Future[Int] = Future.successful(1)

  def fut2() = fut1().map { _ =>
    2
  }



  bug1("c")
  fut2()
}

