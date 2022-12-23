import java.util.Scanner;

public class FirstToLastBoxChessboard {
   static int a,b,count;
    public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
a=sc.nextInt();
b=sc.nextInt();
count =0;
find(1,1);
System.out.println(count);
sc.close();
}
public static void find(int x,int y)
{ 
    if((x==a)&&(y==b)){
count++;
return;
}
if((x>a)||(y>b))
return;
find(x+1,y);
find(x,y+1);
}
}
