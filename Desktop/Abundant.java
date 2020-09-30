public class Abundant{ 
public static void main(String[] args){
int n=30;
int sum=0;
int x=n;
for(int i=1;i<=n/2;i++){
if(n%i==0) 
sum=sum+i;
}
if(sum>x) 
System.out.println("Abundant Number");
else
System.out.println("Not a Abundant Number");
}
}