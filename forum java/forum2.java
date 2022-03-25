import java.util.Scanner;

public class forum2 {
    public static void main(String[] args){
        // printArray();
        // printArrayInStars();
        studentGrades();
    } 

    //machine problem 1
    public static void printArray(){   
        int NUM_ITEMS; //declare
        Scanner input = new Scanner(System.in);//initiate scanner
        
        System.out.println("Enter the number of items: ");
        NUM_ITEMS = input.nextInt(); //array size

        if (NUM_ITEMS < 0){ //positive integers input
            System.out.println("non-negative integers");
        }else{
            int items[] = new int[NUM_ITEMS]; //initiate array
    
            System.out.print("   Enter the value of all items (separated by space): ");
            for(int i=0; i<items.length; i++)  {  //input array items
                items[i]= input.nextInt();  
            } 
        
            System.out.print("The values are: [");
            for (int j : items) {
                System.out.print(j + " "); //output items in array
            }
            System.out.println("]");       
            
            input.close();
        }
    }   
    //machine problem 2
    public static void printArrayInStars(){  
        Scanner input = new Scanner(System.in);//initiate scanner
        int NUM_ITEMS;//declare var

        System.out.println("Enter the number of items: ");//ask array size
        NUM_ITEMS = input.nextInt();

        if (NUM_ITEMS < 0){ //non negative integer
            System.out.println("non-negative integers");
        }else{
            int items[] = new int[NUM_ITEMS];
    
            System.out.print("   Enter the value of all items (separated by space): ");
            for(int i=0; i<items.length; i++)  {  //insert array items
                items[i]= input.nextInt();  
            } 

            for(int i=0;i<items.length;i++){
                System.out.print( i +": "); //numbering scale up accordingly to the array size

                for (int j=0;j<items[i];j++) { //stars
                    System.out.print("*");
                }            
            System.out.println("("+items[i]+")"); //stars graph labeling
            }

        } 
        input.close();
        
    }

    //machine problem 3
    public static void studentGrades(){
        int numStudent;
        double avg;

        Scanner input = new Scanner(System.in); //initaite scanner
        System.out.print("Enter the number of students :");
        numStudent = input.nextInt(); //ask array size

        if (numStudent < 0){
            System.out.println("non-negative integers"); //non negative integers
        }else{
            int grades[] = new int[numStudent]; //initialize array

            //prompts user for the grade
            for (int a=0; a < grades.length; a++){ 
                System.out.print("Enter element" + (a+1) + " : ");
                grades[a] = input.nextInt();
            }
            
            //avg
            int overall = grades.length; //denominator
            Double sum = 0.0;
            for (int value : grades) {
                //numerator
                sum += value;
            }
            avg = sum/overall;

            //min&max
            int min = grades[0]; //declare
            int max = grades[0]; //temporary set to first item in array

            for(int k=0;k<grades.length;k++){
                if (grades[k]<min) min = grades[k]; //shifting numbers. if it found any lower, it sets that as the lowest number
                if (grades[k]>max) max = grades[k]; //same mechanics but the opposite
            }

            System.out.println("The average is: "+avg);
            System.out.println("Maximum value in the array is:" + max);
            System.out.println("Minimum value in the array is:" + min);

        }
        input.close();
    }
}

