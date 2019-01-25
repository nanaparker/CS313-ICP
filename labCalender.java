

/**
 * @author Nana Kwabena Ofori Parker, Karen Kukua Nkansah
 * @version 1.0.0
 *
 */

import java.util.Date;
import java.text.SimpleDateFormat;


public class labCalender{

    /**
     * This function checks the date provided and provides the Day of the week by extracting it from the Simple Date time format
     * @param help  The help parameter in the 'calConverter' function represents the string to be used.
     * @throws Exception
     */
    public static void calConverter(String help)throws Exception{
        String newString;
        String accumString = "";
        Date date1=new SimpleDateFormat("dd MM yyyy").parse(help);
        newString = date1.toString();

        for(int i = 0; newString.charAt(i)!=' '; i++){
            accumString = accumString + newString.charAt(i);
        }

        if(accumString.equals("Mon")){
            System.out.println("That day is Monday");
        }

        else if(accumString.equals("Tue")){
            System.out.println("That day is Tuesday");
        }

        else if(accumString.equals("Wed")){
            System.out.println("That day is Wednesday");
        }

        else if(accumString.equals("Thu")){
            System.out.println("That day is Thursday");
        }

        else if(accumString.equals("Fri")){
            System.out.println("That day is Friday");
        }

        else if(accumString.equals("Sat")){
            System.out.println("That day is Saturday");
        }

        else if(accumString.equals("Sun")){
            System.out.println("That day is Sunday");
        }

    }

    public static void main(String[] args) throws Exception {
            calConverter("25 01 2019");     //Output is "That day is Friday
    }
}