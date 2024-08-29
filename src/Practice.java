@FunctionalInterface
interface  A
{
   String B(String a, String c);
  //  String C(String a, String c);
}
class Practice
{
    public static void main(String[] args) {
        A obj = (a,d) ->  a+d;
        System.out.println(obj.B("t","r"));
    }
}