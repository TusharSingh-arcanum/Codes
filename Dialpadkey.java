import java.util.Scanner;

public class Dialpadkey
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next(),s2[] =new String[s1.length()]; 
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
        switch(ch){
                    case '2':s2[i]="abc";break;
                    case '3':s2[i]="def";break;
                    case '4':s2[i]="ghi";break;
                    case '5':s2[i]="jkl";break;
                    case '6':s2[i]="mno";break;
                    case '7':s2[i]="pqrs";break;
                    case '8':s2[i]="tuv";break;
                    case '9':s2[i]="wxyz";break;           
                }
        }
        // System.out.println(s2[0]);
        // System.out.println(s2[1]);
        combinations(s2,"",0);
        sc.close();
    }
    public static void combinations(String ar[],String newStr,int ArrIdx)
    {
        if(ArrIdx == (ar.length))
        {
            System.out.println(newStr);
            return;
        }
        for(int i=0;i<ar[ArrIdx].length();i++)
        {
       combinations(ar,newStr+ar[ArrIdx].charAt(i),ArrIdx+1);
        }
                  
        
    }
}