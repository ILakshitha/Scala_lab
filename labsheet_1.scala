object show{
    def area(r:Double):Double = math.Pi*r*r;

    def temperature(c:Double):Double=c*1.8000+32.00;

    def volumeOfSphere(r:Double):Double = 4/3*math.Pi*r*r*r;

    def totalBookPrice(total:Int):Double = 24.95*total;
    def discount(totalAmount:Double):Double= totalAmount*0.4;
    def shipinCost(total:Int):Double= 3*total+(total-50)*0.75;
    def WholeBookPrice(x:Int):Double= totalBookPrice(x)-discount(totalBookPrice(x))+shipinCost(x);

    def runtime(ep1:Double, Tp:Double, ep2:Double):Double=ep1*8+Tp*7+ep2*8;

    def main(args:Array[String])={
        println(f"Area Of Disk : ${area(5.0)}");

        println(f"Temperature Of Fahrenheit : ${temperature(32.0)}");

        println(f"Volume of Sphere : ${volumeOfSphere(5.0)}");

        println(f"Total wholesale cost for 60 copies: ${WholeBookPrice(60)}%1.2f");

         println(s"total running time: ${runtime(2.0,3.0,2.0)}");

    }
}