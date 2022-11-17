package Exercise13;
import java.util.*;

public class add_and_remove_stars 
{
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        add_and_remove_stars c=new add_and_remove_stars();
        ArrayList<String> list=new ArrayList<>();
        
        System.out.print("Enter the Number of Elements: ");
        int no=obj.nextInt();
        
        System.out.println("Enter Elements:");
        obj.nextLine();
        
        for(int i=0;i<no;i++)
        {
            System.out.print((i+1)+". ");
            String a=obj.nextLine();
            list.add(i, a);
        }
        
        OUTER:
        while (true)
        {
            System.out.println("1.Add Star\t\t2.Remove Star\t\t3.Exit");
            System.out.print("Enter Your Choice:");
            int choice=obj.nextInt();
            switch (choice) 
            {
                case 1 -> c.addstar(list);
                case 2 -> c.removestar(list);
                default -> 
                {
                    break OUTER;
                }
            }
        }
        
        System.out.println("Successfully Done!!!!");
    }
    
    public ArrayList addstar(ArrayList a)
    {
        for(int i=0;i<a.size();i+=2)
        {
            a.add(i, "*");
        }
        System.out.println("Elements after Adding Star: "+a);
        return a;
    }
    
    public ArrayList removestar(ArrayList a)
    {
        for(int i=0;i<a.size();i++)
        {
            a.remove(i);
        }
        System.out.println("Elements after Removing Star: "+a);
        return a;
    }
}