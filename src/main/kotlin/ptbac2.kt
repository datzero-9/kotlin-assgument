import kotlin.math.sqrt

fun main() {
    println("nhap so a")
    var a: Double? = readLine()?.toDouble();
    println("nhap so b");
    var b: Double? = readLine()?.toDouble();
    println("nhap so c");
    var c: Double? = readLine()?.toDouble();
    if (a != null && b != null && c != null) {
        if (a == 0.0) {
            println("day la pt bac 1")
        } else {
            var delta = (b * b) - (4 * a * c);
            if (delta < 0) {
                println("phuong trinh vo nghiem");
            } else {
                if (delta == 0.0) {
                    println("phuong trinh co nghiem kep: ${-b / 2 * a}")
                } else {
                    println(
                        "phương trình có nghiệm riêng biệt: x1=${(-b + sqrt(delta)) / 2 * a} và x2=${
                            (-b - sqrt(
                                delta
                            )) / 2 * a
                        }"
                    )
                }
            }
        }
    }
}