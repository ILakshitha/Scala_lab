import scala.compiletime.ops.float
object q2{

    def main(args:Array[String])={
    var a=2;
    var b=3;
    var c=4;
    var d=5;
    var k=4.3f;
    var g=4.0f;


    b-=1;
    println(s"--b*a+c*d-- :${b*a+c*d}");
    d-=1;
    println(s"a++ :${a}");
    a+=1;
    println(s" -2 * (g - k) + c = ${-2 * (g - k) + c}");
    println(s" c++ = $c")
    c += 1
    println(s" ++c * a++ = ${c * a}")
    a += 1;
    }

    
}