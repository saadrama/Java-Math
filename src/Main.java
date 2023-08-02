public class Main {
    public static void main(String[] args) {
        System.out.println("Today is java math");
        //math.max(a,b)
        //is used to find the ighest value of a and b
        System.out.println(Math.max(4, 7));
        //Math.min(a,b) is used to find the minimum
        System.out.println(Math.min(4,8));
        //Math.sqrt(x)
        System.out.println(Math.sqrt(49));
        //Math.abs(x), this method returns the absolute positive value of x
        System.out.println(Math.abs(-4.7));
        //Random numbers, (Mat.random())
        System.out.println(Math.random());
        int randomNum=(int)(Math.random() * 101);// prints random number between 0 and 100
        System.out.println(randomNum);


    }
}