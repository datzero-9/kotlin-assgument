fun main() {
    println("hãy nhập số n để để tính gia thua")
    var input: Int? = readLine()?.toInt();
    if (input != null) {
        var giaithua: Int = 1;
        for (i in 1..input) {
            giaithua=giaithua*i;
        }
        print("giai thua cua ${input} là : ${giaithua}")
    }
}