import java.util.*;

public class SumList {
    public static void main(String[] args) {
        ArrayList<Double> theList = new ArrayList<Double>();
        theList.add(1.5);
        theList.add(2.0);
        theList.add(3.2);
        theList.add(4.8);
        System.out.println(sumList(theList)); // prints 11.5 (1.5 + 2.0 + 3.2 + 4.8)
    }

    public static double sumList (ArrayList <Double> list){
            //accumulate pattern
            //10 make an accumulator and initialize
            //2) loop though the list one at a time, updating the accumulator as you go
            //3) return the result!
            double sum = 0.0;
            for (int i = 0; i < list.size(); i++){
                sum += list.get(i);
            }
            return sum;
        }

    public static double product (ArrayList <Double> list){

           double product = 1.0;
            for (Double ListItem :list){ //for each loop
                product *= ListItem.doubleValue(); //autounbocing 
            }
        
         return product;
    }

}
