import java.util.Scanner;

class GFG {
    static int t=0;
    public static int SumOfN(int n,int c){
        if(c==n+1){
            return 0;
        }
        else{
            if(c!=1){
                t=t+c;
                c=c+1;
            }
            else{
                t=t+c;
                c=c+1;
            }
        }
        SumOfN(n,c);
        return t;
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        int res=SumOfN(n,1);
        System.out.print(res);
        
    }
}