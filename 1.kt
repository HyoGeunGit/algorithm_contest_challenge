
/*
어느 날 친구가 봉지를 들고 와 당신에게 게임을 제안했습니다. 
봉지에는 숫자가 쓰여 있는 n장의 종이가 들어 있습니다. 당신은 봉지에서 종이를 한 장 뽑고, 숫자를 확인한 후 다시 봉지에 넣는 동작을 4번 반복하여,
그 숫자의 합이 m이면 당신의 승리, 그렇지 않으면 친구가 승리하게 됩니다. 당신은 이 게임을 몇 번이나 해 보았지만 한번도 이기지 못했습니다.
화가 난 당신은 봉지를 찢어 보든 종이를 꺼낸 후 정말 이길 수 없었는지를 조사했습니다. 종이에 쓰여 있는 숫자가 k1, k2, … , kn 일 경우 합이 m 이 되는 경우가 있는 지를 조사하고, 
방법이 있다면 Yes, 없다면 No 를 출력하는 프로그래밍을 장성하세요.
 */
internal class Pick {
  fun solve() {
    val k = intArrayOf(1, 3, 5)
    val n = k.size
    val m = 10 
    val found = false 
    for (a in 0 until n)
    {
      for (b in 0 until n)
      {
        for (c in 0 until n)
        {
          for (d in 0 until n)
          {
            if (k[a] + k[b] + k[c] + k[d] == m)
            {
              found = true
              break
            }
          }
        }
      }
    }
    if (found) println("Yes") else println("No")
  }
}