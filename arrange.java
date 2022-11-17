package Exercise13;

import java.util.*;


public class arrange 
{
    public static void main(String[] args) 
    {
        // TODO code application logic here
        ArrayList<fruit> f=new ArrayList<>();
        Scanner o=new Scanner(System.in);
        System.out.print("Enter the Number of Fruit Elements: ");
        int no=o.nextInt();
        for(int i=0;i<no;i++)
        {
            System.out.println("Fruit Element: "+(i+1));
            System.out.print("Enter Name of the Furit: ");
            String name=o.next();
            System.out.print("Enter the Quantity: ");
            int qty=o.nextInt();
            System.out.print("Enter the Price: ");
            double price=o.nextDouble();
            f.add(new fruit(name,qty,price));
        }
        System.out.println("\n\nBefore Sorting Fruit Elements: ");
       
        for (fruit fr:f)
        {
            System.out.println(fr.name+" "+fr.qty+" "+fr.price);
        }
        
        Collections.sort(f,new priceCompare());
        
        System.out.println("\n\nAfter Sorting Fruit Elements: ");
        
        for (fruit fr:f)
        {
            System.out.println(fr.name+" "+fr.qty+" "+fr.price);
        }
    } 
}

class fruit 
{
    String name;
    int qty;
    double price;
    fruit(String name,int qty,double price)
    {
        this.name=name;
        this.qty=qty;
        this.price=price;
    }
}

class priceCompare implements Comparator<fruit>
{
    @Override
    public int compare(fruit f1,fruit f2)
    {
        if(f1.price== f2.price)
        {
            return 0;
        }
        else if(f1.price> f2.price)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}