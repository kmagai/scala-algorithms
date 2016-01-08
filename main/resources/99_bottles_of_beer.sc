// 99から1までステップ-1でnに渡していく
99 to 1 by -1 foreach { n =>
  println(
  // printlnの中でf""を使うとprintf形式を使用できる→f補間子
  // f補間子は型安全
  // 文字列の中のnは$nで参照
    f"$n%d bottles of beer on the wall\n" +
      f"$n%d bottles of beer\n" +
      f"Take one down, pass it around\n" +
      f"${n - 1}%d bottles of beer on the wall\n")
}