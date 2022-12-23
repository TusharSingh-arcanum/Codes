import java.util.*;
public class SudokuSolver {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char board[][]=new char[9][9];
        for(int i=0;i<9;i++)
   {
       for(int j=0;j<9;j++)
       {
           board[i][j]=sc.next().charAt(0);
       }
   }
        call(board,0,0);

   }
   public static void call(char a[][],int Ridx,int Cidx)
   {
if(Cidx==9 && Ridx==8){
   form(a);
   return;}

if(Cidx==9){
call(a,Ridx+1,0);}
else if(a[Ridx][Cidx]=='.'){
for(int i=1;i<=9;i++)
{
if(check(a,(char)(48+i),Ridx,Cidx))
   {
   char b[][]=new char[9][9];
   for(int m=0;m<9;m++)
   {
       for(int j=0;j<9;j++)
       {
           b[m][j]=a[m][j];
       }
   }
   b[Ridx][Cidx]=(char)(48+i);
   call(b,Ridx,Cidx+1);
   }
   }}
   else
   call(a,Ridx,Cidx+1);
}


public static void form(char a[][])
{
   for(int i=0;i<9;i++)
   {
       for(int j=0;j<9;j++)
       {
           System.out.print(a[i][j]+" ");
       }
       System.out.println();
   }
}

public static boolean check(char a[][],char x,int Ridx,int Cidx)
{
int p=0;
for(int i=0;i<9;i++)
{
   if(a[Ridx][i]==x)
   p=1;
}

for(int i=0;i<9;i++)
{
   if(a[i][Cidx]==x)
   p=1;
}

//1stBlock
if((0<=Ridx)&&(Ridx<=2)&&(0<=Cidx)&&(Cidx<=2))
{
   for(int m=0;m<=2;m++)
   {
       for(int n=0;n<=2;n++)
       {
           if(a[m][n]==x)
           {
               p=1;
               break;
           }
           if(p==1)
           break;
       }
   }
}

//2ndBlock
else if((0<=Ridx)&&(Ridx<=2)&&(3<=Cidx)&&(Cidx<=5))
{
   for(int m=0;m<=2;m++)
   {
       for(int n=3;n<=5;n++)
       {
           if(a[m][n]==x)
           {
               p=1;
               break;
           }
           if(p==1)
           break;
       }
   }
}

//3rdBlock
else if((0<=Ridx)&&(Ridx<=2)&&(6<=Cidx)&&(Cidx<=8))
{
   for(int m=0;m<=2;m++)
   {
       for(int n=6;n<=8;n++)
       {
           if(a[m][n]==x)
           {
               p=1;
               break;
           }
           if(p==1)
           break;
       }
   }
}

//4thBlock
else if((3<=Ridx)&&(Ridx<=5)&&(0<=Cidx)&&(Cidx<=2))
{
   for(int m=3;m<=5;m++)
   {
       for(int n=0;n<=2;n++)
       {
           if(a[m][n]==x)
           {
               p=1;
               break;
           }
           if(p==1)
           break;
       }
   }
}

//5thBlock
else if((3<=Ridx)&&(Ridx<=5)&&(3<=Cidx)&&(Cidx<=5))
{
   for(int m=3;m<=5;m++)
   {
       for(int n=3;n<=5;n++)
       {
           if(a[m][n]==x)
           {
               p=1;
               break;
           }
           if(p==1)
           break;
       }
   }
}

//6thBlock
else if((3<=Ridx)&&(Ridx<=5)&&(6<=Cidx)&&(Cidx<=8))
{
   for(int m=3;m<=5;m++)
   {
       for(int n=6;n<=8;n++)
       {
           if(a[m][n]==x)
           {
               p=1;
               break;
           }
           if(p==1)
           break;
       }
   }
}

//7thBlock
else if((6<=Ridx)&&(Ridx<=8)&&(0<=Cidx)&&(Cidx<=2))
{
   for(int m=6;m<=8;m++)
   {
       for(int n=0;n<=2;n++)
       {
           if(a[m][n]==x)
           {
               p=1;
               break;
           }
           if(p==1)
           break;
       }
   }
}

//8thBlock
else if((6<=Ridx)&&(Ridx<=8)&&(3<=Cidx)&&(Cidx<=5))
{
   for(int m=6;m<=8;m++)
   {
       for(int n=3;n<=5;n++)
       {
           if(a[m][n]==x)
           {
               p=1;
               break;
           }
           if(p==1)
           break;
       }
   }
}

//9thBlock
else if((6<=Ridx)&&(Ridx<=8)&&(6<=Cidx)&&(Cidx<=8))
{
   for(int m=6;m<=8;m++)
   {
       for(int n=6;n<=8;n++)
       {
           if(a[m][n]==x)
           {
               p=1;
               break;
           }
           if(p==1)
           break;
       }
   }
}

if(p==0)
return true;
else
return false;

}
}
