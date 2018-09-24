import java.util.Scanner;

public class bmi {

    public static void main(String[]args){

        Scanner keyboard;
        String name;
        int weight,height;
        float weight1,height1,total,bmi;




        keyboard=new Scanner(System.in);
        System.out.println("Give your name");
        name= keyboard.nextLine();
        System.out.println(" Hello "+name+"  ");
        System.out.println("Give your height(inches)");
        height=keyboard.nextInt();
        System.out.println(""+height+"");
        System.out.println("Now that we have your height we need your weight, what is your weight(pounds)");
        weight=keyboard.nextInt();
        System.out.println("Thank you for your weight:"+weight+"");
        System.out.println("I am now going to calculate your BMI "+name+"");






        System.out.println("The new height is " +(height*0.0254));
        System.out.println("The new weight is " +(weight*0.45359237));
        System.out.println("put the new weight. ");
        weight1=keyboard.nextFloat();
        System.out.println("put the new height.");
        height1=keyboard.nextFloat();
        System.out.println("Now I'm going to divide the weight and height");
        System.out.println(weight1/height1);
        total=weight1/height1;
        System.out.println("Now we divide that by the height again.");
        System.out.println(total/height1);
        bmi=total/height1;
        System.out.println("your bmi is "+bmi+".");









    }






}
