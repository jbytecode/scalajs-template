import org.scalajs.dom
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.Event
import scala.scalajs.js

val document = org.scalajs.dom.document
val status: HTMLDivElement = document.getElementById("status").asInstanceOf[HTMLDivElement]

def status(msg: String): Unit = 
  status.textContent = msg

@main def hello(): Unit =
  val txtname = document.getElementById("txtname").asInstanceOf[HTMLInputElement]
  txtname.oninput = (e: Event) => {
    status("Hello, " + txtname.value)
  }
  status("Ready")


