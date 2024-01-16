fun main() {
    println("nhap so a")
    var a: Double? = readLine()?.toDouble();
    println("nhap so b");
    var b: Double? = readLine()?.toDouble();
    if (a != null && b != null) {
        if (a == 0.0) {
            println("phuong trinh vo nghiem")
        } else {
            println("phuong trinh co nghiẹm x = ${-b / a}")
        }
    }

}