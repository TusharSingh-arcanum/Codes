import java.util.*;
public class SubsetOfFirstNatural {
    public static ArrayList<String> result =new ArrayList<String>();
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
call(x,"");
for(int i=0;i<result.size();i++){
System.out.println(result.get(i)+"");}

    }
    public static void call(int x,String str)
    {
if(x==0)
{
    result.add(str);
    return;
}
call(x-1,str+x);
call(x-1,str);
    }
}
