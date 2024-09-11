import java.util.*;
class Node
{
int data;
Node next;
Node(int x)
{
data=x;
next=null;
}
}
class Singlelist
{
Node head,tail;
Singlelist()
{
head=tail=null;
}
void create(int x)
{
Node n=new Node(x);
if(head==null)
{
head=tail=n;
}
else
{
tail.next=n;
tail=n;
}
}
void display()
{
if(head==null)
{
System.out.println("List is Empty");
return;
}
Node temp=head;
while(temp!=null)
{
System.out.println(temp.data+" ");
temp=temp.next;
}
}
void Insertfirst(int x)
{
Node n=new Node(x);
if(head==null)
head=tail=n;
else
n.next=head;
head=n;
}
void insertAny(int x,int pos)
{
Node n=new Node(x);
Node temp;
if(head==null)
{
head=tail=n;
}
else
temp=head;
int count=2;
while (count<pos && temp.next!=null)
{
count=count+1;
temp=temp.next;
if(temp.next==null)
{
temp.next=n;
tail=n;
}
else
{
n.next=temp.next;
temp.next=n;
}
}
}
void Deletefirst()
{
if(head==null)
{
System.out.println("List is empty");
return ;
}
System.out.println(head.data+" is deleted");
head=head.next;
}
void DeleteLat()
{
if(head==null)
{
System.out.println("List is empty");
return;
}
Node temp=head;
if(temp.next==null)
{
System.out.println(temp.data+ " is deleted");
head=tail=null;
return ;
}
while(temp.next!=null)
temp=temp.next;
System.out.println(temp.next.data+" is deleted");
temp.next=null;
tail=temp;
}
}
void Deleteany(int x,int pos)
{
if(head==null)
{
System.out.println("List is empty");
return;
}
Node temp=head;
int count=2;
if(temp.next==null)
{
System.out.println(temp.data+" is deleted");
head=tail=null;
return;
}
while(Count<pos && temp.next.next!=null)
count=count+1;
temp=temp.next;
if(temp.next.next==null)
{
System.out.println(temp.next.data+" is deleted");
temp.next=null;
tail=temp;
}
else
{
System.out.println(temp.next.data+" is deleted");
Node temp1=temp.next;
temp.next=temp.next.next;
temp1.next=null;
}
}
class SLL
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
Singlelist s1=new Singlelist();
for(;;)
{
System.out.println();
System.out.println("1.Create\n2.Display\n3.Insertfirst\n4.insertAny5.Deletefirst6.DeleteLat7.Deleteany8.Exit\n");
System.out.println("Enter your choice:");
int ch=s.nextInt();
if(ch==1)
{
int x;
System.out.println("Enter an element:");
x=s.nextInt();
s1.create(x);
}
else if(ch==2)
{
s1.display();
}
else if(ch==3)
break;
else
System.out.println("Invalid choice");
}
}
}
