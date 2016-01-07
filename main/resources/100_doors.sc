//problem: You have 100 doors in a row that are all initially closed. You make 100 passes by the doors. The first time through, you visit every door and toggle the door (if the door is closed, you open it; if it is open, you close it). The second time you only visit every 2nd door (door #2, #4, #6, ...). The third time, every 3rd door (door #3, #6, #9, ...), etc, until you only visit the 100th door.
//Question: What state are the doors in after the last pass? Which are open, which are closed?

def openDoors(length : Int = 100) = {
  // 長さの指定は()で行う
  var isDoorOpen = new Array[Boolean](length)

  // 「0からNまで繰り返す」for (i <- 0 until N)
  for (i <- 0 until length) {
    // 「iからNまで繰り返す(ステップがM)」for (i <- 0 until N by M)
    for (j <- i until length by i + 1) {
      isDoorOpen(j) ^= true
    }
  }
  isDoorOpen
}

val doorState  = scala.collection.immutable.Map(false -> "closed", true -> "open")
val isDoorOpen = openDoors()

for (doorNo <- 0 until isDoorOpen.length) {
  println("Door %d is %s".format(doorNo + 1, doorState(isDoorOpen(doorNo))))
}

