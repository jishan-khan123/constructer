/*Create a User system:

user ka name, email, password
constructor se initialize karo
ek method ho jo user details show kare (password hide karke)*/



class user{
String name;
String clases;
int Rollum;
String caste;


user(String n,String c,int r,String d){
name = n;
clases = c;
Rollum = r;
caste = d;
return;
}

 void display(){
    System.out.println( " Stdent Name " + name);
    System.out.println( " Stdent Clases " + clases );
    System.out.println( " Stdent Roll num " + Rollum);
    System.out.println( " Stdent Religion " + caste);
 }
}
public class constructer {
public static void main(String[] args) {

user A1 = new user("jishan khan","12th",10,"momdon");
A1.display();
   
}
    
}
