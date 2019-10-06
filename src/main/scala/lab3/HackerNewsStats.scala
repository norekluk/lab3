package lab3

import java.io.File

object HackerNewsStats extends App {

  def readAll(dirname: String): List[HackerNewsItem] = {
    val dir = new File(dirname)
    val files = dir.listFiles()

    files
      .map(HackerNewsItem.fromFile)
      .foldLeft(List[HackerNewsItem]())(_ including _)
  }

  def correlation(points: List[(Double, Double)]): Double = ???

  val items = readAll("data/item")

  // 0. how many news are there
  println("Number of news: " + items.size)
  // 1. how many stories are there
  println("Number of stories: " + items.filter(_.kind == "story").size)
}
