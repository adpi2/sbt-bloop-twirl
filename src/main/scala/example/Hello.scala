package example

import example.html.home_page

object Hello extends App {
  val page = home_page("Hello")
  println(page)
}
