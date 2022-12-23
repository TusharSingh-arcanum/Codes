import java.util.*;
public class N_Queens {
    public static ArrayList<List<String> > outcome =new ArrayList<List<String> >();
    public static void main(String args[])
    { int n=5;
        outcome.clear();
        for(int i=0;i<n;i++){
        create(n,i);
        }
        //for(int i=0;i<outcome.size();i++){
        System.out.println(outcome);
        //}
    }
    public static void create(int n,int Ridx)
    {
        int a[][]=new int[n][n];
        a[Ridx][0]=1;
        call(a,1);
    }


    public static void call(int a[][],int Cidx)
    {
        if(Cidx==a.length)
        {
            form(a);
            return;
        }
        for(int i=0;i<a.length;i++)
        {
            if(check(a,Cidx,i))
            {
                int b[][]=new int[a.length][a.length];
                for(int m=0;m<a.length;m++)
                {
                    for(int n=0;n<a.length;n++){
                    b[m][n]=a[m][n];}
                }
                b[i][Cidx]=1;
                 rearm2(b,Cidx,i);
                call(b,Cidx+1);
            }
            else
            continue;
            }

    }

public static void rearm2(int a[][],int Cidx,int end)
{
for(int i=0;i<end;i++)
{
    if(a[i][Cidx]==1)
    a[i][Cidx]=0;

}
}

public static void form(int a[][])
{
    List<String> temp=new ArrayList<String>();
    String str="";
    for(int i=0;i<a.length;i++)
    {
        for(int j=0;j<a.length;j++)
        {
            if(a[i][j]==1)
           str=str+"Q";
           else
           str=str+".";
        }
        temp.add(str);
        str="";
    }
    outcome.add(temp);
}

    public static boolean check(int a[][],int Cidx,int Ridx)
    {
        int p=0;
        //horizontal
        for(int i=0;i<a.length;i++)
        {
            if(a[Ridx][i]==1)
            {
                p=1;
                break;
            }
        }
        //vertical
        for(int i=0;i<a.length;i++)
        {
            if(a[i][Cidx]==1)
            {
                p=1;
                break;
            }
        }
//RightDown
int x=Ridx,y=Cidx;
for(;x<a.length&&y<a.length;x++,y++)
{
    if(a[x][y]==1)
    {
        p=1;
        break;
    }
}
//LeftUp
 x=Ridx;y=Cidx;
for(;x>=0&&y>=0;x--,y--)
{
    if(a[x][y]==1)
    {
        p=1;
        break;
    }
}
//RightUp
 x=Ridx;y=Cidx;
for(;x>=0&&y<a.length;x--,y++)
{
    if(a[x][y]==1)
    {
        p=1;
        break;
    }
}
//LeftDown
 x=Ridx;y=Cidx;
for(;x<a.length&&y>=0;x++,y--)
{
    if(a[x][y]==1)
    {
        p=1;
        break;
    }
}
if(p==0)
return true;
else
return false;
    }
}
