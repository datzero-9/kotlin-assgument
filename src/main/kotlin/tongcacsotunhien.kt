fun main() {
    println("hãy nhập số n để tính tổng")
    var input: Int? = readLine()?.toInt();
    if (input != null) {
        var sum: Int = 0;
        for (i in 1..input) {
            sum += i;
        }
        print("Tổng số n là : ${sum}")
    }
}