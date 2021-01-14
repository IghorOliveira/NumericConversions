package HexadecimalConverter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Ighor Alves
 */
public class HexaToDecimalMapped {
    //Uses HashMap to convert Hex to Decimal
    public static void main(String args[]){
        //Setting things up
        Scanner myObj = new Scanner(System.in);  
        System.out.println("Enter the hexa number");      
        String userInput=myObj.nextLine().toUpperCase();
        int result=0;
        int aux = 0;
        
        //Prepping HashMap
        Map<Character,Integer> hexMap = new HashMap();
        hexMap.put('0',0);
        hexMap.put('1',1);
        hexMap.put('2',2);
        hexMap.put('3',3);
        hexMap.put('4',4);
        hexMap.put('5',5);
        hexMap.put('6',6);
        hexMap.put('7',7);
        hexMap.put('8',8);
        hexMap.put('9',9);
        hexMap.put('A',10);
        hexMap.put('B',11);
        hexMap.put('C',12);
        hexMap.put('D',13);
        hexMap.put('E',14);
        hexMap.put('F',15);
        
        //Loop to convert to decimal
        for(int i = userInput.length()-1; i>=0; i--){
            //Gets the integer value of the hex digit by using the map
            int decimalValue= hexMap.get(userInput.charAt(i));
            //adds it to the result
            result+=(int) (Math.pow(16,aux)*decimalValue);
            System.out.println("Processing: (16^"+aux+")x"+decimalValue+"= "+(int) (Math.pow(16,aux)*decimalValue));
            aux++;
        }
        //show the final result
        System.out.println("Result: "+result);
    }
}
