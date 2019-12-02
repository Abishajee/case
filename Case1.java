package test;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Case1 {

static int room=0;
int h=0;
static Scanner s=new Scanner(System.in);
void CheckStatus(int f)
{
Case newClassObj = new Case();
int[] secondArray = newClassObj.getNumArray();





if(secondArray[f-1]==1)
{

System.out.println("room is booked");

}
else {

System.out.println("room is not booked");

}




}
public static void main(String args[]) throws IOException
{
do {
System.out.println("Menu\n1. Book\n2. Check Status\n3. Exit\nEnter your choice:");

int choice=s.nextInt();

switch(choice)
{
case 2:
  System.out.println("Enter room number");
  int num=s.nextInt();
  Case1 c=new Case1();
  c.CheckStatus(num);
  break;
case 1:Case b=new Case();
  String ac="null";
  String cot="null";
  String cable="null";
  String wifi="null";
  String laundry="null";
  b.book(ac,cot,cable,wifi,laundry);
 
  break;
case 3:
System.exit(0);
break;

default:break;


}
}while(true);


}}

