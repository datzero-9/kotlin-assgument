fun main() {
    println("hãy nhập tháng để biết quý mấy")
    var input:Int? = readLine()?.toInt();
    var check = when(input){
        1,2,3 -> "Đây là quý 1"
        4,5,6 -> "Đây là quý 2"
        7,8,9 -> "Đây là quý 3"
        10,11,12 -> "Đây là quý 4"
        else ->"Tháng này là tháng tào lao"
    }
    println(check);
}