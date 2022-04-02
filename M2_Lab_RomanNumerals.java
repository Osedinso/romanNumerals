/*
 *M2:Lab3
  Jeremy Richard-Ikediashi & Kamsiyochukwu Uwah
  2/13/2022
 */
import java.util.*;
public class M2_Lab_RomanNumerals {
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        String prompt = "\nPlease enter any number in the range of 1 to 999\n";
            prompt+= "IF you want 325, simply type 325 and press enter\n\n-->";
        System.out.println(prompt);
        int number = keyboard.nextInt();
        if(number<1||number>999){
            System.out.println("\nEntered value is not in the accepted range");
            System.exit(1);
        }
        else{
            
        }
        
        int units_digit = number%10;
        int second_number= number/10;
        int tens_digit = second_number%10;
        int third_number = second_number/10;
        int hundred_digit= third_number%10;
        System.out.println("The isolated digits are "+hundred_digit+" "+tens_digit+
                " "+units_digit);
        String romanNumeral="";
        
        switch(hundred_digit){
            case 1:
                romanNumeral+="C";
                break;
            case 2:
                romanNumeral+="CC";
                break;
            case 3:
                romanNumeral+="CCC";
                break;
            case 4:
                romanNumeral+="CD";
                break;
            case 5:
                romanNumeral+="D";
                break;
            case 6:
                romanNumeral+="DC";
                break;
            case 7:
                romanNumeral+="DCC";
                break;
            case 8:
                romanNumeral+="DCCC";
                break;
            case 9:
                romanNumeral+="CM";
                break;
        }
        
        switch(tens_digit){
            case 1:
                romanNumeral+="X";
                break;
            case 2:
                romanNumeral+="XX";
                break;
            case 3:
                romanNumeral+="XXX";
                break;
            case 4:
                romanNumeral+="XL";
                break;
            case 5:
                romanNumeral+="L";
                break;
            case 6:
                romanNumeral+="LX";
                break;
            case 7:
                romanNumeral+="LXX";
                break;
            case 8:
                romanNumeral+="LXXX";
                break;
            case 9:
                romanNumeral+="XC";
                break;
        }
        
        switch(units_digit){
            case 1:
                romanNumeral+="I";
                break;
            case 2:
                romanNumeral+="II";
                break;
            case 3:
                romanNumeral+="III";
                break;
            case 4:
                romanNumeral+="IV";
                break;
            case 5:
                romanNumeral+="V";
                break;
            case 6:
                romanNumeral+="VI";
                break;
            case 7:
                romanNumeral+="VII";
                break;
            case 8:
                romanNumeral+="VIII";
                break;
            case 9:
                romanNumeral+="IX";
                break;
        }
        
        
        
        System.out.println("The value of "+number+" in roman numerals is "+romanNumeral);
    }
    
}
